//import java.sql.SQLOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rol:");
        m = scanner.nextInt();
        System.out.println("Enter span:");
        n = scanner.nextInt();
        int [][]a  = new int[m][n];
        System.out.println("nhập các phần tử cho ma trận:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("a[" + i + "][" + j + "]=");
               a[i][j]  = scanner.nextInt();
            }
        }
        int max = a[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max<a[i][j]){
                    max=a[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trận = " + max);
    }
}