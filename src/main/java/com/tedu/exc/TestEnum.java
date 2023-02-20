package com.tedu.exc;

enum Gender{//编译完之后也会生成一个字节码文件Gender.class
    MALE,FEMALE,NONE;
    //以上三个实例，每个实例创建时都会执行构造函数
    Gender(){ //默认是private修饰
        System.out.println("加载Gender类");
    }

}
class Goods{
    static Long id;
    String name;
    Gender gender;
}
public class TestEnum {

    public static void main(String[] args) throws ClassNotFoundException {
       // Class<?> c = Gender.class;//这种方式的加载不会触发类的初始化
        //访问类中的成员时，会触发类的初始化(MALE,FEMALE,NONE这三个实例会创建)
        Gender g = Gender.FEMALE;
        //Class<?> g1 = Class.forName("com.java.Enums.Gender");
    }
}
