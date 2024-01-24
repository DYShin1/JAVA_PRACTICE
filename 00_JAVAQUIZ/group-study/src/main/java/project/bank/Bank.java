package project.bank;

import java.util.ArrayList;
import java.util.Random;

public class Bank {

    int accNum = 0;

    ArrayList<Account> account = new ArrayList<Account>();

    /* 설명. SavingAccount 생성 */
    public void makeSavingAccount(double interest) {
        account.add(new SavingAccount(accNum, interest));
        accNum++;
    }

    /* 설명. StudentAccount 생성 */
    public void makeStudentAccount(double stdInterest) {
        account.add(new StudentAccount(accNum, interestAvgCal(), stdInterest));
        accNum++;
    }

    /* 설명. CheckingAccount 생성 */
    public void makeCheckingAccount(double overdraft) {
        account.add(new CheckingAccount(accNum, overdraft));
        accNum++;
    }

    /* 설명. 계좌 삭제 */
    public String delAccount(int num) {
        for (int i = 0; i < account.size(); i++) {
            if(account.get(i).getAccountNumber() == num){
                account.remove(i);
                return "계좌번호" + i + "를 삭제 완료 했습니다.";
            }
        }
        return "계좌가 존재하지 않습니다.";
    }

    /* 설명. SavingAccount 계좌에 이자 지급 */
    public void giveInterest() {
        for (Account arrayList : account) {
            if (arrayList instanceof SavingAccount) {
                ((SavingAccount) arrayList).getInterest();
            }
        }
    }

    public double interestAvgCal(){
        int cnt = 0;
        double interestAvg = 0;
        for(Account accArr : account){
            if(accArr instanceof SavingAccount && !(accArr instanceof StudentAccount)){   // Saving만 이자 주고 Student는 만기 시에만 이자 줌
                interestAvg += ((SavingAccount) accArr).getInterest();
                cnt++;
            }
        }
        interestAvg /= (double)cnt;
        return interestAvg;
    }

}
