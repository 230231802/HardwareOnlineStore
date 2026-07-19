package za.ac.cput.controller;

//import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Customer;
import za.ac.cput.service.CustomerService;

import java.util.List;

/* CustomerController.java
   Customer REST Controller
   Author: Paul Khumalo (230108547)
   Date: 19/07/2026
*/


public class CustomerController {

    private final CustomerService service = CustomerService.getService();


    public Customer create( Customer customer) {
        return service.create(customer);
    }


    public Customer read(String customerId) {
        return service.read(customerId);
    }


    public Customer update( Customer customer) {
        return service.update(customer);
    }


    public boolean delete(String customerId) {
        return service.delete(customerId);
    }


    public List<Customer> getAll() {
        return service.getAll();
    }
}