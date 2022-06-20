package Triangle_class;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Triangle triangle = getTriangle();
        System.out.print(" color : ");
        triangle.setColor(sc.nextLine());
        System.out.print("có fill ? Y/N: ");
        String option = sc.nextLine();
        switch (option) {
            case "y":
            case "Y":
                break;
            default:
                triangle.setFilled(false);
                break;
        }
        System.out.println("\n \n" + triangle.toString());
    }

    private static Triangle getTriangle() {
        System.out.print("enter a,b,c: ");
        String input = sc.nextLine();
        if (!input.matches("^(?:[0-9],){2}[0-9]")) {
            System.out.println("ko hợp lệ");
            System.out.print("enter a,b,c: ");
            input = sc.nextLine();
        }
        String[] triangle = input.split(",");
        Triangle outTriangle = new Triangle(
                Double.parseDouble(triangle[0]),
                Double.parseDouble(triangle[1]),
                Double.parseDouble(triangle[2])
        );
        if (!outTriangle.isValid()) {
            System.out.println("tam giac ko hợp lệ!");
            outTriangle = getTriangle();
        }
        return outTriangle;
    }
}
