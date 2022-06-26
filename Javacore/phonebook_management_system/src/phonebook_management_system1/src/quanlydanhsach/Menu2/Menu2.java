package quanlydanhsach.Menu2;

import java.util.Scanner;

public class Menu2 {
    public static void Menu2(){
        System.out.println("Quản lí bánh");
        Scanner in2 = new Scanner(System.in);
        String menu2;
        boolean done2 = false;
        do {
            System.out.println("************Menu2*************");
            System.out.println("*                            *");
            System.out.println("* (1).Quản lí bánh          *");
            System.out.println("* (2). Back                  *");
            System.out.println("*                            *");
            System.out.println("******************************");
            System.out.println("enter number:");
            menu2 = in2.nextLine().toUpperCase();
            switch (menu2) {
                case "2":
                    System.out.println("Back");
                    done2 = true;
                    break;
            }
        } while (!done2);
    }
}
