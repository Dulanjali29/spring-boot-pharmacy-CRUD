package lk.pharmacyapp.pharmacyapp.repo;

import lk.pharmacyapp.pharmacyapp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo  extends JpaRepository<Customer,Integer> {
}
