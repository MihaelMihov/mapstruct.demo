package com.mish.mapstruct.demo.service;

import com.mish.mapstruct.demo.domain.MakeupProduct;
import com.mish.mapstruct.demo.dto.MakeupProductDTO;
import com.mish.mapstruct.demo.dto.MakeupProductUpdateDTO;
import com.mish.mapstruct.demo.mapper.MakeupProductMapper;
import com.mish.mapstruct.demo.repository.MakeupProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class MakeupService {

    private final MakeupProductRepository makeupProductRepository;
    private final MakeupProductMapper makeupProductMapper;

    public ResponseEntity<MakeupProductDTO> addMakeupProduct(MakeupProductDTO makeupProductDTO) {
        MakeupProduct makeupProduct = makeupProductMapper.toMakeupProduct(makeupProductDTO);
        MakeupProduct response = makeupProductRepository.save(makeupProduct);
        return ResponseEntity.ok(makeupProductMapper.toMakeupProductDto(response));
    }

    public ResponseEntity<MakeupProductDTO> updateMakeupProduct(MakeupProductUpdateDTO makeupProductUpdateDTO) {
        Optional<MakeupProduct> makeupProductOptional =
                makeupProductRepository.findByIdentifier(makeupProductUpdateDTO.getIdentifier());
        if(makeupProductOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        makeupProductMapper.updateCarFromDto(makeupProductUpdateDTO, makeupProductOptional.get());
        MakeupProductDTO result = makeupProductMapper.toMakeupProductDto(makeupProductOptional.get());
        return ResponseEntity.ok(result);
    }
}
