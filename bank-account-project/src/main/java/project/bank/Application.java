package project.bank;

import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0;
        Frame frame = new Frame();

        while (true){
            System.out.println("1. 계좌 조회 2. 계좌 생성 3. 계좌 삭제 4. 수표 생성 5. 입금 6. 출금 7. 모든 계좌 출력 8. 이자지급 9. 학생이자지급 0. 종료");
            num = sc.nextInt();
            switch (num){
                case 1:
                    frame.printAccount();
                    break;
                case 2:
                    frame.makeAccount();
                    break;
                case 3:
                    frame.deleteAcc();
                    break;
                case 4:
                    frame.checkPay();
                    break;
                case 5:
                    frame.depositAllow();
                    break;
                case 6:
                    frame.withdrawAllow();
                    break;
                case 7:
                    frame.printAll();
                    break;
                case 8:
                    frame.giveInterest();
                    break;
                case 9:
                    frame.giveStudentInterest();
                case 0:
                    num = 0;
                    break;
            }
            if (num == 0) {
                break;
            }
        }

    }
}
