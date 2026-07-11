package za.ac.cput.repository;

/* IRepository.java
   Generic Base Repository Interface Contract
   Author: [Group Master Name]
   Date: 05 July 2026 */
public interface IRepository<T, ID> {
    T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);
}
