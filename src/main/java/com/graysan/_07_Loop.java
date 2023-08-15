package com.graysan;

public class _07_Loop {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n***************");
        //for(;;){}

        int k = 0;
        while (k < 10) {
            System.out.print(k + " ");
            //k++;
            //k=k+1;
            k += 1;
        }
        //while(true){}

        System.out.println("\n***************");
        int m = 0;
        do {
            System.out.print(m + " ");
            //k++;
            //k=k+1;
            m += 1;
        } while (m < 10);
    }
}
