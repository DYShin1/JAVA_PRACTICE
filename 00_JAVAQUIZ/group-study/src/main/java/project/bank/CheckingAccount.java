package project.bank;
public class CheckingAccount extends Account {
    private double overdraft = 0;
    private double loan = 0;
    private double leftmoney = 0;


    public CheckingAccount(int a, double overdraft) {
        super(a);
        this.overdraft = overdraft;
    }

    public void loan(double loan){
        this.loan = loan;
    }

    /* 필기.
     *  설명. pay(결제금액)을 파라미터로 받는다. overdraft(한도 가능 금액) + 기존 계좌 금액을 합친 금액이 pay보다 크면
     *   그 차액 만큼 대출을 받아 leftmoney 변수에 저장 후 loan 메소드에 값을 저장해 둔다.
     *   그 후 withdraw 메소드의 금액은 0원이 되며, 대출은 loan 메소드에 저장되어 있다.
     *   대출 가능 금액을 넘어서면 부도를 출력한다.
    * */
    public void bankruptcy(double overdraft, double pay){
        if(getBalance() + overdraft >= pay){
            leftmoney = pay - (getBalance() + overdraft);
            loan(leftmoney);
            withdraw(getBalance());
        }else {
            System.out.println("부도");
        }
    }

    @Override
    public String toString(){
        return "CheckingAccount -> Acc " + getAccountNumber() + ": " + "balance = " + getBalance();
    }
}
