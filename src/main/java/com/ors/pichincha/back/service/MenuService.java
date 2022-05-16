/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ors.pichincha.back.service;

import com.ors.pichincha.back.repository.MenuRepository;
import com.ors.pichincha.back.entity.Menu;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ricardo
 */
@Service
public class MenuService {

    @Autowired
    MenuRepository menuRepository;

    public List<Menu> findAll() {
        return menuRepository.findAll();
    }
    public Menu save(Menu menu){
        return menuRepository.save(menu);
    }

}
