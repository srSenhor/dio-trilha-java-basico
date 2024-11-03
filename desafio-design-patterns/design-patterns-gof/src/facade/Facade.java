package facade;

import utils.subsystem1.CrmServiceExample;
import utils.subsystem2.CepAPI;

public class Facade {
    public void migrateClient(String name, String cep) {

        String city = CepAPI.getInstance().searchCity(cep);
        String state = CepAPI.getInstance().searchState(cep);

        CrmServiceExample.recordClient(name, cep, city, state);
    }
}
