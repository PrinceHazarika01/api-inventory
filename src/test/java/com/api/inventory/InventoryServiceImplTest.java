package com.api.inventory;

import com.api.inventory.dto.response.InventoryResponse;
import com.api.inventory.dto.request.InventorySearchRequest;
import com.api.inventory.entity.Inventory;
import com.api.inventory.repository.InventoryRepository;
import com.api.inventory.service.impl.InventoryServiceImpl;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;
import org.springframework.data.jpa.domain.Specification;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.fasterxml.jackson.databind.ObjectMapper;

class InventoryServiceImplTest {

    @Mock
    private InventoryRepository repository;

    @InjectMocks
    private InventoryServiceImpl service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shouldReturnMappedInventoryResponse_whenSearchIsCalled() throws JsonProcessingException {

        Inventory inventory = new Inventory();
        inventory.setId(1L);
        inventory.setName("iPhone 15");
        inventory.setCategory("Electronics");
        inventory.setSubCategory("Mobile");
        inventory.setBrand("Apple");
        inventory.setPrice(new BigDecimal("75000"));
        inventory.setStock(10);
        inventory.setSeller("Amazon");
        inventory.setLocation("Bangalore");
        inventory.setManufacturingDate(LocalDate.of(2024,1,1));
        inventory.setExpiryDate(LocalDate.of(2026,1,1));

        // ✅ Explicit type to avoid ambiguity
        when(repository.findAll((Specification<Inventory>)  any()))
                .thenReturn(List.of(inventory));

        InventorySearchRequest request = new InventorySearchRequest();
        request.setName("iPhone");

        List<InventoryResponse> responses = service.search(request);

        assertNotNull(responses);
        assertEquals(1, responses.size());
        assertEquals("iPhone 15", responses.get(0).getName());

//        // Print the whole list
        System.out.println(responses);

        // Print each item nicely
//        responses.forEach(response -> {
//            System.out.println("ID: " + response.getId());
//            System.out.println("Name: " + response.getName());
//            System.out.println("Category: " + response.getCategory());
//            System.out.println("Brand: " + response.getBrand());
//            System.out.println("Price: " + response.getPrice());
//            System.out.println("Stock: " + response.getStock());
//            System.out.println("------------------------");
//        });

        verify(repository, times(1)).findAll((Specification<Inventory>) any());
    }
}