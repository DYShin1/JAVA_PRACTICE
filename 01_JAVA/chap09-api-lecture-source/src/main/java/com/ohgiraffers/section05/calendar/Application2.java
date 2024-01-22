package com.ohgiraffers.section05.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 
{
    
    
    public static void main(String[] args) {
        
        /* 수업목표. java.util.Calendar클레스의 사용법을 이해하고 사용할 수 있다. */
        /* 필기.
         *  Date형 대비 개선점
         *   1. timezone과 관련된 기능이 추가되었다.
         *   2. 윤년 관련 기능이 내부적으로 추가할  수 있다.
         *   3. 날짜 및 시간개념의 필드를 추가해 불필요한 메소드를 활용하면 메소드들이 죽는다.
        * */

        Calendar cal = Calendar.getInstance();
        System.out.println("cal = " + cal);

        Calendar cal2 = new GregorianCalendar();
        System.out.println("cal2 = " + cal2);

        int year = 1987;
        int month = 8;          //입력하고자 하는 월 -1
        int day0fMonth = 15;
        int hour = 17;
        int min = 30;
        int second = 0;

        Calendar birthday = new GregorianCalendar(year, month, day0fMonth, hour, min, second);
        System.out.println(birthday);

        /* 설명. GregorianCalendar 객체가 가진 값 확인 */
        System.out.println("태어난 해: " + birthday.get(1));
        System.out.println("태어난 해: " + birthday.get(Calendar.YEAR));
        System.out.println("태어난 월: " + (birthday.get(2)+1));       // get() 메소드로 반환받은 값은 값에 +1을 해줘야 우리가 생각하는 월의 개념이 된다.
        System.out.println("태어난 월: " + (birthday.get(Calendar.MONTH)+1));
        System.out.println("태어난 일: " + birthday.get(5));
        System.out.println("태어난 일: " + birthday.get(Calendar.DAY_OF_MONTH));

        /* 설명. 요일에 대해 알아보자. */
        String day = "";
        switch (birthday.get(Calendar.DAY_OF_WEEK)){
            case Calendar.SUNDAY: day = "일"; break;
            case Calendar.MONDAY: day = "월"; break;
            case Calendar.TUESDAY: day = "화"; break;
            case Calendar.WEDNESDAY: day = "수"; break;
            case Calendar.THURSDAY: day = "목"; break;
            case Calendar.FRIDAY: day = "금"; break;
            case Calendar.SATURDAY: day = "토"; break;
        }
        System.out.println("내 생일은 " + day + "요일이야!");

        /* 설명. 하나씩 불러와 보자. */
        System.out.println("AM/PM: " + birthday.get(Calendar.AM_PM));           // 0은 오전, 1은 오후
        System.out.println("hourOfDay: " + birthday.get(Calendar.HOUR_OF_DAY));     // 24시간 체계
        System.out.println("hour: " + birthday.get(Calendar.HOUR));     // 12시간 체계
        System.out.println("min: " + birthday.get(Calendar.MINUTE));
        System.out.println("sec: " + birthday.get(Calendar.SECOND));

        /* 설명. SimpleDateFormat 활용하기(feat. java.util.Date형으로 변환 후 활용) */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss E요일");
        String birthDayString = sdf.format(new Date(birthday.getTimeInMillis()));
        System.out.println("birthDayString = " + birthDayString);

    }
}
