import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double VND = 23000;
        Scanner scanner = new Scanner(System.in);
        double USD = scanner.nextDouble();
        System.out.println("input USD:");
        double rate = USD * 23000;
        System.out.println("giá quy đổi:" + rate);
    }
}