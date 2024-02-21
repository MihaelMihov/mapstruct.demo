package com.mish.mapstruct.demo.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MakeupProductUpdateDTO {
    @NotBlank
    private String identifier;
    private String productName;
    private String brand;
    private String category;
    private String shade;
    private Double price;
    private Integer quantityAvailable;
    private String description;
}
