package com.ohgiraffers.section01.xmlconfig;


import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");

        MemberDTO member = context.getBean(MemberDTO.class);

        /* 설명. 컨테이너가 관리중인 MemberDTO타입의 bean에 은행코드 20번인 PersonalAccount 객체가 주입되어 있음을 확인 */
        System.out.println(member.getPersonalAccount());

        System.out.println(member.getPersonalAccount().deposit(10000));
        System.out.println(member.getPersonalAccount().getBalance());
        System.out.println(member.getPersonalAccount().withDraw(5000));
        System.out.println(member.getPersonalAccount().getBalance());
    }
}
