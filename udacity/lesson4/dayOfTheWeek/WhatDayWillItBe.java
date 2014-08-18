package udacity.lesson4.dayOfTheWeek;

// BlueJ project: dayOfTheWeek
// Video: Day of the Week

public class WhatDayWillItBe
{
    public static void main(String[] args)
    {
        Day birthday = new Day(1983, 9, 1);
        // We may change this value when we run your program
        // It will always be a date >= January 1, 1900

        // January 1, 1900 was a Monday
        // Compute the number of days from that day until the birthday
        // Compute the weekday: 0 - Sunday, 1 - Monday, ..., 6 - Saturday
        
        Day day2 = new Day(1900,1,1);
        
        int weekday = ((birthday.daysFrom(day2))%7)+1;
        
        System.out.print("Weekday: ");
        System.out.println(weekday);
    }
}
