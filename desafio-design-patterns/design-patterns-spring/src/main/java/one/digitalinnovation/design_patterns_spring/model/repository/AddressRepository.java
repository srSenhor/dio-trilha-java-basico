package one.digitalinnovation.design_patterns_spring.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import one.digitalinnovation.design_patterns_spring.model.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, String>{}
