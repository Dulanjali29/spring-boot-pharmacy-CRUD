package lk.pharmacyapp.pharmacyapp.controller;

import lk.pharmacyapp.pharmacyapp.dto.CustomerDto;
import lk.pharmacyapp.pharmacyapp.entity.Customer;
import lk.pharmacyapp.pharmacyapp.repo.CustomerRepo;
import lk.pharmacyapp.pharmacyapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

private CustomerService customerService;
    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }




    @PostMapping
    public ResponseEntity saveCustomer(@RequestBody CustomerDto customer) {
        Customer cus = customerService.saveCustomer(customer);

    return  new ResponseEntity<>(cus, HttpStatus.CREATED);
    }

    @GetMapping
    public  ResponseEntity <List<Customer>>getCustomer() {
        List<Customer> allCustomers = customerService.getAllCustomer();
        return  new ResponseEntity<>(allCustomers,HttpStatus.OK);
    }

    @PutMapping
    public void updateCustomer() {

    }

    @DeleteMapping("/{customerId}")
    public void deleteCustomer(@PathVariable Integer customerId) {
    customerService.deleteCustomer(customerId);
    }

    @GetMapping("/search_customer")
    public void searchCustomer() {

    }
}
