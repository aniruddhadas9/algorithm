package com.candifood.ClockProblem;


import java.sql.Time;
import java.time.LocalTime;

/**
 * Created by adas008c on 9/24/2016.
 */
public class DifferenceBetweenHourAndMinuteHand {

    public static void main(String[] args) {
        Time time = Time.valueOf(LocalTime.now());
        System.out.println("Time passing to the class = " + time);
        //int intTime = new DifferenceBetweenHourAndMinuteHand().difference(time);
        double intTime = new DifferenceBetweenHourAndMinuteHand().byGayle(time);
        System.out.println(intTime);
    }

    public int difference(Time time) {

        int hour = time.getHours();
        int minute = time.getMinutes();

        if (hour > 12) {
            hour = (hour - 12) * 5;
        } else {
            hour = hour * 5;
        }
        hour += minute / 5;
        System.out.println("Time provided: " + time);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);

        return (60 - hour) + minute;

    }

    public double byGayle(Time time) {
        int hour = time.getHours();
        int minute = time.getMinutes();
        int angleOfMinuteHandTo12oClock = 360 * minute / 60;
        int angleOfHourHandTo12oClock = 360 * (hour % 12) / 12 + 360 * (minute / 60) * (1 / 12);
        double angleBetweenHourAndMinute = (angleOfMinuteHandTo12oClock - angleOfMinuteHandTo12oClock) / 360;
        double oneLineAngleBetweenHourAndMinute = ((30 * hour) - (5.5 * minute)) % 360;

        return oneLineAngleBetweenHourAndMinute;
    }
}
