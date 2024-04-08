package dev.nym.productservice.interfaces;

import dev.nym.productservice.dtos.FakeStoreProductDto;
import dev.nym.productservice.models.Product;

import java.util.List;

public interface ProductService {
    FakeStoreProductDto getProductById(Long id);
    FakeStoreProductDto[] getAllProducts();
    String[] getAllCategories();
    FakeStoreProductDto[] getProductsByCategory(String category);
    FakeStoreProductDto[] getProductsInLimit(String num);
}
