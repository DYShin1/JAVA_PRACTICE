package project.bank;

import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        int accNum = 0;
        int find = 0;
        int delAcc = 0;
        Frame frame = new Frame();

        while (true){
            System.out.println("1. 계좌 조회 2. 계좌 생성 3. 계좌 삭제 4. 수표 생성 5. 입금 6. 출금 7. 모든 계좌 출력 9. 종료");
            num = sc.nextInt();
            switch (num){
                case 1:
                    System.out.println("찾을 계좌 번호를 입력하세요.");
                    find = sc.nextInt();
                    frame.findAcc(find);
                    break;
                case 2:
                    frame.makeAccount();
                    break;
                case 3:
                    System.out.println("삭제할 계좌 번호를 입력하세요.");
                    delAcc = sc.nextInt();
                    frame.deleteAcc(delAcc);
                    break;
                case 4:
//                    System.out.println("수표 생성 금액 입력: ");
//                    double checkMoney = sc.nextDouble();
//                    System.out.println("");
                    break;
                case 5:
                    System.out.println("입금할 계좌 입력하세요: ");
                    accNum = sc.nextInt();
                    System.out.println("입금할 금액 입력하세요: ");
                    double deposit = sc.nextDouble();
                    frame.depositAllow(accNum, deposit);
                    break;
                case 6:
                    System.out.println("출금할 계좌 입력하세요: ");
                    accNum = sc.nextInt();
                    System.out.println("출금할 금액 입력하세요: ");
                    double withdraw = sc.nextDouble();
                    frame.withdrawAllow(accNum, withdraw);
                    break;
                case 7:
                    frame.printAll();
                    break;
                case 9:
                    num = 9;
                    break;
            }
            if (num == 9) {
                break;
            }
        }

    }
}
