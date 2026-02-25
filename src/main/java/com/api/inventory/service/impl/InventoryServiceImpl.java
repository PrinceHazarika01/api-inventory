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

@Service
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {

    private final InventoryRepository repository;

    @Override
    public Page<InventoryResponse> search(InventorySearchRequest request,
                                          Pageable pageable) {

        var spec = InventorySpecification.build(
                request.getName(),
                request.getCategory(),
                request.getMinPrice(),
                request.getMaxPrice(),
                request.getSeller()
        );

        Page<Inventory> page = repository.findAll(spec, pageable);

        return page.map(InventoryMapper::toResponse);
    }
}
