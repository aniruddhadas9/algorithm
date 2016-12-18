package com.candifood.test.testCases.ClockProblem;


import com.candifood.ClockProblem.DifferenceBetweenHourAndMinuteHand;
import org.junit.Test;

import java.sql.Time;
import java.time.LocalTime;

/**
 * Created by Aniruddha Das on 9/24/2016.
 */
public class DifferenceBetweenHourAndMinuteHandTest {

    @Test
    public void differenceTest() {

        Time time = Time.valueOf(LocalTime.now());
        System.out.println("Time passing to the class = "+time);
        //int intTime = new DifferenceBetweenHourAndMinuteHand().difference(time);
        double intTime = new DifferenceBetweenHourAndMinuteHand().byGayle(time);
        System.out.println(intTime);

    }
}
