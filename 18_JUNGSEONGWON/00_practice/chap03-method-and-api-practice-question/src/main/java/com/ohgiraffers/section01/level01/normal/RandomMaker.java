package com.ohgiraffers.section01.level01.normal;

public class RandomMaker {

    public String rockPaperScissors(){
        String[] rand = {"가위","바위","보"};
        return rand[(int)(Math.random()*3)];
    }

    public static String tossCoin(){
        String[] coin = {"앞면","뒷면"};
        return coin[(int)(Math.random()*2)];

    }
    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : rockPaperScissors
     *
     * 가위,바위,보 중에 하나를 출력
     * (가위,바위,보 는 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 가위
     * */

    /*
     * static 메소드로 생성
     * 반환형 : String
     * 메소드명 : tossCoin
     *
     * 동전 앞/뒤 중에 하나를 출력
     * (앞면,뒷면은 난수를 이용하여 구현)
     *
     * -- 출력 --
     * 앞면
     *
     * */

}
