package Quan_li_ban_hang.Order;

import Quan_li_ban_hang.Product.Product;
import Quan_li_ban_hang.Product.ProductService;
import Quan_li_ban_hang.Quanlibanhang;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class OrderService {
    public void order() {
        Scanner in = new Scanner(System.in);
        System.out.println("----------------------Mua sản phẩm---------------------");
        try {
            System.out.println("Mã đặt hàng :");
            int id = in.nextInt();
            in.nextLine();
            System.out.println("Nhập Tên Khách Hàng:");
            String customerName = in.nextLine();
            System.out.println("Nhập số điện thoại:");
            String phone = in.nextLine();
            System.out.println("Nhập số email:");
            String email = in.nextLine();

            Order order = new Order(id,customerName,phone,email);
            int productFunction = -1;
            do {
                in=new Scanner(System.in);
                System.out.println("Nhập mã xản phẩm:");
                int productId = in.nextInt();
                System.out.println("Nhập số lượng:");
                int quantity = in.nextInt();
                Product product = null;
                for (Product p :Product.products
                     ) {
                    if (p.getId().equals(productId)){
                        product = p;
                        break;
                    }
                }
                if (product == null){
                    System.out.println("Mã sản phẩm không tồn tại!");
                }
                OrderDetail orderDetail = new OrderDetail();
                orderDetail.setId(1);
                orderDetail.setOrderId(order.getId());
                orderDetail.setPrice(product.getPrice());
                orderDetail.setProductId(productId);
                orderDetail.setQuantity(quantity);
                order.getOrderDetails().add(orderDetail);
            }while (productFunction==0);
            Order.ORDER.add(order);
            saveFile();
        } catch (InputMismatchException ei) {
            System.out.println("Vui lòng nhập lại:");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    public void show() {
        System.out.println("                           || Danh Sách Đặt Hàng ||                       ");
        String header = String.format("%s%30s%30s%30s", "ID", "Tên Khách Hàng", "Số Điện Thoại", "Email");
        System.out.println(header);
        ProductService productService = new ProductService();
        for (Order order : Order.ORDER) {
            String row = String.format("%s%30s%30s%30s", order.getId(), order.getCustomerName(), order.getPhone(), order.getEmail());
            System.out.println(row);
            String orderDetailHeader = String.format("%s%30s%15s%15s","STT","Tên Sản Phẩm","Giá","Số lượng");
            System.out.println(orderDetailHeader);
            int i = 1;
            for (OrderDetail od:order.getOrderDetails()
                 ) {
                    Product p = productService.getById(od.getProductId());
                String orderDetailRow = String.format("%s%30s%15s%15s",i,p.getName(),p.getPrice(),p.getQuantity());
                System.out.println(orderDetailRow);
                i++;
            }
        }
    }
    public static void saveFile() {
        try {
            FileWriter file = new FileWriter("G:\\Javacore\\PhoneBook\\phonebook_management_system\\phonebook_management_system\\src\\Quan_li_ban_hang\\Data\\Order.csv");
            BufferedWriter bw = new BufferedWriter(file);
            for (Order p : Order.ORDER
            ) {
                String line = p.getFileLine();
                bw.write(line);
            }
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void readFile(){
        File file = new File("G:\\Javacore\\PhoneBook\\phonebook_management_system\\phonebook_management_system\\src\\Quan_li_ban_hang\\Data\\Order.csv");
        try {
            List<String> allTest = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
            for (String line : allTest){
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
