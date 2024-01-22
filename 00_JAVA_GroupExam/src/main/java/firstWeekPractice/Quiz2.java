package firstWeekPractice;

import java.util.Scanner;

public class Quiz2 {

    /* # 1. 문제 - 중앙값 계산기
    - 사용자로 부터 세 개의 수를 입력 받은 후, 입력 받은 수 중 중앙 값을 출력 하시오. */

    public void quiz2() {
        System.out.printf("세 개의 수를 입력하세요: ");

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int result;

        if((num2 >= num1 && num3 <= num1) || (num2 <= num1 && num3 >= num1)) {                  // num1이 중간값인 경우
            result = num1;
        } else if((num1 >= num2 && num3 <= num2) || (num1 <= num2 && num3 >= num2)){            // num2가 중간값인 경우
            result = num2;
        } else {
            result = num3;                                                                      // 나머지 num3이 중간값이 된다.
        }

        System.out.println("중간값은 " + result + "입니다.");

    }
}
