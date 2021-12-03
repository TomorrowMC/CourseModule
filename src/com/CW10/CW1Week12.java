package com.CW10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CW1Week12 {

    
    
    // CW1 12.1
    public static boolean isPartitionable(List<Integer> list) {
        int start=0;
        int end = list.size() - 1;
        int nowIndex=1;
        ArrayList<Integer> preInts = null;
        ArrayList<Integer> endInts= null;
        int liftToal;
        int rightToal;
        while (true){
            liftToal=0;
            rightToal=0;
            List<Integer> leftAr = list.subList(0, nowIndex);
            for (Integer i:
                 leftAr) {
             liftToal+=i;
            }
            List<Integer> rightAr = list.subList(nowIndex,end+1);
            for (Integer i : rightAr) {
                rightToal += i;
            }
            if (rightToal==liftToal) {
                return true;
            }else if (rightToal>liftToal){
                nowIndex++;
            }else{
                return false;
            }

        }
    }

    
    public static void main(String[] args) {

        List<Integer> list_1 = Arrays.asList(1, 1, 1, 2, 1);
        System.out.println(isPartitionable(list_1));          // true

        List<Integer> list_2 = Arrays.asList(2, 1, 1, 2, 1);
        System.out.println(isPartitionable(list_2));
        // false
        List<Integer> list_3 = Arrays.asList(5, 1, 1, 2, 1);
        System.out.println(isPartitionable(list_3));
        // add your own test case here:
        
        
        
        
        
    }
    
}
