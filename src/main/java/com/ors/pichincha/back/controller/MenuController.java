/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ors.pichincha.back.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import com.ors.pichincha.back.entity.Menu;
import com.ors.pichincha.back.service.MenuService;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ricardo
*/
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    MenuService menuService;
    
    @GetMapping("/all")
    public ResponseEntity<List<Menu>> getAll(){
        try {
            return new ResponseEntity<List<Menu>>(menuService.findAll(),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping
    public ResponseEntity<Menu> post(@RequestBody Menu menu) {
        try {
            return new ResponseEntity<>(menuService.save(menu),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    
}
