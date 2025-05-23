package com.ohgiraffers.hw1.run;
import com.ohgiraffers.hw1.model.dto.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO[] students = {
                new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과"),
                new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과"),
                new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과")
        };

        for (StudentDTO student : students) {
            System.out.println(student.information());
        }

        EmployeeDTO[] employees = new EmployeeDTO[10];
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (count < 10) {
            System.out.print("사원 정보를 입력하시겠습니까? (y/n): ");
            if (!sc.next().equalsIgnoreCase("y")) break;

            System.out.print("이름: "); String name = sc.next();
            System.out.print("나이: "); int age = sc.nextInt();
            System.out.print("신장: "); double height = sc.nextDouble();
            System.out.print("몸무게: "); double weight = sc.nextDouble();
            System.out.print("급여: "); int salary = sc.nextInt();
            System.out.print("부서: "); String dept = sc.next();

            employees[count++] = new EmployeeDTO(name, age, height, weight, salary, dept);
        }
        sc.close();

        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].information());
        }
    }
}
