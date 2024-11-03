package utils.subsystem1;

public class CrmServiceExample {

    private CrmServiceExample() {
        super();
    }

    public static void recordClient(String name, String cep, String city, String state) {
        System.out.println("Client recorded on the system: ");
        System.out.printf("|> Name: %s\n", name);
        System.out.printf("|> CEP: %s\n", cep);
        System.out.printf("|> City: %s\n", city);
        System.out.printf("|> State: %s\n", state);
    }

}
