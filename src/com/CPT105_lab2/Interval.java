package com.CPT105_lab2;/*
 * CW2 Lab Group Fri 11
 */

// The Interval class represents a one-dimensional integer interval [left, right],
//     that includes both left endpoint and right endpoint.
public class Interval {
    
    // Do not modify or add the instance variables
    private int left;
    private int right;

    // Do not modify this constructor
    // It initializes the two instance variables
    public Interval(int left, int right) {        
        this.left = left;
        this.right = right;
    }    
    
    // Do not modify this method
    // It returns the string representation of an Interval object
    // in the format "[left, right]"
    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }
    
    
    // CW2 Lab Group Fri 11 Question 1
    // Complete the method sameLength
    // It returns true iff the the length of this and other intervals are the same
/*    public boolean sameLength(Interval other) {
		
		
		
    }*/
    

    // CW2 Lab Group Fri 11 Question 2
    // Complete the method contains
    // Returns true iff the other interval is located inside this interval
/*    public boolean contains(Interval other) {
		
		
		
    }*/
    
    
    // Test Client
    public static void main(String[] args) {
/*
        Interval interval1 = new Interval(2, 5);
        System.out.println(interval1);                        // [2, 5]
        
        Interval interval2 = new Interval(7, 10);
        System.out.println(interval1.sameLength(interval2));  // true
        
        Interval interval3 = new Interval(3, 4);
        System.out.println(interval1.sameLength(interval3));  // false
        
        System.out.println(interval1.contains(interval2));    // false
        System.out.println(interval1.contains(interval3));    // true
        */
    }
}
