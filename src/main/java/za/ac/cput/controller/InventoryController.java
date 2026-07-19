package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Inventory;
import za.ac.cput.service.InventoryService;
import java.util.List;

/* InventoryController.java
   REST Controller for Inventory Entity
   Author: Khonzinkosi Khumalo (230231802)
   Date: 19 July 2026 */
public class InventoryController {

    private final InventoryService inventoryService;

    @Autowired
    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public Inventory create(@RequestBody Inventory inventory) {
        return inventoryService.create(inventory);
    }

    public Inventory read(@PathVariable String id) {
        return inventoryService.read(id);
    }

    public Inventory update(@RequestBody Inventory inventory) {
        return inventoryService.update(inventory);
    }

    public List<Inventory> getAll() {
        return inventoryService.getAll();
    }
}
