package com.testjava.jse;

public class Student {
    private static int studentCount = 0;
    private String name;

    public Student(String name) {
        this.name = name;
        studentCount++; // 학생이 추가될 때마다 전체 학생 수 증가
    }

    public String getName() {
        return name;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    
    public static void main(String[] args) {
        Student student1 = new Student("홍길동");
        System.out.println(student1.getName() + " 학생이 생성되었습니다.");

        Student student2 = new Student("김철수");
        System.out.println(student2.getName() + " 학생이 생성되었습니다.");

        System.out.println("전체 학생 수는 " + Student.getStudentCount() + "명입니다.");
    }
}
