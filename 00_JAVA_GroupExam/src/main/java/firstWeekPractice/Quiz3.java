package firstWeekPractice;

import java.util.Random;
import java.util.Scanner;

public class Quiz3 {

    /* # [문제] 가위, 바위, 보 프로그램 작성하기

    - 사용자 입력과 random 메소드를 사용하여, 사용자(User)와 컴퓨터가 대결하는 가위 바위 보 게임을 만들어보자.

    - 입력: [문자열] "가위", "바위" 혹은 "보"
    - 출력: [문자열] 결과 반환 */
    public void quiz3() {
        Scanner sc = new Scanner(System.in);

        System.out.printf("가위 바위 보를 입력하세요.");

        String rSP = sc.nextLine();
        int rSPNum = 0;

        int randNum = new Random().nextInt(3);     //랜덤으로 0, 1, 2 값을 받는다.

        if("가위".equals(rSP)){
            rSPNum = 0;                                     // 0을 가위로 정한다.
        } else if ("바위".equals(rSP)) {
            rSPNum = 1;                                     // 1은 바위로 정한다.
        } else {
            rSPNum = 2;                                     // 나머지 2는 보가 된다.
        }

        if(rSPNum == 0){                                    // 내가 가위를 냈을 경우
            if(randNum == 0){                               // 컴퓨터도 가위를 내어 비기는 경우
                System.out.println("비겼습니다.");
            } else if (randNum == 1) {                      // 컴퓨터가 바위를 내어 지는 경우
                System.out.println("졌습니다.");
            } else {                                        // 나머지 내가 이긴 경우
                System.out.println("이겼습니다.");
            }
        } else if(rSPNum == 1){
            if(randNum == 1){
                System.out.println("비겼습니다.");
            } else if (randNum == 2) {
                System.out.println("졌습니다.");
            } else {
                System.out.println("이겼습니다.");
            }
        } else {
            if(randNum == 2){
                System.out.println("비겼습니다.");
            } else if (randNum == 0) {
                System.out.println("졌습니다.");
            } else {
                System.out.println("이겼습니다.");
            }
        }

    }
}
