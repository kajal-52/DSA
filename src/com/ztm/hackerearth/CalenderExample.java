package com.ztm.hackerearth;

import java.util.Calendar;

/**
 * Calendar class is an abstract class hence we can not create an instance of it.
 *
 */
public class CalenderExample {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("The Current Date is: "+cal.getTime());
        System.out.println("The Current Year is: "+cal.get(Calendar.YEAR));
        System.out.println("The Current Minute is: "+cal.get(Calendar.MINUTE));
        System.out.println("The Current Second is: "+cal.get(Calendar.SECOND));
        System.out.println("The Current Month is: "+cal.get(Calendar.MONTH));



    }
}
