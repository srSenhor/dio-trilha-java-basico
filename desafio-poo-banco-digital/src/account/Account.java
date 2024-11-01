package account;

import entities.Client;
import exceptions.InsufficientBalanceException;
import exceptions.NotAllowedAmountException;

public abstract class Account implements IAccount {

    private static final long DEFAULT_AGENCY = 1;
    private static long INCREMENT = 0L;

    protected double balance;
    protected long accountId;
    protected Client client;
    protected long agency;

    public Account(Client client) {
        this.agency = Account.DEFAULT_AGENCY;
        this.accountId = ++INCREMENT;
        this.client = client;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0.0) throw new NotAllowedAmountException();
        if (this.balance <= 0.0 || this.balance < amount) throw new InsufficientBalanceException();

        this.balance -= amount;
        System.out.printf("Succesfully withdrawed R$ %.2f. Current balance: R$ %.2f.\n", amount, this.balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0.0) throw new NotAllowedAmountException();
        
        this.balance += amount;
        System.out.printf("Succesfully deposited R$ %.2f. Current balance: R$ %.2f.\n", amount, this.balance);
    }

    @Override
    public void transfer(double amount, IAccount account) {
        this.withdraw(amount);
        account.deposit(amount);

        System.out.printf("Succesfully transfered R$ %.2f.\n", amount);
    }

    @Override
    public void showAccountInfo() {
        System.out.println("==============----- Bank Extract -----==============");
        System.out.printf("\t|> Account ID: %d\n", this.accountId);
        System.out.printf("\t|> Agency: %d\n", this.agency);
        System.out.printf("\t|> Owner complete name: %s\n", this.client.getName().toUpperCase());
        System.out.printf("\t|> Owner cpf: %s\n", this.client.getCpf());
        System.out.printf("\t|> Current balance: R$ %.2f\n", this.balance);
        System.out.println("==============------------------------==============\n");
    }

}