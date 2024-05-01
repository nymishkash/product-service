package dev.nym.productservice.services;


import dev.nym.productservice.dtos.FakeStoreProductDto;
import dev.nym.productservice.exceptions.ProductNotFoundException;
import dev.nym.productservice.interfaces.ProductService;
import dev.nym.productservice.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProductService implements ProductService {

    Product product = new Product();

    @Override
    public Product getProductById(Long id) {
        RestTemplate restTemplate = new RestTemplate();
                Product product = restTemplate.getForObject("https://fakestoreapi.com/products/" + id,
                Product.class);

        if (product == null){
            throw new ProductNotFoundException(id, "Product not found!");
        }

        return product;
    }

    @Override
    public Product[] getAllProducts() {
        RestTemplate restTemplate = new RestTemplate();
                Product[] output = restTemplate.getForObject("https://fakestoreapi.com/products",
                Product[].class);

        return output;
    }

    @Override
    public String[] getAllCategories() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://fakestoreapi.com/products/categories",
                String[].class);
    }

    @Override
    public Product[] getProductsByCategory(String category) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://fakestoreapi.com/products/category/" + category,
                Product[].class);
    }

    @Override
    public Product[] getProductsInLimit(Integer num) {


        RestTemplate restTemplate = new RestTemplate();
        Product[] output =  restTemplate.getForObject("https://fakestoreapi.com/products",
                Product[].class);

        if (num > output.length){
            throw new ArrayIndexOutOfBoundsException();
        }

        Product[] finaloutput = new Product[num];
        System.arraycopy(output, 0, output, 0, num);

        return finaloutput;
    }

    @Override
    public Product createProduct(Product product) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject("https://fakestoreapi.com/products", product, Product.class);
    }
//    product.setId(fakesStoreProductDto.getId());
//    product.setTitle(fakesStoreProductDto.getId());
//    product.setPrice(fakeStoreProductDto.getPrice())
}
