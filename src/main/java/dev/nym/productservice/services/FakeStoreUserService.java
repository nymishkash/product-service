package dev.nym.productservice.services;

import dev.nym.productservice.dtos.FakeStoreUserDto;
import dev.nym.productservice.interfaces.UserService;
import dev.nym.productservice.models.User;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreUserService implements UserService {

    User user = new User();

    @Override
    public FakeStoreUserDto getUserById(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        FakeStoreUserDto fakeStoreUserDto =
                restTemplate.getForObject("https://fakestoreapi.com/users/" + id,
                FakeStoreUserDto.class);

        System.out.println("hello");

        return fakeStoreUserDto;
    }

    @Override
    public FakeStoreUserDto[] getAllUsers() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://fakestoreapi.com/users",
                FakeStoreUserDto[].class);
    }
}
