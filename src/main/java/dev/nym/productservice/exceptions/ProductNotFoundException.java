package dev.nym.productservice.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductNotFoundException extends RuntimeException{
    private Long id;
    private String message;

    public ProductNotFoundException(Long id, String message) {
//        super(message);
        this.id = id;
        this.message = message;
    }
}
