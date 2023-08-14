package com.graysan;

public class _08_Methods {

    public static void voidliParametresiz(){
        System.out.println("voidli Parametresiz");
    }

    public static void voidliParametreli(String name){
        System.out.println("voidli Parametreli : " + name);
    }

    public static Integer voidsizParametresiz(){
        return Math.abs(-15);
    }

    public static Integer voidsizParametreli(int number){
        return Math.abs(number);
    }

    public static void main(String[] args) {
        voidliParametresiz();
        voidliParametreli("Batuhan");

        int data = voidsizParametresiz();
        System.out.println(data);

        int data2= voidsizParametreli(-16);
        System.out.println(data2);
    }
}
