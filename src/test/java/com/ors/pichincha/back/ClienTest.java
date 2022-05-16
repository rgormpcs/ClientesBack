/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ors.pichincha.back;

import com.ors.pichincha.back.entity.Client;
import com.ors.pichincha.back.service.ClientService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

/**
 *
 * @author rortiz
 */
@SpringBootTest
public class ClienTest {
    
    @Autowired
    ClientService clientService;
    
    @Test
    public void save(){
        Assertions.assertEquals(new Client(1L,"123","activo",null,1L,"Ricardo Ortiz","M",33,1722451383,"carapungo","0999999999"),clientService.save(new Client(1L,"123","activo",null,1L,"Ricardo Ortiz","M",33,1722451383,"carapungo","0999999999")));
    }
    
    
}
