package com.ohgiraffers.section02.userexception.exception;

public class MoneyNegativeException extends Exception {
    public MoneyNegativeException(String money) {
        super(money);
    }
}
