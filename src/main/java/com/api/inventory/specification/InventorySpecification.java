package com.api.inventory.specification;

import com.api.inventory.entity.Inventory;
import org.springframework.data.jpa.domain.Specification;

import java.math.BigDecimal;

public class InventorySpecification {

    public static Specification<Inventory> build(
            String name,
            String category,
            BigDecimal minPrice,
            BigDecimal maxPrice,
            String seller
    ) {
        return (root, criteriaQuery, criteriaBuilder) -> {
            var predicate = criteriaBuilder.conjunction();

            if (name != null)
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.like(criteriaBuilder.lower(root.get("name")),
                                "%" + name.toLowerCase() + "%"));

            if (category != null)
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("category"), category));

            if (minPrice != null)
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.greaterThanOrEqualTo(root.get("price"), minPrice));

            if (maxPrice != null)
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.lessThanOrEqualTo(root.get("price"), maxPrice));

            if (seller != null)
                predicate = criteriaBuilder.and(predicate,
                        criteriaBuilder.equal(root.get("seller"), seller));

            return predicate;
        };
    }
}
