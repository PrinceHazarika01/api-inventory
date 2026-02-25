package com.api.inventory.service;

import com.api.inventory.dto.request.InventorySearchRequest;
import com.api.inventory.dto.response.InventoryResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface InventoryService {

//    Page<InventoryResponse> search(InventorySearchRequest request, Pageable pageable);
List<InventoryResponse> search(InventorySearchRequest request);
}
