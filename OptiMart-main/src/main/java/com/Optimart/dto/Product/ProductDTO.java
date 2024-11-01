package com.Optimart.dto.Product;

import com.Optimart.models.City;
import com.Optimart.models.ProductType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private String name;
    private String slug;
    private Long price;
    private int status;
    private int countInStock;
    private String description;
    private int discount;
    private Date discountStartDate;
    private Date discountEndDate;
    private String location;
    private String type;
    private ProductType productType;
}
