package com.CW10;

import java.util.ArrayList;

/*
 * Exercise and CW1 Week 12
 */
public class HouseOfClocks {
    
    // A house of clocks stores all its clocks in an ArrayList of com.CW10.Clock objects
    private ArrayList<Clock> clocksCollection;
    // the number of clocks in the collection
    private int numClocks;
    
    
    // Creates a house of clocks, initially with no clocks.
    public HouseOfClocks() {
        clocksCollection = new ArrayList<Clock>();
        numClocks = 0;
    }    
    
    
    //  Add a new clock to this HouseOfClock's clock collection. 
    public void addClock(int h, int m) {
        clocksCollection.add(new Clock(h, m));
    }
    

    
	
    // CW1 12.2
    // Return the number of clocks in this HouseOfClock's clock collection
    //     that is earlier than that com.CW10.Clock
    public int numEarlierClocks(Clock that) {
        int numOfEar=0;
        for (Clock c:
             clocksCollection) {
            if (c.isEarlierThan(that)) {
                numOfEar++;
            }
        }

        return numOfEar;
    }
    
    
    public static void main(String[] args) {
        
        HouseOfClocks hc = new HouseOfClocks();
        hc.addClock(1, 30);
        hc.addClock(12, 8);
            // com.CW10.Clock 01:30
            // com.CW10.Clock 12:08
       
        Clock c1 = new Clock(10, 45);
        System.out.println(hc.numEarlierClocks(c1));   // 1
        Clock c2 = new Clock(14, 5);
        System.out.println(hc.numEarlierClocks(c2));   // 2
		
		// add your own test cases :
		
		
		
		
		
    }
    
}
