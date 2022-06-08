//import java.lang.reflect.Array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr_1 = new int[3];
        int n_1 = arr_1.length;
        int[] arr_2 = new int[4];
        int n_2 = arr_2.length;
        int[] Arr = new int[n_1 + n_2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr_1.length; i++) {
            System.out.println("Enter the value of index arr_1");
            arr_1[i] = scanner.nextInt();
            Arr[i] = arr_1[i];
        }
        for (int i = 0; i < arr_2.length;i++) {
            System.out.println("Enter the value of index arr_2");
            arr_2[i] = scanner.nextInt();
            Arr[n_2-1]=arr_2[i];
            n_2++;
        }
        for (int i = 0; i <= Arr.length - 1; i++) {
            System.out.print(Arr[i] + ",");
        }
    }
}