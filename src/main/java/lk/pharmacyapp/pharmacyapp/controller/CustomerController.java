package lk.pharmacyapp.pharmacyapp.controller;

import lk.pharmacyapp.pharmacyapp.entity.Customer;
import lk.pharmacyapp.pharmacyapp.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerController(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @PostMapping
    public ResponseEntity saveCustomer(@RequestBody Customer customer) {
        Customer save = customerRepo.save(customer);

    return  new ResponseEntity<>(save, HttpStatus.CREATED);
    }

    @GetMapping
    public  ResponseEntity <List<Customer>>getCustomer() {
        List<Customer> all = customerRepo.findAll();
        return  new ResponseEntity<>(all,HttpStatus.OK);
    }

    @PutMapping
    public void updateCustomer() {

    }

    @DeleteMapping
    public void deleteCustomer() {

    }

    @GetMapping("/search_customer")
    public void searchCustomer() {

    }
}
