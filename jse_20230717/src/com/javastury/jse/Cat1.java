package com.javastury.jse;

public class Cat1 {
    private String name;
    private int age;
    private static int totalAge = 0;

    public Cat1(String name, int age) {
        this.name = name;
        this.age = age;
        totalAge += age;
    }

    public static int getTotalAge() {
        return totalAge;
    }

    public static void main(String[] args) {
 
        Cat1 cat1 = new Cat1("야옹이", 3);
        Cat1 cat2 = new Cat1("미야옹", 5);
        Cat1 cat3 = new Cat1("냥냥이", 2);

      
        int totalAge = Cat1.getTotalAge();
        System.out.println("모든 고양이의 나이 총합: " + totalAge + "세");
    }
}
