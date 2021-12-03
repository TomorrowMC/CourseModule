package com.CPT105;/*
 * CW2 Lab Group Mon 14
 */

// The ComputerLab class represents a computer laboratory

import com.CPT105.Laboratory;

public class ComputerLab extends Laboratory {

    // Do not modify or add the instance variables
    private int numOfComp;

    // Do not modify this method
    public int getNumOfComp() { return numOfComp; }


    // CW2 Lab Group Mon 14 Question 3
    // Complete the constructor of the class ComputerLab
    // It initializes all its instance variables
    public ComputerLab(String location, int capacity, int numOfComp) {
		super(location,capacity);
        this.numOfComp = numOfComp;
		
		
    }


    // CW2 Lab Group Mon 14 Question 4
    // Complete the overridden method enlarge
    // It enlarges the capacity and numOfComp by percentage percent, rounding up
    @Override
    public void enlarge(double percentage) {
        double i = percentage/100;
		super.enlarge(percentage);
        numOfComp += Math.ceil(numOfComp * i);
		
		
    }


    // Test Client
    public static void main(String[] args) {
        ComputerLab clab1 = new ComputerLab("SD545", 80, 70);
        System.out.println(clab1 + ", " + clab1.getNumOfComp() + " computers");
        // Lab at SD545, 80 students, 70 computers

        clab1.enlarge(2.0);
        System.out.println(clab1 + ", " + clab1.getNumOfComp() + " computers");
        // Lab at SD545, 82 students, 72 computers


    }

}
