package za.ac.cput.repository;

import za.ac.cput.domain.Inventory;
import java.util.List;

/* IInventoryRepository.java
   Inventory-specific Repository Interface
   Author: [Khonzinkosi Khumalo] 230231802
   Date: 05 July 2026 */
public interface IInventoryRepository extends IRepository<Inventory, String> {
    // Contract to fetch all tracked stock lines
    List<Inventory> getAll();
}
