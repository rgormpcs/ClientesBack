/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ors.pichincha.back.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

/**
 *
 * @author Ricardo
 */
@Entity
@Data
public class Client extends Person{
    
    private Long idClient;
    private String password;
    private String state;
    @OneToMany(mappedBy = "client")
    @JsonIgnore
    private List<Account> accountList;

    public Client(Long idClient, String password, String state, List<Account> accountList, Long idPerson, String name, String gender, Integer age, Integer indentification, String direction, String phoneNumber) {
        super(idPerson, name, gender, age, indentification, direction, phoneNumber);
        this.idClient = idPerson;
        this.password = password;
        this.state = state;
        this.accountList = accountList;
    }

   

    
    public Client() {
    }

    
}
