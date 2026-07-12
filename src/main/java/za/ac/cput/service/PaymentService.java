package za.ac.cput.service;

import za.ac.cput.domain.Payment;
import za.ac.cput.repository.PaymentRepository;
import java.util.List;

/* PaymentService.java
   Payment Service Implementation using Singleton Pattern
   Author: Khonzinkosi Khumalo (230231802)
   Date: 12 July 2026 */
public class PaymentService implements IPaymentService {
    private static PaymentService service = null;
    private final PaymentRepository repository;

    private PaymentService() {
        this.repository = PaymentRepository.getRepository();
    }

    // Singleton Implementation
    public static PaymentService getService() {
        if (service == null) {
            service = new PaymentService();
        }
        return service;
    }

    @Override
    public Payment create(Payment payment) {
        return repository.create(payment);
    }

    @Override
    public Payment read(String paymentId) {
        return repository.read(paymentId);
    }

    @Override
    public Payment update(Payment payment) {
        return repository.update(payment);
    }

    @Override
    public List<Payment> getAll() {
        return repository.getAll();
    }
}