package org.example;

import org.example.entity.Car;
import org.example.entity.Person;
import org.example.entity.Triangle;

import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Car ma'lumotlari:");
        car.getColor("Black");
        car.getModel("BMW X7");
        car.getPrice("50000$");
        car.getTuzilma("Avtomat");

        System.out.println("_____________________________");

        Triangle triangle = new Triangle();
        System.out.println("Uchburchak ma'lumotlari:");
        triangle.getA(12.3);
        triangle.getB(7);
        triangle.getC(21.3);

        System.out.println("_____________________________");

        Person person = new Person();
        person.getName("Javlon");
        person.getSurname("Fatxullayev");
        person.getAge(21);



    }
}