package dev.nym.productservice.services;


import dev.nym.productservice.dtos.FakeStoreProductDto;
import dev.nym.productservice.exceptions.ProductNotFoundException;
import dev.nym.productservice.interfaces.ProductService;
import dev.nym.productservice.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public
class FakeStoreProductService implements ProductService {

    Product product = new Product();

    @Override
    public FakeStoreProductDto getProductById(Long id) {
        RestTemplate restTemplate = new RestTemplate();
                FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject("https://fakestoreapi.com/products/" + id,
                FakeStoreProductDto.class);

        if (fakeStoreProductDto == null){
            throw new ProductNotFoundException(id, "Product not found!");
        }

        return fakeStoreProductDto;
    }

    @Override
    public FakeStoreProductDto[] getAllProducts() {
        RestTemplate restTemplate = new RestTemplate();
                FakeStoreProductDto[] fakeStoreProductDto = restTemplate.getForObject("https://fakestoreapi.com/products",
                FakeStoreProductDto[].class);

        return fakeStoreProductDto;
    }

    @Override
    public String[] getAllCategories() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://fakestoreapi.com/products/categories",
                String[].class);
    }

    @Override
    public FakeStoreProductDto[] getProductsByCategory(String category) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://fakestoreapi.com/products/category/" + category,
                FakeStoreProductDto[].class);
    }

    @Override
    public FakeStoreProductDto[] getProductsInLimit(String num) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://fakestoreapi.com/products?limit=" + num,
                FakeStoreProductDto[].class);
    }
//    product.setId(fakesStoreProductDto.getId());
//    product.setTitle(fakesStoreProductDto.getId());
//    product.setPrice(fakeStoreProductDto.getPrice())
}
