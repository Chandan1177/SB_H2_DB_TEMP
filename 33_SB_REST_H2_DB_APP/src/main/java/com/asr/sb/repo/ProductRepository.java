package com.asr.sb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asr.sb.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
