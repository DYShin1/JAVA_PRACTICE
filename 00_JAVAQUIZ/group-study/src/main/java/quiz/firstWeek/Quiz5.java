package quiz.firstWeek;

import java.util.Scanner;

public class Quiz5 {

    /* 한 초등학교에는 1학년부터 6학년까지 한 해의 마지막 날 시험을 보는데
     학년은 80점 이상, 4학년부터 5학년까지는 70점 이상, 1학년부터 3학년까지는
     60점 이상의 점수를 받아야 다음 학년으로 올라갈 수 있다. 사용자들로부터 이름,
     점수, 학년을 받아 아래와 같은 결과물이 출력되도록 작성하시오. (입력 받는 값은
     학년은 1~6까지, 점수는 0~100 까지만 받을 수 있고 그 이외의 숫자를 받게 되면
     “다시 입력하세요”를 출력  )

    → 학년별 점수 충족시 : “OOO 학생은 다음 학년으로 갑니다”

    → 학년별 점수 미달시 : “OOO 학생은 내년에 더 노력하세요” */

    public void quiz5() {
        Scanner sc = new Scanner(System.in);

        System.out.printf("이름, 학년 , 점수를 입력하세요: ");
        String name = sc.nextLine();
        int grade = sc.nextInt();
        int score = sc.nextInt();

        if(grade < 1 || grade > 6 || score < 0 || score > 100){             // 입력값이 학년 1~6, 점수 0 ~ 100사이 값이다.
            System.out.println("다시 입력하세요.");
        } else{
            if (grade <= 3 && score >= 60) {                                // 1,2,3학년이며 60점이 넘는 경우
                System.out.println(name + "학생은 다음학년으로 갑니다.");
            } else if (grade <= 5 && score >= 70) {                         // 4,5학년이며 70점이 넘는 경우
                System.out.println(name + "학생은 다음학년으로 갑니다.");
            } else if (grade == 6 && score >= 80) {                         // 6학년이며 80점이 넘는 경우이다.
                System.out.println(name + "학생은 다음학년으로 갑니다.");
            } else {                                                        // 나머지는 모두 유급하는 경우에 해당된다.
                System.out.println(name + "학생은 내년에 더 노력하세요.");
            }
        }

    }
}
