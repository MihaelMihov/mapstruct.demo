package com.mish.mapstruct.demo.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "makeup_product")
@Getter
@Setter
public class MakeupProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "identifier")
    private String identifier;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "brand")
    private String brand;

    @Column(name = "category")
    private String category;

    @Column(name = "shade")
    private String shade;

    @Column(name = "price")
    private Double price;

    @Column(name = "quantity_available")
    private Integer quantityAvailable;

    @Column(name = "description")
    private String description;

}