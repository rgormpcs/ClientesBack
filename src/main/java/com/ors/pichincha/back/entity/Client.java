/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ors.pichincha.back.entity;

import java.util.List;
import javax.annotation.Generated;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import lombok.Data;

/**
 *
 * @author Ricardo
 */
@Entity
@Data
public class Client extends Person{
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String password;
    private String state;
    @OneToMany(mappedBy = "client")
    private List<Account> accountList;

    public Client(String password, String state, Long idPerson, String name, String gender, Integer age, Integer indentification, String direction, String phoneNumber) {
        super(idPerson, name, gender, age, indentification, direction, phoneNumber);
        this.password = password;
        this.state = state;
    }

    
    public Client() {
    }

    
}
