package gr.aueb.cf.ch13.bankapp;

import gr.aueb.cf.ch13.bankapp.model.JointAccount;
import gr.aueb.cf.ch13.bankapp.model.OverdraftAccount;

public class Main {

    public static void main(String[] args) {
        JointAccount account = new JointAccount(1, "GR123456789", "John", "Doe", "A5789", "Jane", "Doe", "A5912", 1000);

        System.out.println(account.accountToString());
        OverdraftAccount initialBalance = new OverdraftAccount(1000);
        account.setBalance(initialBalance.withdraw(2000));
        account.getAccountBalance();

    }
}
