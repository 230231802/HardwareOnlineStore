package za.ac.cput.controller;

import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Inventory;
import za.ac.cput.service.InventoryService;
import java.util.List;

/* InventoryController.java
   REST Controller for Inventory Entity
   Author: Khonzinkosi Khumalo (230231802)
   Date: 19 July 2026 */
@RestController
@RequestMapping("/inventory")
public class InventoryController {

    // Aligned with your project's Singleton service layer pattern
    private final InventoryService inventoryService = InventoryService.getService();

    @PostMapping("/create")
    public Inventory create(@RequestBody Inventory inventory) {
        return inventoryService.create(inventory);
    }

    @GetMapping("/read/{id}")
    public Inventory read(@PathVariable String id) {
        return inventoryService.read(id);
    }

    @PostMapping("/update")
    public Inventory update(@RequestBody Inventory inventory) {
        return inventoryService.update(inventory);
    }

    @GetMapping("/getall")
    public List<Inventory> getAll() {
        return inventoryService.getAll();
    }
}