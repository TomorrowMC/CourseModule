package com.EX9;

/*
 * Exercise Week 9
 */
public class Clock {
    private int hours;
    private int minutes;


    // Exercise 9.1
    // Creates a clock whose initial time is h hours and m minutes.
    // Throws an IllegalArgumentException if either hours is not between 0 and 23,
    //     or minutes not between 0 and 59
    public Clock(int h, int m) {
        if (h < 0 || h > 23) {
            throw new IllegalArgumentException("Invalid argument in constructor 1!");

        } else if (m < 0 || m > 59) {
            throw new IllegalArgumentException("Invalid argument in constructor 1!");
        }
        this.hours = h;
        this.minutes = m;


    }


    // Exercise 9.2
    // Creates a clock whose initial time is specified as a string, using the format HH:MM.
    // Throws an IllegalArgumentException if either the string argument is not in this format,
    //     or if it does not correspond to a valid time between 00:00 and 23:59.
    public Clock(String s) {
        int dotIndex;
        int h;
        int m;
        String hor;
        String mit;
        try {
            dotIndex = s.indexOf(":");
            hor = s.substring(0, dotIndex);
            mit = s.substring(dotIndex + 1, s.length());

            m = 0;
            h = 0;
            m = Integer.parseInt(mit);
            h = Integer.parseInt(hor);

        if ((dotIndex != 2) || ((s.length() - dotIndex) != 3)) {

            throw new IllegalArgumentException("Invalid argument in constructor 1!");
        }

        if (h < 0 || h > 23) {
            throw new IllegalArgumentException("Invalid argument in constructor 1!");

        } else if (m < 0 || m > 59) {
            throw new IllegalArgumentException("Invalid argument in constructor 1!");
        }
        this.hours = h;
        this.minutes = m;
        } catch (IllegalArgumentException e) {
            throw e;
        }



    }


    // Exercise 9.3
    // Adds delta minutes to the time on this clock.
    // Throws an IllegalArgumentException if delta is negative,
    //     and use the message "Illegal negative delta " followed by the negative number.
    public void tock(int delta) {


    }


    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        String output = "";
        if (hours < 10)
            output = output + "0";
        output = output + hours + ":";
        if (minutes < 10)
            output = output + "0";
        output = output + minutes;
        return output;
    }


    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
        if (hours < that.hours) {
            return true;
        } else if (hours > that.hours) {
            return false;
        } else return minutes < that.minutes;
    }


    // Adds 1 minute to the time on this clock.
    public void tick() {
        minutes++;
        if (minutes == 60) {
            hours++;
            minutes = 0;
            if (hours == 24)
                hours = 0;
        }
    }


    // Getters
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }


    // Test client
    public static void main(String[] args) {
//        com.CW10.Clock clock1 = new com.CW10.Clock(1, 0);
//        System.out.println(clock1);
//
//        try {
//            com.CW10.Clock clock2 = new com.CW10.Clock(50, 0);
//        } catch (IllegalArgumentException e) {
//            System.out.println("Invalid argument in constructor 1!");
//        }

        Clock clock3 = new Clock("xx:30");
        System.out.println(clock3);
//
//        try {
//            com.CW10.Clock clock4 = new com.CW10.Clock("50:00");
//        } catch (IllegalArgumentException e) {
//            System.out.println("Invalid argument in constructor 2!");
//        }
//
//        com.CW10.Clock clock5 = new com.CW10.Clock("02:30");
//        clock5.tock(100);
//        System.out.println(clock5);
//
//        try {
//            clock5.tock(-50);
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }

    }
}
