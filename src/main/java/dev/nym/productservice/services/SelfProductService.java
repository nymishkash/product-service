package dev.nym.productservice.services;

import dev.nym.productservice.dtos.FakeStoreProductDto;
import dev.nym.productservice.exceptions.ProductNotFoundException;
import dev.nym.productservice.interfaces.ProductService;
import dev.nym.productservice.models.Product;
import dev.nym.productservice.repositories.ProductRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Primary
public class SelfProductService implements ProductService {

    private ProductRepository productRepository;

    SelfProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product getProductById(Long id) {
        Optional<Product> optionalProduct = productRepository.findById(id);

        if (optionalProduct.isEmpty()){
            throw new ProductNotFoundException(id, "Product not found");
        }

        Product product = optionalProduct.get();

        return product;
    }

    @Override
    public Product[] getAllProducts() {
        return new Product[0];
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public String[] getAllCategories() {
        return new String[0];
    }

    @Override
    public Product[] getProductsByCategory(String category) {
        return new Product[0];
    }

    @Override
    public Product[] getProductsInLimit(Integer num) {
        return new Product[0];
    }
}
