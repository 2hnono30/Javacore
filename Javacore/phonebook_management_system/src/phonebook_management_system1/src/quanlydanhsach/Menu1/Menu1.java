package quanlydanhsach.Menu1;

import java.util.Scanner;

public class Menu1 {

    public static void Menu1() {
        System.out.println("Quản lí người dùng");
        Scanner in1 = new Scanner(System.in);
        String menu1;
        boolean done1 = false;
        do {
            System.out.println("************Menu1*************");
            System.out.println("*                            *");
            System.out.println("* (1).Quản lí người dùng    *");
            System.out.println("* (2). Back                  *");
            System.out.println("*                            *");
            System.out.println("******************************");
            System.out.println("enter number:");
            menu1 = in1.nextLine().toUpperCase();
            switch (menu1) {
                case "2":
                    System.out.println("Back");
                    done1 = true;
                    break;
            }
        } while (!done1);
    }
}

