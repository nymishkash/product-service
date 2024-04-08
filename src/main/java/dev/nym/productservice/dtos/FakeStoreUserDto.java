package dev.nym.productservice.dtos;

import dev.nym.productservice.models.Address;
import dev.nym.productservice.models.Name;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreUserDto {
    private Long id;
    private String email;
    private String username;
    protected String password;
    private Name name;
    private Address address;
    private String phone;
}
