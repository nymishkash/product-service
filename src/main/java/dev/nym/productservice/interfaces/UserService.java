package dev.nym.productservice.interfaces;

import dev.nym.productservice.dtos.FakeStoreUserDto;

public interface UserService {
    FakeStoreUserDto getUserById(Long id);
    FakeStoreUserDto[] getAllUsers();
}
