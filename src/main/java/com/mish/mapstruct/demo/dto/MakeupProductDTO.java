package com.mish.mapstruct.demo.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MakeupProductDTO {
    @NotBlank
    private String productName;
    private String identifier;
    @NotBlank
    private String brand;
    @NotBlank
    private String category;
    @NotBlank
    private String shade;
    @DecimalMin(value = "1", message = "Value must be greater than or equal to 1")
    private Double price;
    @NotNull
    private Integer quantityAvailable;
    @NotBlank
    private String description;

}