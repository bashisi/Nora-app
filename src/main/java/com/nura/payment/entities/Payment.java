package com.nura.payment.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payments")
public class Payment {
    @Id
    private Long id;
    private Double amount;
    private String currency;
    private String status;

    // Getters and Setters
}