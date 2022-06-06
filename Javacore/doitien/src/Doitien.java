import java.util.Scanner;

public class Doitien {
    public static void main(String[] args) {
        double vnd = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input USD:");
        double usd = scanner.nextDouble();
        double rate = usd * vnd;
        System.out.println("giá quy đổi VND:" + rate);
    }
}
