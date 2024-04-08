package dev.nym.productservice.controllers;

import dev.nym.productservice.dtos.FakeStoreCartDto;
import dev.nym.productservice.models.Product;
import dev.nym.productservice.services.FakeStoreCartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    private FakeStoreCartService fakeStoreCartService;

    CartController(FakeStoreCartService fakeStoreCartService){
        this.fakeStoreCartService = fakeStoreCartService;
    }

    @GetMapping("/carts/{id}")
    public FakeStoreCartDto getCartById(@PathVariable("id") Long id){
        return fakeStoreCartService.getCartById(id);
    }

    @GetMapping("carts")
    public FakeStoreCartDto[] getAllCarts(){
        return fakeStoreCartService.getAllCarts();
    }
}
