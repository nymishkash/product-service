package dev.nym.productservice.dtos;

import dev.nym.productservice.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class FakeStoreCartDto {

    private Long id;
    private Long userId;
    private String date;
    private Product[] products;
}
