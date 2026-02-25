package com.api.inventory.dto.response;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
public class InventoryResponse {

    private Long id;
    private String name;
    private String category;
    private String subCategory;
    private String brand;
    private BigDecimal price;
    private Integer stock;
    private String seller;
    private String location;
    private LocalDate manufacturingDate;
    private LocalDate expiryDate;
}

