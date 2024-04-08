package dev.nym.productservice.services;

import dev.nym.productservice.dtos.FakeStoreCartDto;

public interface CartService {

    FakeStoreCartDto getCartById(Long id);
    FakeStoreCartDto[] getAllCarts();
}
