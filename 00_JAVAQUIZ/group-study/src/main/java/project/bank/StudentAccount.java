package project.bank;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

public class StudentAccount extends SavingAccount {

    private double stdInterest;
    private LocalDate allowWithdraw = LocalDate.of(2030, 1, 1);         // 학생 적금 계좌는 2030년 이후에 인출 가능하다.
    private Period diff = null;

    public StudentAccount(int a, double interest, double stdInterest) {
        super(a, interest);
        this.stdInterest = stdInterest;
    }

    public double getStdInterest() {
        return stdInterest;
    }

    public void setStdInterest(double stdInterest) {
        this.stdInterest = stdInterest;
    }

    public void avgInterest(int avgInterest){
        setInterest(avgInterest);
    }

    /* 필기.
     *  applyInterest 메소드는 LocalDate 클래스로 인출 신청 날짜를 now 파라미터로 인자를 전달받는다.
     *  Period.between을 통해 allowWithdraw 변수와 now 날짜 차이를 diff 변수에 저장한다.
    * */
    public void applyInterest(LocalDate now){
        diff = Period.between(now, allowWithdraw);
        if(diff.getYears() >= 0){                                   // 2030년 이후 인출이 가능하므로 .getYears 메소드를 사용해 해당 날짜 차이가 0보다 크면 2030년
                                                                    // 이후를 의미하므로 이자를 더하여 인출이 가능하게 한다.
            deposit(getBalance()*((getInterest() + stdInterest)*0.01));
        } else{
            System.out.println("적금 만기가 아직 안되었습니다.");
        }
    }

    @Override
    public String toString(){
        return "StudentAccount -> Acc " + getAccountNumber() + ": " + "balance = " + getBalance();
    }
}
