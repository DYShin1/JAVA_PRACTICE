public class SavingAccount extends Account {

    public SavingAccount(int a) {
        super(a);
    }

    private double interest;

    public double getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    public void applyInterest(int interest, int year){
        if(year >= 5){
            deposit(getBalance()*(interest*0.01));
        } else{
            System.out.println("적금 만기가 아직 안되었습니다.");
        }
    }
}
