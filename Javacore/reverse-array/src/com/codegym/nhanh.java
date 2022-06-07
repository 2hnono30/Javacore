package com.codegym;
import java.util.Scanner;
public class nhanh {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 56, 6, 1, 4};
            for (int i=0;i<= array.length/2 ; i++) {
                int temp = array[i];
                array[i] = array[array.length-1-i];
                 array [array.length-1-i] = temp;
        }
            for (int i:array)
                System.out.print(i+" ");

    }
}
