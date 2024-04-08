package dev.nym.productservice.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;
    private String email;
    private String username;
    protected String password;
    private Name name;
    private Address address;
    private String phone;
}
