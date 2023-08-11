package Address.example.address.repository;

import Address.example.address.entity.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepository extends MongoRepository<Address, Integer> {
}
