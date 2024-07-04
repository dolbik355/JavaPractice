package com.github.resalner.javapractice.model;

import jakarta.persistence.*;

@Entity
@Table(name = "OrderItems")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Long id;

    @Column(name = "order_id")
    private Long orderId;
    @OneToOne
    @JoinColumn(name = "product_id")
    private Product productId;

    @Column(name = "count")
    private Integer count;

    @Column(name = "price")
    private Double price;
}