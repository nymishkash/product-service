package dev.nym.productservice.services;

import dev.nym.productservice.dtos.FakeStoreCartDto;
import dev.nym.productservice.interfaces.CartService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreCartService implements CartService {

    @Override
    public FakeStoreCartDto getCartById(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://fakestoreapi.com/carts/" + id,
                FakeStoreCartDto.class);
    }

    @Override
    public FakeStoreCartDto[] getAllCarts() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://fakestoreapi.com/carts",
                FakeStoreCartDto[].class);
    }
}
