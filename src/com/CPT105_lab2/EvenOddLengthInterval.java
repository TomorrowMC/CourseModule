package com.CPT105_lab2;/*
 * CW2 Lab Group Fri 11
 */

// The EvenOddLengthInterval class represents a one-dimensional integer interval [left, right],
//     that includes both left endpoint and right endpoint,
//     and an information whether the interval length is even or odd.
public class EvenOddLengthInterval extends Interval {
    
    // Do not modify or add the instance variables
    // The instance variable evenLength is true iff the length of the interval is even
    private boolean evenLength;


    // CW2 Lab Group Fri 11 Question 3
    // Complete the constructor of the class EvenOddLengthInterval
    // It initializes all its instance variables    
    public EvenOddLengthInterval(int left, int right) {
        super(left,right);
        int instance =right-left;
        if (instance%2==0) {
            evenLength=true;
        }else {
            evenLength=false;
        }
		
		
    }


    // CW2 Lab Group Fri 11 Question 4
    // Complete the toString() method so that
    // it returns the string representation of an EvenOddLengthInterval object
    // in the format "[left, right]" followed by either "has even length"
    // or "has odd length" depending whether the interval length is even or odd
    @Override
    public String toString() {
        if (evenLength) {
            return super.toString()+" has even length";
        }else{
            return super.toString() + " has odd length";
        }
		
		
    }
    
    // Test Client
    public static void main(String[] args) {
        
        EvenOddLengthInterval eolinterval1 = new EvenOddLengthInterval(2, 4);
        System.out.println(eolinterval1);    // [2, 4] has even length
        
        EvenOddLengthInterval eolinterval2 = new EvenOddLengthInterval(3, 6);
        System.out.println(eolinterval2);    // [3, 6] has odd length
        
    }
    
}
