package com.graysan;

public class _05_Cast {

    public static void main(String[] args) {
        //String Kelime Bazlı - Database, API
        String str1 = "16";
        int number1 = 14;
        int cast1 = Integer.valueOf(str1);
        System.out.println(str1+number1);


        int number2 = 60;
        String str2 = String.valueOf(number2);
        String str3 = Integer.toString(number2);
    }
}
