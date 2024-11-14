package kz.study.demographql.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @GetMapping(path = "/")
    public String index() {
        return "external";
    }

//    @GetMapping(path = "/customers")
//    public String customers(Principal principal, Model model) {
//        addCustomers();
//        model.addAttribute("customers", customerDAO.findAll());
//        model.addAttribute("username", principal.getName());
//        return "customers";
//    }

}
