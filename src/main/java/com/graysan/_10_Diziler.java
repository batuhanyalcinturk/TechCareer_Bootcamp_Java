package com.graysan;

import java.util.Arrays;

public class _10_Diziler {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 86;
        arr[1] = 2;
        arr[2] = 3;
        arr[4] = 65;
        arr[5] = 1;

        System.out.println(arr[0]);

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n***********");

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n*************");

        int[][] matrix = new int[4][4];
        matrix[0][0] = 1;
        matrix[1][1] = 2;
        matrix[2][2] = 3;
        matrix[3][3] = 4;
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                System.out.print(matrix[i][k]);
            }
            System.out.println(" ");
        }
    }
}
