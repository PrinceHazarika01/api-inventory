package com.api.inventory.repository;

import com.api.inventory.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Repository layer for Inventory entity.
 *
 * Extends:
 * - JpaRepository → basic CRUD, pagination, sorting
 * - JpaSpecificationExecutor → dynamic filtering support
 */
@Repository
public interface InventoryRepository
        extends JpaRepository<Inventory, Long>,
        JpaSpecificationExecutor<Inventory> {

    /*
     * We are not adding custom methods yet because
     * dynamic filtering is handled via Specification.
     *
     * If required, we can add:
     *
     * Optional<Inventory> findByName(String name);
     *
     * List<Inventory> findByCategoryAndActiveTrue(String category);
     *
     * boolean existsByNameAndSeller(String name, String seller);
     *
     */
}
