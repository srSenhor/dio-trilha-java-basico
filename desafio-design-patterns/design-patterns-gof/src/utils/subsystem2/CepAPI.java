package utils.subsystem2;

public class CepAPI {

    private static class Holder {
    
        public static CepAPI instance = new CepAPI();
        
    }

    public static CepAPI getInstance() {
        return Holder.instance;
    }

    public String searchCity(String cep) {
        return "Mossoró";
    }

    public String searchState(String cep) {
        return "RN";
    }

}
