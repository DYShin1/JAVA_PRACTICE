package com.ohgiraffers.section06.statickeyword;

public class StaticFieldTest {

    private int nonStaticCount;
    private static int staticCount;

    public StaticFieldTest() {
    }

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public static int getStaticCount() {
        return staticCount;
    }

    /* 설명. setter를 대신해서 필드 값을 각각 증가 시킬 두 메소드 추가 */
    public void increaseNonStaticCount(){
        this.nonStaticCount++;
    }

    public static void increaseStaticCount(){
//        StaticFieldTest.staticCount++;
        staticCount++;
    }

}
