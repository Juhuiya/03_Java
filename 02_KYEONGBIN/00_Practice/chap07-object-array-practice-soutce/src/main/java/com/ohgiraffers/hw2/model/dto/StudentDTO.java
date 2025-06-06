package com.ohgiraffers.hw2.model.dto;

public class StudentDTO {
    private int grade;
    private int classroom;
    private String name;
    private int kor;
    private int eng;
    private int math;

    public StudentDTO() {}

    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getGrade() { return grade; }
    public void setGrade(int grade) { this.grade = grade; }

    public int getClassroom() { return classroom; }
    public void setClassroom(int classroom) { this.classroom = classroom; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getKor() { return kor; }
    public void setKor(int kor) { this.kor = kor; }

    public int getEng() { return eng; }
    public void setEng(int eng) { this.eng = eng; }

    public int getMath() { return math; }
    public void setMath(int math) { this.math = math; }

    public String information() {
        return "Student grade: " + grade +
                " Classroom: " + classroom +
                " Name: " + name +
                " Kor: " + kor +
                " Eng: " + eng +
                " Math: " + math;
    }

    @Override
    public String toString() {
        return "StudentDTO { " +
                "grade=" + grade +
                ", classroom=" + classroom +
                ", name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                " }";
    }

    public int averagePoints() {
        return ((getKor() + getEng() + getMath()) / 3);
    }
}
