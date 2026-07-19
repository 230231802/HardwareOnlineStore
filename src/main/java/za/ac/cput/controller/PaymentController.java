package za.ac.cput.controller;

import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Payment;
import za.ac.cput.service.PaymentService;
import java.util.List;

/* PaymentController.java
   REST Controller for Payment Entity
   Author: Khonzinkosi Khumalo (230231802)
   Date: 19 July 2026 */
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public Payment create(@RequestBody Payment payment) {
        return paymentService.create(payment);
    }

    public Payment read(@PathVariable String id) {
        return paymentService.read(id);
    }

    public Payment update(@RequestBody Payment payment) {
        return paymentService.update(payment);
    }

    public List<Payment> getAll() {
        return paymentService.getAll();
    }
}
