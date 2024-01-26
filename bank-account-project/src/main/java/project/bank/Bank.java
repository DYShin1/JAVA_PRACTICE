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
    public int delAccount(int num) {
        if(findAcc(num) != null){
            account.remove(findAcc(num));
            return num;
        }
        return 0;
    }

    /* 설명. SavingAccount 계좌에 이자 지급 */
    public void giveInterest() {
        for (Account arrayList : account) {
            if (arrayList instanceof SavingAccount && !(arrayList instanceof StudentAccount)) {
                ((SavingAccount) arrayList).Interest();
            }
        }
    }

    /* 설명. 계좌 찾는 메소드 */
    public Account findAcc(int findAcc){
        for (int i = 0; i < account.size(); i++) {
            if(account.get(i).getAccountNumber() == findAcc){          // 필기. .get(i).getAccountNumber()을 통해 반복문을 돌리며 계좌를 찾음.
                return account.get(i);
            }
        }
        return null;
    }
    /* 설명. SavingAccount 이자 평균 구하기. */
    public double interestAvgCal(){
        int cnt = 0;
        double interestAvg = 0;
        for(Account accArr : account){
            if(accArr instanceof SavingAccount && !(accArr instanceof StudentAccount)){
                interestAvg += ((SavingAccount) accArr).getInterest();
                cnt++;
            }
        }
        interestAvg /= (double)cnt;
        return interestAvg;
    }

    /* 설명. 수표를 발행 후 계산 */
    public void payCheck(Account account, double money){
        ((CheckingAccount)account).bankruptcy(money);
    }

}
