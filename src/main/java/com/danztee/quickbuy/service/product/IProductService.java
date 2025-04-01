package com.danztee.quickbuy.service.product;

import com.danztee.quickbuy.model.Product;
import com.danztee.quickbuy.request.AddProductRequest;
import com.danztee.quickbuy.request.ProductUpdateRequest;

import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest product);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product updateProduct(ProductUpdateRequest product, Long productId);
    void deleteProduct(Long id);
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String brand, String name);
}
