package com.company;

public class Person {
    private String name;
    private byte age;
    private String corp;
    private static byte id = 0;

    Person(String name, int age, String corp) {
        if(id==0){
            this.name = name;
            this.age = (byte) age;
            this.corp = corp;
            System.out.println("Hi! I am " + name + " and I am " + age + " years old. I am working in " + corp + ".");
        }
        id++;
    }
}
