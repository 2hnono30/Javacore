package bai3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductSevrice {
    Scanner scanner = new Scanner(System.in);

    public void add() {
        try {
                Long id = (System.currentTimeMillis() / 1000000);
                System.out.println("Product Name : ");
                String productName = scanner.nextLine();
                System.out.println("Hãng Sản Xuất : ");
                String hsx = scanner.nextLine();
                System.out.println("Giá : ");
                int gia = Integer.parseInt(scanner.nextLine());
                System.out.println("Status : ");
                String status = scanner.nextLine();
                List<Product>products1 = new ArrayList<>();
                List<String> products = new ArrayList<>();
                products1.add(new Product(id,productName,hsx,gia,status));
                products.add(String.valueOf(products1));
                writeToFile("G:\\JavaCore\\Javacore\\Io_Binary_File\\src\\bai3\\dataBase\\file.txt", products);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void show() {
        List<String> productList =readFromFile("G:\\JavaCore\\Javacore\\Io_Binary_File\\src\\bai3\\dataBase\\file.txt");
        for (String p : productList ) {
            System.out.println(p);
        }
    }

    public void search() {

    }

    public static void writeToFile(String path, List<String> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream obs = new ObjectOutputStream(fos);
            obs.writeObject(products);
            obs.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFromFile(String path) {
        List<String> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream obs = new ObjectInputStream(fis);
            products = (List<String>) obs.readObject();
            fis.close();
            obs.close();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return products;
    }
}
