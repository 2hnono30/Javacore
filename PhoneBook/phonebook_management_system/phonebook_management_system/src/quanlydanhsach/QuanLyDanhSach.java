package quanlydanhsach;

import quanlydanhsach.Menu1.Menu1;
import quanlydanhsach.Menu2.Menu2;
import quanlydanhsach.Menu3.Menu3;

import java.util.Scanner;

public class QuanLyDanhSach {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String menu;
        boolean done = false;
        do {
            System.out.println("**********Main_Menu**********");
            System.out.println("*                           *");
            System.out.println("* (1).Thêm sản phẩm         *");
            System.out.println("* (2).Hiển thị sản phẩm     *");
            System.out.println("* (3).Sửa sản phẩm          *");
            System.out.println("* (4).Xóa sản phẩm          *");
            System.out.println("*                           *");
            System.out.println("*****************************");
            System.out.println("enter number ==> ");
            menu = in.nextLine().toUpperCase();
            switch (menu) {
                case "1":
                    Menu1.Menu1();

                    break;
                case "2":
                    Menu2.Menu2();
                    break;
                case "3":
                    Menu3.Menu3();
                    break;
                case "4":
                    System.out.println("Exiting!");
                    done = true;
                    break;
                default:
                    System.out.println("Unknown entry");
            }
        } while (!done);
    }
}
