/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ors.pichincha.back.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author Ricardo
 */
@Entity
@Data
public class Person {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idPerson;
    private String name;
    private String gender;
    private Integer age;
    private Integer indentification;
    private String direction;
    private String phoneNumber;

    public Person(Long idPerson, String name, String gender, Integer age, Integer indentification, String direction, String phoneNumber) {
        this.idPerson = idPerson;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.indentification = indentification;
        this.direction = direction;
        this.phoneNumber = phoneNumber;
    }

    public Person() {
    }
    
    

  
    
    
    
}
