package com.tns.ifet.shoppingsystem.productmodule.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tns.ifet.shoppingsystem.productmodule.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

