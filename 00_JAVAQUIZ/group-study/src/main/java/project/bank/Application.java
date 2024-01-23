package project.bank;

import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.makeCheckingAccount(1);
        bank.makeCheckingAccount(2);
        bank.makeCheckingAccount(3);

        bank.printAll(0);

    }
}
