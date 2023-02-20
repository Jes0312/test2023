package com.tedu.exc;


import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
查看当前日期和几天后，几个月后，几年后的日期
 */
public class Test10 {

    public static void main(String[] args){
        LocalDate date = LocalDate.now();
        System.out.println("当前日期是："+date);
        System.out.println("当前月为："+LocalDate.now().getMonth());
        System.out.println("明年："+ (date.getYear()+1));
        System.out.println("下个月："+ (date.getMonthValue()+1));
        System.out.printf("五天后是%d\n",date.getDayOfMonth()+5);
        //SimpleDateFormat fm = new SimpleDateFormat("HH-MM-DD");
        //获取当前年月日星期,\n是换行
        System.out.printf("%d年%d月",LocalDate.now().getYear(),date.getMonthValue());
        System.out.printf("\n");
        String output = String.format("%d年=%s",2021,"二零二一");
        System.out.println(output);

        //System.out.printf("%d年%d月%d日\n", LocalDate.now().getYear(), LocalDate.now().getMonthValue(),
                //LocalDate.now().getDayOfMonth());


        //方法二
       LocalDate afertDay =  date.plusDays(10);
        LocalDate afterMonth = date.plusMonths(3);
        LocalDate afterYear = date.plusYears(5);
        System.out.println("几天后的日期是"+ afertDay);
        System.out.println("几个月后"+afterMonth);

    }


}
