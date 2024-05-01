package dev.nym.productservice.interfaces;

import dev.nym.productservice.dtos.FakeStoreProductDto;
import dev.nym.productservice.models.Product;

public interface ProductService {
    Product getProductById(Long id);
    Product[] getAllProducts();
    String[] getAllCategories();
    Product[] getProductsByCategory(String category);
    Product[] getProductsInLimit(Integer num);


    Product createProduct (Product product);
}
