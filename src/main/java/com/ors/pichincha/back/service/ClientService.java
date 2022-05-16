/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ors.pichincha.back.service;

import com.ors.pichincha.back.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ors.pichincha.back.entity.Client;
import java.util.List;

/**
 *
 * @author rortiz
 */
@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;
    
    public Client save(Client client){
        return clientRepository.save(client);
    }
    
    public Client update(Client client){
        return clientRepository.save(client);
    }
    public List<Client> getAll(){
     return clientRepository.findAll();
    }
}
