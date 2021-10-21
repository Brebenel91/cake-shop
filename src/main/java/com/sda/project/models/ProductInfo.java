package com.sda.project.models;

import lombok.Value;

// TODO: return product in service methods
@Value
public class ProductInfo {

    Integer productId;
    String brand;
    String kg;
    Integer price;
    Integer quantity;
    String description;
    String imagineUrl;

}
