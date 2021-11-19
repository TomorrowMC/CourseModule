package com.CW_end;/*
 * CW2 Lab Group Fri 16
 */

// The Vector2DMag class represents an integer vector in three-dimensional space,
// and its Euclidean norm.

public class Vector3DNorm extends Vector3D {

    // Do not modify or add the instance variables
    // Instance variable norm stores the Euclidean norm of this vector
    // Recall the Euclidean norm of a vector is the square-root of the sum of its squared components
    private double norm;

    // Do not modify this method
    public double norm() {
        return norm;
    }

    ;


    // CW2 Lab Group Fri 16 Question 3
    // Complete the constructor of the class Vector3DNorm
    // It initializes all its instance variables
    public Vector3DNorm(int x, int y, int z) {
        super(x, y, z);
        int i = this.dotProduct(this);
        norm = Math.sqrt(i);

    }


    // CW2 Lab Group Fri 16 Question 4
    // Complete the toString() method so that
    // it returns the string representation of a Vector3DNorm object
    // in the format "[x, y, z]" followed by ", " and the Euclidean norm value
    @Override
    public String toString() {
        String str1 = super.toString();
        String str2 = Double.toString(norm);
        String str3 = ", " + str2;
        return str1 + str3;

    }


    public static void main(String[] args) {

        Vector3DNorm v1 = new Vector3DNorm(2, 3, 6);
        System.out.println(v1.norm());        // 7.0
        System.out.println(v1);               // [2, 3, 6], 7.0

    }

}
