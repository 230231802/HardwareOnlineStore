package za.ac.cput.service;

import za.ac.cput.domain.Inventory;
import za.ac.cput.repository.InventoryRepository;
import java.util.List;

/* InventoryService.java
   Inventory Service Implementation using Singleton Pattern
   Author: Khonzinkosi Khumalo (230231802)
   Date: 12 July 2026 */
public class InventoryService implements IInventoryService {
    private static InventoryService service = null;
    private final InventoryRepository repository;

    private InventoryService() {
        this.repository = InventoryRepository.getRepository();
    }

    // Singleton Implementation
    public static InventoryService getService() {
        if (service == null) {
            service = new InventoryService();
        }
        return service;
    }

    @Override
    public Inventory create(Inventory inventory) {
        return repository.create(inventory);
    }

    @Override
    public Inventory read(String inventoryId) {
        return repository.read(inventoryId);
    }

    @Override
    public Inventory update(Inventory inventory) {
        return repository.update(inventory);
    }

    @Override
    public List<Inventory> getAll() {
        return repository.getAll();
    }
}
