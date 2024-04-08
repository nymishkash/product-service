package dev.nym.productservice.models;


import dev.nym.productservice.dtos.FakeStoreProductDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Cart {
    private Long id;
    private Long userId;
    private LocalDate date;
    private FakeStoreProductDto[] products;
}
