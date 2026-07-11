package za.ac.cput.repository;

import za.ac.cput.domain.Payment;
import java.util.ArrayList;
import java.util.List;

/* PaymentRepository.java
   In-Memory CRUD Repository Implementation for Payments
   Author: [Khonzinkosi Khumalo] 230231802
   Date: 05 July 2026 */
public class PaymentRepository implements IPaymentRepository {
    private static PaymentRepository repository = null;
    private final List<Payment> paymentDB;

    private PaymentRepository() {
        this.paymentDB = new ArrayList<>();
    }

    public static PaymentRepository getRepository() {
        if (repository == null) {
            repository = new PaymentRepository();
        }
        return repository;
    }

    @Override
    public Payment create(Payment payment) {
        if (payment == null) return null;
        boolean success = paymentDB.add(payment);
        if (success) {
            return payment;
        }
        return null;
    }

    @Override
    public Payment read(String paymentId) {
        if (paymentId == null || paymentId.trim().isEmpty()) return null;
        for (Payment payment : paymentDB) {
            if (payment.getPaymentId().equals(paymentId)) {
                return payment;
            }
        }
        return null;
    }

    @Override
    public Payment update(Payment payment) {
        if (payment == null) return null;
        Payment oldPayment = read(payment.getPaymentId());
        if (oldPayment != null) {
            paymentDB.remove(oldPayment);
            paymentDB.add(payment);
            return payment;
        }
        return null;
    }

    @Override
    public boolean delete(String paymentId) {
        Payment paymentToDelete = read(paymentId);
        if (paymentToDelete != null) {
            return paymentDB.remove(paymentToDelete);
        }
        return false;
    }

    @Override
    public List<Payment> getAll() {
        return new ArrayList<>(paymentDB);
    }
}