package project.bank;

import java.util.Scanner;

public class Frame {
    Scanner sc = new Scanner(System.in);
    Bank bank = new Bank();

    /* 설명. Checking, Saving, Student 계좌 생성 메소드 */
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


    /* 설명. 수표를 만들때 초과 가능 금액 입력. */
    private double overdraft(){
        System.out.println("Overdraft 가능 금액 입력: ");
        return sc.nextDouble();
    }

    /* 설명. SavingAccount 이자 입력 */
    private double interest(){
        System.out.println("Interest 입력: ");
        return sc.nextDouble();
    }

    /* 설명. 학생이 추가적으로 받을 이자 입력 */
    private double stdInterest() {
        System.out.println("학생 추가 이자 입력: ");
        return sc.nextDouble();
    }

    /* 설명. 계좌 입금 메소드 */
    public void depositAllow(){
        System.out.println("입금할 계좌 입력하세요: ");
        int accNum = sc.nextInt();
        System.out.println("입금할 금액 입력하세요: ");
        double deposit = sc.nextDouble();
        if(bank.findAcc(accNum) != null){
            bank.findAcc(accNum).deposit(deposit);
            System.out.println("계좌의 돈: " + deposit + "만큼 입금 되었습니다.");
        } else{
            System.out.println("계좌가 존재하지 않습니다.");
        }
    }

    /* 설명. 출금 가능 메소드. */
    public void withdrawAllow(){
        System.out.println("출금할 계좌 입력하세요: ");
        int accNum = sc.nextInt();
        System.out.println("출금할 금액 입력하세요: ");
        double withdraw = sc.nextDouble();
        if(bank.findAcc(accNum) != null && !(bank.findAcc(accNum) instanceof StudentAccount)){
            bank.findAcc(accNum).withdraw(withdraw);
            System.out.println("계좌의 돈: " + withdraw + "만큼 출금 되었습니다.");
        } else {
            System.out.println("계좌가 존재하지 않습니다.");
        }
    }

    /* 설명. 계좌 삭제 메소드 */
    public void deleteAcc(){
        System.out.println("삭제할 계좌 번호를 입력하세요.");
        int delAcc = sc.nextInt();
        if(bank.delAccount(delAcc) != 0) {
            System.out.println("계좌 번호: " + delAcc + "을 삭제 했습니다.");
        } else{
            System.out.println("계좌가 존재하지 않습니다.");
        }
    }

    /* 설명. SavingAccount 계좌에 이자를 적립하는 메소드 */
    public void giveInterest(){
        bank.giveInterest();
        System.out.println("Saving Account에 이자를 적립했습니다.");
    }

    /* 설명. 계좌 번호를 입력받아 계좌를 출력 */
    public void printAccount(){
        System.out.println("찾을 계좌 번호를 입력하세요.");
        int i = sc.nextInt();
        if(bank.findAcc(i) != null){
            System.out.println(bank.findAcc(i).toString());
        }else{
            System.out.println("계좌가 존재 하지 않습니다.");
        }
    }

    /* 설명. 모든 계좌를 출력 */
    public void printAll(){
        for(Account acc: bank.account){
            System.out.println(acc.toString());
        }
    }

    /* 설명. Checking 계좌를 확인해 수표 발행 */
    public void checkPay(){
        System.out.println("수표 생성 금액 입력: ");
        double checkMoney = sc.nextDouble();
        System.out.println("계좌 입력: ");
        int accNum = sc.nextInt();
        Account checkAcc = bank.findAcc(accNum);
        if(checkAcc instanceof CheckingAccount){
            bank.payCheck(checkAcc, checkMoney);
        } else if(bank.findAcc(accNum) == null){
            System.out.println("계좌가 없습니다.");
        } else{
            System.out.println("CheckingAccount가 아닙니다.");
        }
    }

    /* 설명. 수정 필요. */
    public void giveStudentInterest() {
    }
}
