package com.api.inventory.mapper;

import com.api.inventory.dto.response.InventoryResponse;
import com.api.inventory.entity.Inventory;

public class InventoryMapper {

    public static InventoryResponse toResponse(Inventory inventory) {
        return InventoryResponse.builder()
                .id(inventory.getId())
                .name(inventory.getName())
                .category(inventory.getCategory())
                .subCategory(inventory.getSubCategory())
                .brand(inventory.getBrand())
                .price(inventory.getPrice())
                .stock(inventory.getStock())
                .seller(inventory.getSeller())
                .location(inventory.getLocation())
                .manufacturingDate(inventory.getManufacturingDate())
                .expiryDate(inventory.getExpiryDate())
                .build();
    }
}
