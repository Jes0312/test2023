package com.tedu.exc;


import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args){
        while(true){
            try{
                f1();
                break;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("两个，不是1个！");
            }catch (ArithmeticException e){
                System.out.println("不能除0");
            } catch (Exception e) {
                System.out.println("出错，请重试");
            }finally{
                System.out.println("==================");
            }

        }

    }

    public static void f1() {
        System.out.println("输入逗号隔开的两个整数");
        String s = new Scanner(System.in).nextLine();
        String[] a = s.split(",");
        int n1 = Integer.parseInt(a[0]);
        int n2 = Integer.parseInt(a[1]);
        int r = n1/n2;
        System.out.println(r);

    }

}
