package com.huskyhehe.onlinestorebackend.repository;

import com.huskyhehe.onlinestorebackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
