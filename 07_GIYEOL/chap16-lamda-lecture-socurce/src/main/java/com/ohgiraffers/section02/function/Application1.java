package com.ohgiraffers.section02.function;

import java.time.LocalTime;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;



/* JDK 8에서 빈번하게 사용되는 함수적 인터페이스를 표준 API로 제공하고 있다.
 *  Consumer : 리턴값이 없는 accept() 메소드를 가지고 있다.
 *  Supplier : 매개변수가 없고 리턴 값이 있는 getXXX() 메소드를 가지고 있다.
 *  Function : 매개변수와 리턴값이 있는 applyXXX() 메소드를 가지고 있다. (매개변수를 리턴값으로 매핑하는 역할)
 *  Operator : Function과 똑같이 applyXXX() 메소드를 가지고 있다. 차이점은 매개변수로 연산을 한 후 통일타입으로 리턴한다.
 *  Predicate : 매개변수와 boolean 값을 반환하는 testXXX()를 가지고 있다. (매개변수를 활용하여 boolean 반환)
 * */
public class Application1 {
    public static void  main(String[] args) {
        //매개변수가 없고, 리턴값도 없는 람다
        Runnable runable = () -> System.out.println("Hello World");
        runable.run();


        //매개변수 없고,리턴삾이 없는 람다
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        };
        r.run();

        Runnable runable2 = () -> System.out.println("Hello World");
        runable.run();

        Consumer<String> c = new Consumer<String>() {
        @Override
        public void accept (String s){
            System.out.println(s);

        }
    };
        c.accept("Hi");
        // consumer<T>#accrpy(T t) :객체 T를 받아 소비
        Consumer<String> consumer = (str) -> System.out.println(str + "이가 입력됨");
        consumer.accept("hello");

        //Biconsumer<T,U>#accept(T t, U u) : void : 객체를 T , U를 받아 소비함
        BiConsumer<String, LocalTime> biConsumer = (str1,time)-> System.out.println(str1+time);
        biConsumer.accept("hello", LocalTime.now());

        //Intconsumer#accept(int value) : void : int값을 받아 소비함
        IntConsumer intConsumer = (num) -> System.out.println("입력한 숫자는 "+ num);
        intConsumer.accept(1);

        //objintconsumer<T>#accept<T t, int value) : void > 객체 T와 int값을 받아 소비함
        ObjIntConsumer<Random> objIntConsumer = (random,bound)-> System.out.println("0부터"+random+ "까지" + random.nextInt(bound));
        objIntConsumer.accept(new Random(),10);


    }
}
