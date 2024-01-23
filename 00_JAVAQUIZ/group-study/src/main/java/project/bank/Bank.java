package project.bank;

import java.util.ArrayList;
import java.util.Random;

public class Bank {

    int accNum = 0;

    ArrayList<Account> account = new ArrayList<Account>();

    public void makeSavingAccount() {
        account.add(new Account(accNum));
        accNum++;
    }

    public void makeStudentAccount(double interest, double stdInterest) {
        account.add(new StudentAccount(accNum, interest, stdInterest));
        accNum++;
    }

    public void makeCheckingAccount(double overdraft) {
        account.add(new CheckingAccount(accNum, overdraft));
        accNum++;
    }

    public void delAccount(int num) {
        account.remove(num);
    }

    public void giveInterest() {
        for (Account arrayList : account) {
            if (arrayList instanceof SavingAccount) {
                ((SavingAccount) arrayList).getInterest();
            }
        }
    }

    public void printAll(int i){
        System.out.println(account.get(i).toString());
    }

}
