package za.ac.cput.controller;

//import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Admin;
import za.ac.cput.service.AdminService;

import java.util.List;

/* AdminController.java
   Admin REST Controller
   Author: Paul Khumalo (230108547)
   Date: 19/07/2026
*/


public class AdminController {

    private final AdminService service = AdminService.getService();


    public Admin create( Admin admin) {
        return service.create(admin);
    }


    public Admin read(String adminId) {
        return service.read(adminId);
    }


    public Admin update( Admin admin) {
        return service.update(admin);
    }


    public boolean delete( String adminId) {
        return service.delete(adminId);
    }


    public List<Admin> getAll() {
        return service.getAll();
    }
}