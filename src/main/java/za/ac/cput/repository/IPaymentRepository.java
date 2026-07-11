package za.ac.cput.repository;

import za.ac.cput.domain.Payment;
import java.util.List;

/* IPaymentRepository.java
   Payment-specific Repository Interface
   Author: [Khonzinkosi Khumalo] 230231802
   Date: 05 July 2026 */
public interface IPaymentRepository extends IRepository<Payment, String> {

    List<Payment> getAll();
}
