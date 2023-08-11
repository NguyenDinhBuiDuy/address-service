package Address.example.address.service;

import Address.example.address.response.AddressResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {



    @Autowired
    private ModelMapper modelMapper;
    public AddressResponse getAddressByEmployeeId(int id){
//        Address address = addressRepository.findAddressByEmployeeId(id);
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        AddressResponse addressResponse = modelMapper.map(address, AddressResponse.class);
//        return addressResponse;
        AddressResponse addressResponse = new AddressResponse();
        addressResponse.setId(1);
        addressResponse.setZip("700000");
        return addressResponse;
    }
}
