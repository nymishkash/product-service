package dev.nym.productservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Address {
    private String city;
    private String street;
    private Integer number;
    private String zipcode;
    private GeoLocation geolocation;
}
