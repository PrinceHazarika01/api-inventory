package com.api.inventory.service.impl;

import com.api.inventory.dto.request.InventorySearchRequest;
import com.api.inventory.dto.response.InventoryResponse;
import com.api.inventory.entity.Inventory;
import com.api.inventory.mapper.InventoryMapper;
import com.api.inventory.repository.InventoryRepository;
import com.api.inventory.service.InventoryService;
import com.api.inventory.specification.InventorySpecification;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {

    private final InventoryRepository repository;

    @Override
    public List<InventoryResponse> search(InventorySearchRequest request) {

        var spec = InventorySpecification.build(
                request.getName(),
                request.getCategory(),
                request.getMinPrice(),
                request.getMaxPrice(),
                request.getSeller()
        );

        List<Inventory> inventories = repository.findAll(spec);

        return inventories.stream()
                .map(InventoryMapper::toResponse)
                .toList();
    }
}
