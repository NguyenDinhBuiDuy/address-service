package Address.example.address.controller;

import Address.example.address.response.AddressResponse;
import Address.example.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/address/{employeeId}")
    ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable("employeeId") int id) {
        AddressResponse addressResponse = addressService.getAddressByEmployeeId(id);
        return ResponseEntity.status(HttpStatus.OK).body(addressResponse);
    }
}
