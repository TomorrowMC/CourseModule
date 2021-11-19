package com.CW_end;/*
 * CW2 Lab Group Fri 16
 */

// The Vector3D class represents an integer vector in three-dimensional space.

public class Vector3D {

    // Do not modify or add the instance variables
    // The vector components are stored in comp, an array of integers.
    private int[] comp;

    // Do not modify this constructor
    // It initializes the two instance variables
    public Vector3D(int x, int y, int z) {
        comp = new int[3];
        comp[0] = x;
        comp[1] = y;
        comp[2] = z;
    }

    // Do not modify this method
    // It returns the string representation of a Vector3D object
    // in the format "[x, y, z]"
    @Override
    public String toString() {
        return "[" + comp[0] + ", " + comp[1] + ", " + comp[2] + "]";
    }


    // CW2 Lab Group Fri 16 Question 1
    // Complete the method dotProduct so that
    // it returns the dot product of this vector and that vector
    public int dotProduct(Vector3D that) {
        int i = 0;
        for (int j = 0; j < 3; j++) {
            i += this.comp[j] * that.comp[j];
        }

        return i;


    }


    // CW2 Lab Group Fri 16 Question 2
    // Complete the method scaleVector so that
    // it creates and returns a new Vector3D object 
    //     with every component of this vector scaled with factor k
    //     e.g. [1, 2, 3].scaleVector(3) -> [3, 6, 9]
    public Vector3D scaleVector(int k) {
        int x = this.comp[0] * k;
        int y = this.comp[1] * k;
        int z = this.comp[2] * k;
        Vector3D vector3D = new Vector3D(x, y, z);
        return vector3D;
    }


    public static void main(String[] args) {

        Vector3D v1 = new Vector3D(1, 2, 3);
        System.out.println(v1);                    // [1, 2, 3]

        Vector3D v2 = new Vector3D(2, 4, 2);
        System.out.println(v1.dotProduct(v2));     // 16

        Vector3D v3 = v1.scaleVector(3);
        System.out.println(v3);                    // [3, 6, 9]

    }
}
