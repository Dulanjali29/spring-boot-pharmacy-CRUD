package lk.pharmacyapp.pharmacyapp.repo;

import lk.pharmacyapp.pharmacyapp.entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepo extends JpaRepository<Medicine,Integer> {
}
