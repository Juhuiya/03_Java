package com.ohgiraffers.section06.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Application4 {

    public static void main(String[] args) {

        // 기준에 대한 내용
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        // 과거 미래 현재에 대한 내용
        LocalDate past = LocalDate.of(2022, 11, 11);
        LocalDateTime future = LocalDateTime.of(2025, 9, 9, 9, 9, 9);
        ZonedDateTime now = ZonedDateTime.now();

        // 이전, 이후, 같은 날짜 확인(각 time패키지 자료형마다 전달인자는 같은 타입이어야한다.
        System.out.println(localDate.isAfter(past)); // localDate가 past 날짜보다 뒤에 있냐고 물어보는 코드
        System.out.println(localDateTime.isBefore(future));
        System.out.println(zonedDateTime.isEqual(now));



    }
}
