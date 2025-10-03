package com.ty;
class Car {
    String brand;
    int year;

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Swift";
        c1.year = 2022;
        c1.display();
    }



}

