package za.ac.cput.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/* IndexController.java
   Root Home Controller Mapping
   Author: Author: Khonzinkosi (230231802)
   Date: 19 July 2026 */
@RestController
public class IndexController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the E-Commerce Store Application REST API. Running Status: Operational.";
    }
}
