import java.util.ArrayList;
import java.util.List;

import account.Account;
import account.CheckingAccount;
import account.SavingsAccount;
import entities.Client;

public class Bank {

    private static Bank instance;
    private List<Account> bankAccounts;

    private Bank() {
        bankAccounts = new ArrayList<>();
    }

    public static Bank getInstance() {
        if (instance == null) instance = new Bank();

        return instance;
    }

    private void listAllAccounts() {
        bankAccounts.stream().forEach(acc -> { acc.showAccountInfo(); });
    }

    public static void main(String[] args) {

        Bank bank = Bank.getInstance();

        Account checkingAccount = new CheckingAccount(new Client("Paulinho", "Rua 02", "123.123.123-12", 12, 12, 2003));
        Account savingsAccount = new SavingsAccount(new Client("Sergio Rosca", "Rua 312", "312.312.312-31", 21, 1, 1992));

        bank.bankAccounts.add(checkingAccount);
        bank.bankAccounts.add(savingsAccount);

        checkingAccount.deposit(200);
        savingsAccount.deposit(1200);

        savingsAccount.withdraw(200);
        savingsAccount.transfer(300, checkingAccount);



        bank.listAllAccounts();
        
        
    }

}
