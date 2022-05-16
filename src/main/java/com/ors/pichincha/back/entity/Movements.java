
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ors.pichincha.back.entity;

import javax.annotation.Generated;
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
public class Movements {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idMovements;
    private String date;
    private String movementType;
    private Double value;
    private Double Balance;
    private Boolean estate;

    public Movements(Long idMovements, String date, String movementType, Double value, Double Balance, Boolean estate) {
        this.idMovements = idMovements;
        this.date = date;
        this.movementType = movementType;
        this.value = value;
        this.Balance = Balance;
        this.estate = estate;
    }

    public Movements() {
    }
    
    
    
}
