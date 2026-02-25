package com.api.inventory.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "inventories",
        indexes = {
                @Index(name = "idx_category", columnList = "category"),
                @Index(name = "idx_price", columnList = "price"),
                @Index(name = "idx_seller", columnList = "seller")
        })
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String category;
    private String subCategory;

    private LocalDate manufacturingDate;
    private LocalDate expiryDate;

    @Column(length = 2000)
    private String specification;

    @Column(nullable = false)
    private BigDecimal price;

    private Integer stock;
    private String model;
    private String seller;
    private String location;
    private String brand;

    private Boolean active = true;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @PrePersist
    public void prePersist() {
        createdAt = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        updatedAt = LocalDateTime.now();
    }
}
