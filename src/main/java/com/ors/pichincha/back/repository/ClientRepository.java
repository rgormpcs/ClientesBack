/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ors.pichincha.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ors.pichincha.back.entity.Client;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public interface ClientRepository extends  JpaRepository<Client, Long>{

}
