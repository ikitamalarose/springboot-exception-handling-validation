package com.example.exception_hadling.mapper;


import com.example.exception_hadling.dto.ProductDTO;
import com.example.exception_hadling.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDTO toDTO(Product product);

    Product toEntity(ProductDTO productDTO);

    @Mapping(target = "id", ignore = true)
    void updateEntityFromDTO(ProductDTO productDTO, @MappingTarget Product product);
}
