package one.digitalinnovation.design_patterns_spring.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.design_patterns_spring.model.Address;
import one.digitalinnovation.design_patterns_spring.model.Client;
import one.digitalinnovation.design_patterns_spring.model.repository.AddressRepository;
import one.digitalinnovation.design_patterns_spring.model.repository.ClientRepository;
import one.digitalinnovation.design_patterns_spring.service.ClientService;
import one.digitalinnovation.design_patterns_spring.service.ViaCepService;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Client> searchAll() {
       return clientRepository.findAll();
    }

    @Override
    public Client searchById(Long id) {
        return clientRepository.findById(id).orElseGet(null);
    }

    @Override
    public void insert(Client client) {
        saveClient(client);
    }

    @Override
    public void update(Long id, Client client) {
        if (clientRepository.findById(id).isPresent()) {
            saveClient(client);
        }
    }

    private void saveClient(Client client) {

        String cep = client.getAddress().getCep();

        Address address = addressRepository.findById(cep).orElseGet(() -> {
            Address newAddress = viaCepService.retrieveAddress(cep);
            addressRepository.save(newAddress);
            return newAddress;
        });

        client.setAddress(address);
        clientRepository.save(client);

    }

    @Override
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

}
