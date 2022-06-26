package quanlydanhsach.Menu1;

import java.util.Scanner;

public class Quanlynguoidung {
    public static void Quanlynguoidung(){
        System.out.println("Quản lí người dùng");
        Scanner in1_1 = new Scanner(System.in);
        String menu1_1;
        boolean done1_1 = false;
        do {
            System.out.println("***********Menu1_1************");
            System.out.println("*                            *");
            System.out.println("*                            *");
            System.out.println("* (@).Quản lí người dùng    *");
            System.out.println("* (2). Back                  *");
            System.out.println("*                            *");
            System.out.println("******************************");
            System.out.println("enter number ==> ");
            menu1_1 = in1_1.nextLine().toUpperCase();
            switch (menu1_1) {
                case "1":
                    System.out.println("Quản lí người dùng");
                    break;
                case "2":
                    System.out.println("Back");
                    done1_1 = true;
                    break;
            }
        } while (!done1_1);
    }
}
