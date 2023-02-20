package com.tedu.exc;



import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * 查看当前日期和几天后，几个月后，几年后的日期。
 */
public class Test7 {

    public static void main(String[] args){

        LocalTime t = LocalTime.now();
        System.out.println(t);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(formatter.format(t));

    }

}
