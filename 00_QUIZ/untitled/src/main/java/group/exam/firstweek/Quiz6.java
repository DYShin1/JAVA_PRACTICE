package group.exam.firstweek;

import java.util.Scanner;

public class Quiz6 {

    /* Q.숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울을 출력하시오. 다른 숫자 입력 시에 경고문 작성하시오. */

    public void quiz6() {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Month를 입력하시요: ");

        int month = sc.nextInt();

        if(month < 0 || month > 12){
            System.out.println("잘못 입력하셨습니다.");
        } else {
            if(month == 3 || month == 4 || month == 5){                 // 3,4,5 봄
                System.out.println("봄");
            } else if (month == 6 || month == 7 || month == 8) {        // 6,7,8 여름
                System.out.println("여름");
            } else if (month == 9 || month == 10 || month == 11) {      // 9,10,11 가을
                System.out.println("가을");
            } else {                                                    // 나머지는 겨울이다.
                System.out.println("겨울");
            }
        }
    }
}
