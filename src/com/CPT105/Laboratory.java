package com.CPT105;/*
 * CW2 Lab Group Mon 14
 */

// The Laboratory class represents a laboratory

public class Laboratory {
    // Do not modify or add the instance variables
    private String location;
    private int capacity;

    // Do not modify this constructor
    // It initializes the two instance variables
    public Laboratory(String location, int capacity) {
        this.location = location;
        this.capacity = capacity;
    }

    // Do not modify this method
    // It returns the string representation of a Laboratory object
    // in the format "Lab at location, capacity students"
    @Override
    public String toString() {
        return "Lab at " + location + ", " + capacity + " students";
    }


    // CW2 Lab Group Mon 14 Question 1
    // Complete the method enlarge
    // It enlarges the capacity by percentage percent, rounding up

    public void enlarge(double percentage) {
        percentage = percentage / 100;
        capacity += Math.ceil(capacity * percentage);
    }


    // CW2 Lab Group Mon 14 Question 2
    // Complete the method largerThan
    // It returns true iff this laboratory has larger capacity than the other laboratory
    public boolean largerThan(Laboratory other) {

        int i =Integer.compare(this.capacity,other.capacity);
        return i == 1;

    }


    // Test Client
    public static void main(String[] args) {
        Laboratory lab1 = new Laboratory("SD545", 80);
        System.out.println(lab1);     // Lab at SD545, 80 students
        lab1.enlarge(2.0);
        System.out.println(lab1);     // Lab at SD545, 82 students

        Laboratory lab2 = new Laboratory("SD446", 40);
        System.out.println(lab1.largerThan(lab2));     // true
        System.out.println(lab2.largerThan(lab1));     // false
    }

}
