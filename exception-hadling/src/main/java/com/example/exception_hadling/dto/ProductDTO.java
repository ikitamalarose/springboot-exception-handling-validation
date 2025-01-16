package com.example.exception_hadling.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@NoArgsConstructor
public class ProductDTO {
    private Long id;
    private ZonedDateTime dateTime;
    private String reference;
    private String name;
    private int stockAlert;
    private int quantity;
    private float purchasePrice;
    private float salePrice;
    private boolean isBelowStockAlert;

    public ProductDTO(String reference, String name, int stockAlert, int quantity, float purchasePrice, float salePrice) {
        this.reference = reference;
        this.name = name;
        this.stockAlert = stockAlert;
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
        this.salePrice = salePrice;
    }
}
