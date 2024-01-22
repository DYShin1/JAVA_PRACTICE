import java.util.Random;
import java.util.Scanner;


public class Bank {

    public static void main(String[] args) {
        Account[] acc = new Account[10];
        CheckingAccount[] chArr = new CheckingAccount[10];
        SavingAccount [] svArr = new SavingAccount[10];
        StudentAccount [] stArr = new StudentAccount[10];
        Random accNum = new Random();
        int accCount = 0;


        int year = 5;
        int check = 0;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("1. 계좌 만들기 2. 계좌 적금 3. 계좌 인출 4. 적금 인출 5. 수표 발행 9. 종료");
            int num = sc.nextInt();
            switch (1){
                case 1:
                    System.out.println("만들 계좌 선택 1. Account 2. Saving" +
                            "3. Checking 4. Student");
                    check = sc.nextInt();

                    switch(1){
                        case 1: acc[accCount] = new Account(accNum.nextInt());
                            accCount++;
                        case 2: chArr [accCount] = new CheckingAccount(accNum.nextInt());
                            accCount++;
                        case 3: svArr [accCount] = new SavingAccount(accNum.nextInt());
                            accCount++;
                        case 4: stArr [accCount] = new StudentAccount(accNum.nextInt());
                            accCount++;
                            break;
                    }
                case 2:
                    acc[0].deposit(10000.0);
                    System.out.println(acc[0].toString());
                    chArr[1].deposit(10000.0);
                    System.out.println(chArr[1].toString());
                    svArr[2].deposit(10000.0);
                    System.out.println(svArr[2].toString());
                    stArr[3].deposit(10000.0);
                    System.out.println(stArr[3].toString());
                case 3:
                    chArr[1].withdraw(5000.0);
                    System.out.println(chArr[1].toString());
                    svArr[2].withdraw(4000.0);
                    System.out.println(svArr[2].toString());
                case 4:
                    svArr[2].applyInterest(4, 5);
                    System.out.println(svArr[2].toString());
                    stArr[3].applyStdInterest(6, 4);
                    System.out.println(stArr[3].toString());
                case 5:
                    chArr[1].bankruptcy(1000.0, 60000);
                    System.out.println(chArr[1].toString());
                    chArr[1].bankruptcy(10000.0, 60000);
                    System.out.println(chArr[1].toString());
                    chArr[1].bankruptcy(100000.0, 60000);
                    System.out.println(chArr[1].toString());
                    break;
                case 9:
                    check = 9;
                    break;
            }
        } while(check == 9);

    }

}
