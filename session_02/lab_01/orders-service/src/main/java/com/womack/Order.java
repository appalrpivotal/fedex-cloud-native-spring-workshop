package com.womack;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@lombok.ToString
@Entity
@Data
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    private String orderNumber;
    private String customerName;

    public Order(String orderNumber, String customerName) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
    }

}
