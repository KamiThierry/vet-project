package com.auca.vet_patient_manager.model;

import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID inventoryId = UUID.randomUUID();
    private String itemName;
    @Enumerated(EnumType.STRING)
    private ItemCategory category;
    private int initialStock;
    private int availableStock;
    @UpdateTimestamp
    private Date lastUpdate;

    public Inventory() {
    }

    public Inventory(UUID inventoryId, String itemName, ItemCategory category, int initialStock, int availableStock, Date lastUpdate) {
        this.inventoryId = inventoryId;
        this.itemName = itemName;
        this.category = category;
        this.initialStock = initialStock;
        this.availableStock = availableStock;
        this.lastUpdate = lastUpdate;
    }

    public UUID getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(UUID inventoryId) {
        this.inventoryId = inventoryId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public ItemCategory getCategory() {
        return category;
    }

    public void setCategory(ItemCategory category) {
        this.category = category;
    }

    public int getInitialStock() {
        return initialStock;
    }

    public void setInitialStock(int initialStock) {
        this.initialStock = initialStock;
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(int availableStock) {
        this.availableStock = availableStock;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
