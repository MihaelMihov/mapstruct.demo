package com.mish.mapstruct.demo.mapper;


import com.mish.mapstruct.demo.domain.MakeupProduct;
import com.mish.mapstruct.demo.dto.MakeupProductDTO;
import com.mish.mapstruct.demo.dto.MakeupProductUpdateDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface MakeupProductMapper {
    @Mapping(target = "identifier", expression = "java(java.util.UUID.randomUUID().toString())")
    @Mapping(target = "productId", ignore = true)
    MakeupProduct toMakeupProduct(MakeupProductDTO makeupProductDTO);

    MakeupProductDTO toMakeupProductDto(MakeupProduct makeupProduct);

    @Mapping(target = "productId", ignore = true)
    void updateCarFromDto(MakeupProductUpdateDTO makeupProductUpdateDTO,
                          @MappingTarget MakeupProduct makeupProduct);

}
