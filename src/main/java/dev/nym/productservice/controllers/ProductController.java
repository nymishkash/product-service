package dev.nym.productservice.controllers;


import dev.nym.productservice.models.Product;
import dev.nym.productservice.services.FakeStoreProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/products")
public class ProductController {

    private final FakeStoreProductService fakeStoreProductService;

    ProductController(FakeStoreProductService fakeStoreProductService) {
        this.fakeStoreProductService = fakeStoreProductService;
    }

    @GetMapping("/products")
    public Product[] getAllProducts() {
        return fakeStoreProductService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return fakeStoreProductService.getProductById(id);
    }

    @GetMapping("/products/categories")
    public String[] getAllCategories() {
        return fakeStoreProductService.getAllCategories();
    }

    @GetMapping("/products/category/{category}")
    public Product[] getProductsByCategory(@PathVariable("category") String category) {
        return fakeStoreProductService.getProductsByCategory(category);
    }

    @GetMapping("/products?limit={num}")
    public Product[] getProductsInLimit(@PathVariable("num") Integer num) {
        return fakeStoreProductService.getProductsInLimit(num);
    }



    @PostMapping("/products")
    public Product createProduct(Product product) {
        return fakeStoreProductService.createProduct(product);
    }

}
