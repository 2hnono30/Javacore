import java.util.Arrays;
import java.util.Scanner;

public class sort2 {
    private static void nhap_mang(int[] A, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("A[ " + i + " ]: ");
            A[i] = scanner.nextInt();
        }
    }

    private static void xuat_mang(int[] A, int n) {
        System.out.print(Arrays.toString(A));
    }

    private static void sap_xep_chen(int[] A, int n) {
        for (int i = 1; i < n; i++) {
            int x = A[i];
            int y = i;
            while (y > 0 && A[y - 1] > x) {
                A[y] = A[y - 1];
                y--;
            }
            A[y] = x;
        }
    }

    public static void main(String[] args) {
        int[] A;
// n = size;
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input size of array: ");
        n = scanner.nextInt();
        A = new int[n];
        nhap_mang(A, n);
        System.out.print("Mảng sau khi sắp xếp (Insertion Sort):");
        sap_xep_chen(A, n);
        xuat_mang(A, n);
    }

}