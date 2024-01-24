package project.bank;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

public class SavingAccount extends Account {

    private double interest;
    private double result = 0;

    public SavingAccount(int a, double interest) {
        super(a);
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void Interest(){
        result = getBalance() + (getBalance() * (getInterest() * 0.01));       // 이자를 % 크기로 받고 0.01 곱한 후 기존 금리와 곱하고 더한다.
        deposit(result);            // Account Class 내 deposit 메소드를 활용해 잔액을 올린다.
    }

    @Override
    public String toString(){
        return "SavingAccount -> Acc " + getAccountNumber() + ": " + "balance = " + getBalance() + " Interest = " + getInterest();
    }

}
