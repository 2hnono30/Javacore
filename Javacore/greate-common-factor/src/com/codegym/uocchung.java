

import java.util.Scanner;

public class uocchung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a:");
        int a = scanner.nextInt();
        System.out.println("input b:");
        int b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);
    }
}
