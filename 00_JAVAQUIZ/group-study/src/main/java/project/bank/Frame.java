package project.bank;

import java.util.Scanner;

public class Frame {
    Scanner sc = new Scanner(System.in);
    Bank bank = new Bank();

    public void makeAccount(){

        int num = 0;

        System.out.println("1. CheckingAccount 2. SavingAccount 3. StudentAccount");
        num = sc.nextInt();
        switch (num){
            case 1:
                bank.makeCheckingAccount(overdraft());
                break;
            case 2:
                bank.makeSavingAccount(interest());
                break;
            case 3:
                bank.makeStudentAccount(stdInterest());
                break;
        }
    }

    private double stdInterest() {
        System.out.println("학생 추가 이자 입력: ");
        return sc.nextDouble();
    }

    private double overdraft(){
        System.out.println("Overdraft 가능 금액 입력: ");
        return sc.nextDouble();
    }

    private double interest(){
        System.out.println("Interest 입력: ");
        return sc.nextDouble();
    }

    public void makeCheck(double checkMoney){

    }

    public void depositAllow(int acc, double deposit){
        if(findAcc(acc) >= 0){
            bank.account.get(findAcc(acc)).deposit(deposit);
            System.out.println("계좌의 돈: " + deposit + "만큼 입금 되었습니다.");
        }
    }

    public void withdrawAllow(int acc, double withdraw){
        if(findAcc(acc) >= 0 && !(((Account)bank.account.get(findAcc(acc))) instanceof StudentAccount)){
            bank.account.get(findAcc(acc)).withdraw(withdraw);
            System.out.println("계좌의 돈: " + withdraw + "만큼 출금 되었습니다.");
        }
    }

    public int findAcc(int findAcc){
        for (int i = 0; i < bank.account.size(); i++) {
            if(bank.account.get(i).getAccountNumber() == findAcc){
                printAccount(i);
                return i;
            }
        }
        System.out.println("계좌가 존재 하지 않습니다.");
        return -1;
    }

    public void deleteAcc(int accNum){
        System.out.println(bank.delAccount(accNum));
    }

    public void printAccount(int i){
        System.out.println(bank.account.get(i).toString());
    }

    public void printAll(){
        for(Account acc: bank.account){
            System.out.println(acc.toString());
        }
    }
}
