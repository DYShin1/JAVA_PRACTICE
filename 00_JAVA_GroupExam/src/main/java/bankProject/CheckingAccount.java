public class CheckingAccount extends Account {
    public CheckingAccount(int a) {
        super(a);
    }

    private double overdraft = 0.0;

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(int overdraft) {
        this.overdraft = overdraft;
    }

    public void bankruptcy(double overdraft, int pay){
        if(getBalance() + overdraft >= pay){
            withdraw(pay);
        }else {
            System.out.println("부도");
        }
    }
}
