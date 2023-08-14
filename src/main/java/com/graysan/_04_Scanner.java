package com.graysan;

import java.util.Scanner;

public class _04_Scanner {

    public static void main(String[] args) {
        // + - * / % ! && ||
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz");
        String name = scan.nextLine();
        System.out.println("Girilen isim : " + name);
    }
}
