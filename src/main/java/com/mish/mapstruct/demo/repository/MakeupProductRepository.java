package com.mish.mapstruct.demo.repository;


import com.mish.mapstruct.demo.domain.MakeupProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MakeupProductRepository extends JpaRepository <MakeupProduct, Long> {
   Optional<MakeupProduct> findByIdentifier(String identifier);
}
