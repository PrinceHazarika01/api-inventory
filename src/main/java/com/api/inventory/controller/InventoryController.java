package com.api.inventory.controller;

import com.api.inventory.dto.request.InventorySearchRequest;
import com.api.inventory.dto.response.ApiResponse;
import com.api.inventory.dto.response.InventoryResponse;
import com.api.inventory.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/inventories")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService service;

    @GetMapping("/search")
    public ApiResponse<List<InventoryResponse>> search(
            InventorySearchRequest request
    ) {

        List<InventoryResponse> result = service.search(request);

        return ApiResponse.<List<InventoryResponse>>builder()
                .message("Inventories fetched successfully")
                .data(result)
                .build();
    }
}
