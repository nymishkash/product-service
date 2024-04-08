package dev.nym.productservice.services;

import dev.nym.productservice.dtos.FakeStoreProductDto;

import java.util.List;

public interface ProductService {
    FakeStoreProductDto getProductById(Long id);
    FakeStoreProductDto[] getAllProducts();
}
