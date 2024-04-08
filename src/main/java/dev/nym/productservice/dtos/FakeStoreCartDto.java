package dev.nym.productservice.dtos;

import dev.nym.productservice.models.Product;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter

public class FakeStoreCartDto {

    private Long id;
    private Long userId;
    private LocalDate date;
    private ProductCartDto[] products;
}
