/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ors.pichincha.back.repository;

import com.ors.pichincha.back.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author rortiz
 */
public interface AccountRepository extends JpaRepository<Account, Long>{
    
}
