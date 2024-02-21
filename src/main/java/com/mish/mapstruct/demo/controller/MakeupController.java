package com.mish.mapstruct.demo.controller;


import com.mish.mapstruct.demo.dto.MakeupProductDTO;
import com.mish.mapstruct.demo.dto.MakeupProductUpdateDTO;
import com.mish.mapstruct.demo.service.MakeupService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MakeupController {

    private final MakeupService makeupService;
    @PostMapping("/products")
    public ResponseEntity<MakeupProductDTO> addMakeupProduct(
            @Valid @RequestBody MakeupProductDTO makeupProductDTO) {
      return makeupService.addMakeupProduct(makeupProductDTO);
    }

    @PatchMapping("/products")
    public ResponseEntity<MakeupProductDTO> updateMakeupProduct(
            @Valid @RequestBody MakeupProductUpdateDTO makeupProductUpdateDTO) {
        return makeupService.updateMakeupProduct(makeupProductUpdateDTO);
    }


}
