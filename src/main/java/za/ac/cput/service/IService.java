package za.ac.cput.service;

/* IService.java
   Generic Base Service Interface Contract
   Author: Khonzinkosi Khumalo (230231802)
   Date: 12 July 2026 */
public interface IService<T, ID> {

    // Abstract contract method to handle record creation
    T create(T t);

    // Abstract contract method to handle lookups by unique entity identifier
    T read(ID id);

    // Abstract contract method to handle entity updates
    T update(T t);
}
