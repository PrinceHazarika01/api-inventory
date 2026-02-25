package com.api.inventory.controller;

import com.api.inventory.dto.request.InventorySearchRequest;
import com.api.inventory.dto.response.ApiResponse;
import com.api.inventory.dto.response.InventoryResponse;
import com.api.inventory.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/inventories")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService service;

    @GetMapping("/search")
    public ApiResponse<Page<InventoryResponse>> search(
            InventorySearchRequest request,
            @PageableDefault(size = 10) org.springframework.data.domain.Pageable pageable
    ) {

        Page<InventoryResponse> result = service.search(request, pageable);

        return ApiResponse.<Page<InventoryResponse>>builder()
                .message("Inventories fetched successfully")
                .data(result)
                .build();
    }
}
