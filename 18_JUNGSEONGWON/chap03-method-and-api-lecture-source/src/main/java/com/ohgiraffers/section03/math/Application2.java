package com.ohgiraffers.section03.math;

public class Application2 {
    public static void main(String[] args) {
        // 0.0 <= x < 1.0
        // (int) (Math.random() * 구하려는 난수의 갯수) + 구하려는 난수의 최솟값 
        // 0 ~ 9 까지의 난수 생성
        int ramdom1 = (int)(Math.random() * 10) + 0;
        System.out.println("난수 생성 : " + Math.random());
        System.out.println("ramdom1 = " + ramdom1);
        
        // 1 ~ 10 까지의 난수 생성
        int random2 = (int)(Math.random() * 10) + 1;
        System.out.println("random1 = " + random2);

        // 10 ~ 15 까지의 난수 생성
        int ramdom3 = (int)(Math.random() * 6) + 10;
        System.out.println("ramdom3 = " + ramdom3);
        
        // -128 ~ 127 까지의 난수 생성
        int random4 = (int)(Math.random() * 256) + (-128);
        System.out.println("random4 = " + random4);
    }
    
}
