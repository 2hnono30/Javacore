package Quan_li_ban_hang;

import Quan_li_ban_hang.Order.OrderService;
import Quan_li_ban_hang.Product.Product;
import Quan_li_ban_hang.Product.ProductService;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static Quan_li_ban_hang.PathUtil.PathUtil.PATH_PRODUCT_DATA;
import static Quan_li_ban_hang.Product.Product.products;


public class Quanlibanhang {
    public static void menu() {
        System.out.println("                                =============                              ");
        System.out.println("===============================|| Main_Menu ||=============================");
        System.out.println("*                               =============                             *");
        System.out.println("*                               (1).Thêm sản phẩm                         *");
        System.out.println("*                               (2).Hiển thị sản phẩm                     *");
        System.out.println("*                               (3).Sắp xếp sản phẩm theo tên             *");
        System.out.println("*                               (4).Sắp xếp sản phẩm theo giá             *");
        System.out.println("*                               (5).Sửa sản phẩm                          *");
        System.out.println("*                               (6).Xóa sản phẩm                          *");
        System.out.println("*                               (7).Lưu File                              *");
        System.out.println("*                               (8).Đọc File                              *");
        System.out.println("*                               (9).Order                                 *");
        System.out.println("*                               (10).Hiển thị đơn hàng                    *");
        System.out.println("*                               (11).Thoát                                *");
        System.out.println("*                                                                         *");
        System.out.println("===========================================================================");
    }

    public static void danhsach() {
        int function = 0;
        do {
            menu();
            Scanner in = new Scanner(System.in);

            try {
                System.out.println("Nhập số ⭆ ");
                function = in.nextInt();
                ProductService productService = new ProductService();
                OrderService orderService = new OrderService();
                switch (function) {
                    case 1:
                        ProductService.insert();
                        System.out.println("Thêm sản phẩn thành công !!");
                        break;
                    case 2:
                        productService.show();
                        break;
                    case 3:
                        productService.sortByName();
                        productService.show();
                        break;
                    case 4:
                        productService.sortbyPrice();
                        productService.show();
                        break;
                    case 5:
                        productService.update();
                        System.out.println("Đã update !!");
                        break;
                    case 6:
                        System.out.println("Nhập mã ID cần xóa ⭆");
                        productService.delete();
                        System.out.println("Đã xóa product : ");
                        break;
                    case 7:
                        ProductService.saveFile(PATH_PRODUCT_DATA, (ArrayList<Product>) products);
                        System.out.println("File Đã Lưu : ");
                        break;
                    case 8:
                        System.out.println("                           || Danh Sách Từ File ||                             ");
                        ProductService.readFile(PATH_PRODUCT_DATA);
                        break;
                    case 9:
                        orderService.order();
                        break;
                    case 10:
                        orderService.show();
                        break;
                    default:
                        break;
                }
            } catch (InputMismatchException ei) {
                System.out.println("Vui lòng nhập lại !!");
            } catch (Exception e) {
                //System.out.println(e.getMessage());
                e.printStackTrace();
            }
        } while (function != 11);
        System.out.println(" thanks for using ");
    }

    public static void main(String[] args) {
        Product p1 = new Product(1, "SP" + (1), 1, "Description" + 1, 57357);
        Product p2 = new Product(2, "SP" + (2), 1, "Description" + 1, 5887);
        Product p3 = new Product(3, "SP" + (3), 1, "Description" + 1, 557893);
        Product p4 = new Product(4, "SP" + (4), 1, "Description" + 1, 57456);
        Product p5 = new Product(5, "SP" + (5), 1, "Description" + 1, 57);
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        danhsach();

    }
}
