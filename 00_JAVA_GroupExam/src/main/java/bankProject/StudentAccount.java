public class StudentAccount extends SavingAccount {

    public StudentAccount(int a) {
        super(a);
    }

    private double stdInterest = 0;

    public double getStdInterest() {
        return stdInterest;
    }

    public void setStdInterest(double stdInterest) {
        this.stdInterest = stdInterest;
    }

    public void applyStdInterest(double stdInterest, int year){
        if(year >= 5){
            deposit( getBalance()*(stdInterest*0.01));
            System.out.println(toString());
        } else{
            System.out.println("적금 만기가 아직 안되었습니다.");
        }
    }
}
