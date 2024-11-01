package account;

import entities.Client;

public class SavingsAccount extends Account{

    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void showAccountInfo() {
        System.out.println("==============----- Bank Extract -----==============");
        System.out.printf("\t|> Account ID: %d\n", this.accountId);
        System.out.printf("\t|> Agency: %d\n", this.agency);
        System.out.println("\t|> Account Type: Savings");
        System.out.printf("\t|> Owner complete name: %s\n", this.client.getName().toUpperCase());
        System.out.printf("\t|> Owner cpf: %s\n", this.client.getCpf());
        System.out.printf("\t|> Current balance: R$ %.2f\n", this.balance);
        System.out.println("==============------------------------==============\n");
    }

}
