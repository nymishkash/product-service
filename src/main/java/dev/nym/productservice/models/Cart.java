package dev.nym.productservice.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Cart {
    private Long id;
    private Long userId;
    private String date;
    private Product[] products;
}
