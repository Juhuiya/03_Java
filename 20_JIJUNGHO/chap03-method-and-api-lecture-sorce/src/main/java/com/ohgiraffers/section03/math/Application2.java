package com.ohgiraffers.section03.math;

public class Application2 {
    public static void main(String[] args) {
        // 0 ~ 9까지 난수 생성
        // (int) (Math.random() * 구하려는 난수의 갯수) + 구하려는 난수의 최소값
        int random1 = (int)(Math.random() * 10) + 0;

        System.out.println("random1 = " + random1);
        
        // 1 ~ 10까지의 난수
        int random2 = (int) (Math.random() * 10) + 1;
        System.out.println("random2 = " + random2);

        // 10 ~ 15까지의 난수
        int random3 = (int)(Math.random() * 6) + 10;
        System.out.println("random3 = " + random3);

        // -128 ~ 127까지의 난수
//        int random4 = (int)(Math.random() * 256) -128 ;
        int random4 = (int)(Math.random() * 256) + (-128) ;
        System.out.println("random4 = " + random4);
    }
}
