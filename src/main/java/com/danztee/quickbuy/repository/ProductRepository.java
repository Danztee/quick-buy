package com.danztee.quickbuy.repository;

import com.danztee.quickbuy.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    static List<Product> findByCategoryName(String category) {
    }

    static List<Product> findByBrand(String brand) {
    }

    static List<Product> findByCategoryNameAndBrand(String category, String brand) {
    }

    static List<Product> findByName(String name) {
    }

    static List<Product> findByBrandAndName(String brand, String name) {
    }

    static Long countByBrandAndName(String brand, String name) {
    }
}
