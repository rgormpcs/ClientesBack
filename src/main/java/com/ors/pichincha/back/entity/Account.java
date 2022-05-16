/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ors.pichincha.back.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;

/**
 *
 * @author Ricardo
 */
@Entity
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  idAccount;
    private Integer accountNumber;
    private String accountType;
    private Double inicialBalance;
    private Boolean state;
    @ManyToOne
    @JoinColumn(name = "idPerson")
    private Client client;

    public Account(Long idAccount, Integer accountNumber, String accountType, Double inicialBalance, Boolean state) {
        this.idAccount = idAccount;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.inicialBalance = inicialBalance;
        this.state = state;
    }

    public Account() {
    }
      
        
}
