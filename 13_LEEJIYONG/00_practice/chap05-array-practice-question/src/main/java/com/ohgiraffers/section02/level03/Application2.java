package com.ohgiraffers.section02.level03;

public class Application2 {

    public static void main(String[] args) {

        /*
        * System.arraycopy를 사용하여 배열 복사 합치기
        * */
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = {7, 8, 9, 10};
        int[] d = new int[10];

        System.arraycopy(a, 0, d, 0, a.length);
        System.arraycopy(b, 0, d, a.length, b.length);
        System.arraycopy(c, 0, d, a.length+b.length, c.length);

        // 향상된 for문을 이용하여 위의 a, b, c의 배열의 값을 d의 배열에 합치기한 후 출력

        for(int i : d){
            System.out.println(i);
        }
    }
}
