package za.ac.cput.repository;

import za.ac.cput.domain.Inventory;
import java.util.ArrayList;
import java.util.List;

/* InventoryRepository.java
   In-Memory CRUD Repository Implementation for Inventory
   Author: [Khonzinkosi Khumalo] 230231802
   Date: 05 July 2026 */
public class InventoryRepository implements IInventoryRepository {
    private static InventoryRepository repository = null;
    private final List<Inventory> inventoryDB;

    private InventoryRepository() {
        this.inventoryDB = new ArrayList<>();
    }

    public static InventoryRepository getRepository() {
        if (repository == null) {
            repository = new InventoryRepository();
        }
        return repository;
    }

    @Override
    public Inventory create(Inventory inventory) {
        if (inventory == null) return null;
        boolean success = inventoryDB.add(inventory);
        if (success) {
            return inventory;
        }
        return null;
    }

    @Override
    public Inventory read(String inventoryId) {
        if (inventoryId == null || inventoryId.trim().isEmpty()) return null;
        for (Inventory inventory : inventoryDB) {
            if (inventory.getInventoryId().equals(inventoryId)) {
                return inventory;
            }
        }
        return null;
    }

    @Override
    public Inventory update(Inventory inventory) {
        if (inventory == null) return null;
        Inventory oldInventory = read(inventory.getInventoryId());
        if (oldInventory != null) {
            inventoryDB.remove(oldInventory);
            inventoryDB.add(inventory);
            return inventory;
        }
        return null;
    }

    @Override
    public boolean delete(String inventoryId) {
        Inventory inventoryToDelete = read(inventoryId);
        if (inventoryToDelete != null) {
            return inventoryDB.remove(inventoryToDelete);
        }
        return false;
    }

    @Override
    public List<Inventory> getAll() {
        return new ArrayList<>(inventoryDB);
    }
}
