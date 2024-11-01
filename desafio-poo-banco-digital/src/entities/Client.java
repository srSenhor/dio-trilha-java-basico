package entities;
import java.time.LocalDate;

public class Client {

    private String name;
    private String address;
    private String cpf;
    private LocalDate birthDate;

    public Client(String name, String address, String cpf, int day, int month, int year) {
        this.name = name;
        this.address = address;
        this.cpf = cpf;
        this.birthDate = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCpf() {
        return cpf;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }

    

}
