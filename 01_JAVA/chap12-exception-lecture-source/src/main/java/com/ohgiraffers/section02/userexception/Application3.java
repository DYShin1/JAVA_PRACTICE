package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.ExceptionTest2;
import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. multi-catch 구문을 이해하고 활용할 수 있다. */
        ExceptionTest2 et = new ExceptionTest2();

        try {
            et.checkEnoughtMoney(20000, 50000);
        } catch (PriceNegativeException | MoneyNegativeException e){
            System.out.println("두 개의 예외 처리: " + e.getMessage());
        } catch (NotEnoughMoneyException e){
            System.out.println("하나의 예외 처리: " + e.getMessage());
        } finally {
            System.out.println("반드시 실행되는 finally 내용");
        }

        System.out.println("프로그램을 종료합니다.");

        /* 필기.
         *  catch 불럭이 많을 때는 위에서 아래로 예외 타입을 확인하게 되며 부모타입에 해당하는 예외 처리는
         *  아래쪽으로 작성해야 한다.
        * */

    }
}
