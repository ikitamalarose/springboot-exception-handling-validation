package com.example.exception_hadling.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private ZonedDateTime dateTime;

    @Column(nullable = false, unique = true)
    private String reference;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int stockAlert;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private float purchasePrice;

    @Column(nullable = false)
    private float salePrice;

    @Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT false")
    private boolean isBelowStockAlert;

    public Product(String reference, String name, int stockAlert, int quantity, float purchasePrice, float salePrice) {
        this.reference = reference;
        this.name = name;
        this.stockAlert = stockAlert;
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }
}
