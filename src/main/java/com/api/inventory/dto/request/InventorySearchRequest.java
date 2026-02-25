package com.api.inventory.dto.request;

import jakarta.validation.constraints.DecimalMin;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class InventorySearchRequest {

    private String name;
    private String category;
    private String subCategory;
    private String brand;

    @DecimalMin(value = "0.0", inclusive = true)
    private BigDecimal minPrice;

    @DecimalMin(value = "0.0", inclusive = true)
    private BigDecimal maxPrice;

    private String seller;
    private String location;

    private LocalDate manufacturedAfter;
    private LocalDate expiryBefore;

    private Boolean active;
}
