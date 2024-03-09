package lk.pharmacyapp.pharmacyapp.service;

import lk.pharmacyapp.pharmacyapp.dto.CustomerDto;
import lk.pharmacyapp.pharmacyapp.entity.Customer;
import lk.pharmacyapp.pharmacyapp.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }


    public Customer saveCustomer(CustomerDto customerDto) {
        return customerRepo.save(new Customer(customerDto.getName(), customerDto.getAddress(), customerDto.getSalary()));

    }

    public List<Customer> getAllCustomer() {

        return customerRepo.findAll();
    }

    public String deleteCustomer(Integer id) {
        if (customerRepo.existsById(id)) {
            customerRepo.deleteById(id);
            return "Customer Deleted";
        }

        return "no customer found";
    }

    public void updateCustomer() {

    }
}
