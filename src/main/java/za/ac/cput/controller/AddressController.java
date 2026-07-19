package za.ac.cput.controller;

//import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Address;
import za.ac.cput.service.AddressService;

import java.util.List;

/* AddressController.java
   Address REST Controller
   Author: Paul Khumalo (230108547)
   Date: 19/07/2026
*/


public class AddressController {

    private final AddressService service = AddressService.getService();


    public Address create(Address address) {
        return service.create(address);
    }


    public Address read(String streetAddress) {
        return service.read(streetAddress);
    }


    public Address update( Address address) {
        return service.update(address);
    }


    public boolean delete( String streetAddress) {
        return service.delete(streetAddress);
    }

    public List<Address> getAll() {
        return service.getAll();
    }
}