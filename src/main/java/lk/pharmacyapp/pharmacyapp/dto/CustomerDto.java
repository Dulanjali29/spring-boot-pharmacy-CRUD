package lk.pharmacyapp.pharmacyapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class CustomerDto {
    private  Integer id;
    private String name;
    private  String address;
    private  double salary;

}
