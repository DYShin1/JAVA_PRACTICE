package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.ExceptionTest;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 사용자 정의의 예외클래스 정의 후 발생한 사용자 정의의 예외를 처리할 수 있다. */
        ExceptionTest et = new ExceptionTest();
        try {
//            et.checkEnoughtMoney(30000, 50000);
            et.checkEnoughtMoney(50000, 30000);
        }
//        catch (PriceNegativeException e) {
//            System.out.println(e.getMessage());
//        } catch (NotEnoughMoneyException e){
////            throw new RuntimeException(e);
//            System.out.println(e.getMessage());
//        } catch (MoneyNegativeException e){
////            throw new RuntimeException(e);
//            System.out.println(e.getMessage());
//        }
        catch (Exception e){                // 다형성을 활용한 catch 처리 발생
            System.out.println("예외 메시지: " + e.getMessage());
        }
    }
}
