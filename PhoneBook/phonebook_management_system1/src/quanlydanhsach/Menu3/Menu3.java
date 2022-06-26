package quanlydanhsach.Menu3;

import java.util.Scanner;

public class Menu3 {
    public static void Menu3(){
        System.out.println("Quản lí đơn đặt hàng");
        Scanner in3 = new Scanner(System.in);
        String menu3;
        boolean done3 = false;
        do {
            System.out.println("************Menu3*************");
            System.out.println("*                            *");
            System.out.println("* (1). Quản lí đơn đặt hàng *");
            System.out.println("* (2). Back                  *");
            System.out.println("*                            *");
            System.out.println("******************************");
            System.out.println("enter number:");
            menu3 = in3.nextLine().toUpperCase();
            switch (menu3) {
                case "2":
                    System.out.println("Back!");
                    done3 = true;
                    break;
            }
        } while (!done3);
    }
}
