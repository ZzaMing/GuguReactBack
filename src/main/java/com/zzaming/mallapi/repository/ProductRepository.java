package com.zzaming.mallapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zzaming.mallapi.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
