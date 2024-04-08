package dev.nym.productservice.controllers;

import dev.nym.productservice.dtos.FakeStoreUserDto;
import dev.nym.productservice.services.FakeStoreUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private FakeStoreUserService fakeStoreUserService;

    UserController(FakeStoreUserService fakeStoreUserService){
        this.fakeStoreUserService = fakeStoreUserService;
    }

    @GetMapping("/users/{id}")
    public FakeStoreUserDto getUserById(@PathVariable("id") Long id){
        return fakeStoreUserService.getUserById(id);
    }

    @GetMapping("/users")
    public FakeStoreUserDto[] getAllUsers(){
        return fakeStoreUserService.getAllUsers();
    }
}
