package com.ztm.hackerearth;

import java.util.GregorianCalendar;

/**
 * Gregorian calender subclass of calender which has all impl of Calender class
 *
 */
public class GregorianCalenderExample {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("The Current Date is: "+calendar.getTime());
        GregorianCalendar gcal = new GregorianCalendar(2018, 3, 30);
        System.out.println(gcal.getCalendarType());
    }
}
