package com.mrinalgupta.dayday6;

public class WrapperClass {
    public static void main(String[] args) {
        /*
        Wrapper classes : wrap the primitives as objects
        Byte, Short, Character, Long, Double, Integer, Float, Boolean
         */

        int a = 2;
        Integer wrappedInt = a;// Boxing -> primitive to object

        Integer b =5;
        int c = b;//unboxing -> object to primitive

        String fromInt = b.toString();

        Character ch = Character.valueOf('L');
        System.out.println(Character.isDigit(ch));//ToDo



    }
}
