package com.tekkudojo.ecommerce.dao;

import com.tekkudojo.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
