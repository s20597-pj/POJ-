package Zad15;

import Zad14.Date;

/**
 * summary: Time UML test class.
 * author: Mateusz Hinca
 **/
public class TestTime {
    public static void main(String[] args) {
        Time now = new Time(23,59,59);
        System.out.println(now.previousSecond());
        System.out.println(now.nextSecond());
        System.out.println(now.nextSecond());
    }
}
