package quiz.firstWeek;

import java.util.Scanner;

public class Quiz1 {

    /* 문제. 날짜를 입력받아 1일이면 ‘월’ / 2일이면 ‘화’ / 3일이면 ‘수’ / … / 7일이면 ‘일’ / 8일이면 ‘월’ / …..
    위 방식으로 요일을 출력하시오. */

    public void quiz1() {
        Scanner sc = new Scanner(System.in);

        System.out.printf("날짜를 입력하세요: ");

        int day = sc.nextInt();
        if(day >= 1 || day <= 31){                  // 1 ~ 31일 중 값만 입력 받는다.
            if(day % 7 == 1){
                System.out.println("월요일");
            } else if (day % 7 == 2){
                System.out.println("화요일");
            } else if (day % 7 == 3){
                System.out.println("수요일");
            } else if (day % 7 == 4){
                System.out.println("목요일");
            } else if (day % 7 == 5){
                System.out.println("금요일");
            } else if (day % 7 == 6){
                System.out.println("토요일");
            } else if (day % 7 == 0){
                System.out.println("일요일");
            }
        } else{
            System.out.println("날짜가 아닙니다.");
        }

    }
}
