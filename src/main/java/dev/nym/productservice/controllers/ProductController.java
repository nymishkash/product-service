package dev.nym.productservice.controllers;


import dev.nym.productservice.dtos.FakeStoreProductDto;
import dev.nym.productservice.models.Product;
import dev.nym.productservice.services.FakeStoreProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/products")
public class ProductController {

    private FakeStoreProductService fakeStoreProductService;

    ProductController(FakeStoreProductService fakeStoreProductService) {
        this.fakeStoreProductService = fakeStoreProductService;
    }

    @GetMapping("/products")
    public FakeStoreProductDto[] getAllProducts() {
        return fakeStoreProductService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public FakeStoreProductDto getProductById(@PathVariable("id") Long id) {
        return fakeStoreProductService.getProductById(id);
    }

    @GetMapping("/products/categories")
    public String[] getAllCategories() {
        return fakeStoreProductService.getAllCategories();
    }

    @GetMapping("/products/category/{category}")
    public FakeStoreProductDto[] getProductsByCategory(@PathVariable("category") String category) {
        return fakeStoreProductService.getProductsByCategory(category);
    }

    @GetMapping("/products?limit={num}")
    public FakeStoreProductDto[] getProductsInLimit(@PathVariable("num") String num) {
        return fakeStoreProductService.getProductsInLimit(num);
    }

}
