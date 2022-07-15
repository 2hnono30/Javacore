package Quan_li_ban_hang.Product;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;
import java.util.function.Predicate;

import static Quan_li_ban_hang.PathUtil.PathUtil.PATH_PRODUCT_DATA;
import static Quan_li_ban_hang.Product.Product.products;


public class ProductService {
    public static void insert() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập thông tin sản phẩm ");

        try {
            System.out.println("Nhập ID ⭆");
            int id = in.nextInt();
            in.nextLine();
            System.out.println("Nhập tên ⭆");
            String name = in.nextLine();

            System.out.println("Số lượng ⭆");
            int quantity = in.nextInt();
            in.nextLine();
            System.out.println("Ghi chú ⭆");
            String description = in.nextLine();

            System.out.println("Giá ⭆");
            float price = in.nextFloat();
            Product product1 = new Product(id, name, quantity, description, price);
//            ArrayList<Product> products = new ArrayList<>();

            products.add(product1);
            saveFile(PATH_PRODUCT_DATA, (ArrayList<Product>) products);


        } catch (InputMismatchException ei) {
            System.out.println("Vui lòng nhập lại:");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void show() {
        System.out.println("                           || Danh Sách Sản Phẩm ||                       ");
        String header = String.format("%s%15s%30s%15s%30s", "ID", "Tên", "Số Lượng", "Giá", "Ghi Chú");
        System.out.println(header);
        readFile(PATH_PRODUCT_DATA);
    }

    public void sortbyPrice() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return -1;
                }
                return 1;
            }
        });
    }

    public void sortByName() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
            // Z-A (A-Z : dấu - ở trước);
        });
    }

    public void update() {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Nhập mã ⭆");
            int id = in.nextInt();
            Product product1 = null;
            for (Product p : products
            ) {
                if (p.getId().equals(id)) {
                    product1 = p;
                    break;
                }
            }
            if (product1 == null) {
                System.out.println("Mã sản phẩm không tồn tại,Xin vui lòng nhập lại!");
            }
            System.out.println("                           || Thông Tin Sản Phẩm ||                       ");
            String header = String.format("%s%15s%30s%15s%15s", "ID", "Tên", "Số Lượng", "Giá", "Ghi chú");
            System.out.println(header);
            String row = String.format("%s%15s%30s%15s%15s", product1.getId(), product1.getName(), product1.getQuantity(), product1.getPrice(), product1.getDescription());
            System.out.println(row);
            for (int i = 0; i < products.size(); i++) {
                if (Objects.equals(id, products.get(i).getId())) {
                    in.nextLine();
                    System.out.println("Nhập tên ⭆");
                    String name = in.nextLine();

                    System.out.println("Số lượng ⭆");
                    int quantity = in.nextInt();
                    in.nextLine();
                    System.out.println("Ghi chú ⭆");
                    String description = in.nextLine();
                    System.out.println("Giá ⭆");
                    float price = in.nextFloat();
                    products.get(i).setName(name);
                    products.get(i).setQuantity(quantity);
                    products.get(i).setDescription(description);
                    products.get(i).setPrice(price);
                }
            }
            saveFile(PATH_PRODUCT_DATA,products);
        } catch (InputMismatchException ei) {
            System.out.println("Vui lòng nhập lại!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Product getById(int id) {
        Product product = new Product();
        for (Product p : products
        ) {
            if (p.getId().equals(id)) {
                product = p;
                break;
            }
        }
        return product;
    }

    public void delete() {
        Scanner in = new Scanner(System.in);
        int id = in.nextInt();

        products.removeIf(new Predicate<Product>() {
            @Override
            public boolean test(Product product) {
                return product.getId() == id;
            }
        });
        saveFile(PATH_PRODUCT_DATA,products);
    }

    public static void saveFile(String PATH_PRODUCT_DATA, ArrayList<Product> products) {
        try {
            FileWriter fw = new FileWriter(PATH_PRODUCT_DATA);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Product p : products
            ) {

                bw.write(p.toString());
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String pathProductData) {
        ArrayList<Product> products = new ArrayList<>();
        File file = new File(PATH_PRODUCT_DATA);
        try {
            List<String> allTest = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
            for (String line : allTest) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}




