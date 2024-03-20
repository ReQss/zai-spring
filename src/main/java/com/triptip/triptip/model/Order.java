package com.triptip.triptip.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    private int orderId;
    private int userId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate orderDate;
    private double orderPrice;
    @JoinColumn(name = "address_id")
    private int addressId;
    private int statusId;

}
