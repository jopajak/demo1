package com.example.demo1;

public class Contestant {
    private String name;
    private String surname;
    private int age;
    private double weight;

    public Contestant(String name, String surname, int age, double weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
    }




    public double getWeight() {
        return weight;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }
}