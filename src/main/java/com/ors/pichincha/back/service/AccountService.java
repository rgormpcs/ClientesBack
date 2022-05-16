/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ors.pichincha.back.service;

import com.ors.pichincha.back.entity.Account;
import com.ors.pichincha.back.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ors.pichincha.back.entity.Client;
import com.ors.pichincha.back.repository.AccountRepository;

/**
 *
 * @author rortiz
 */
@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;
    
    public Account save(Account account){
        return accountRepository.save(account);
    }
    
}
