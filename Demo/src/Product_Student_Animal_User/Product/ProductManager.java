package Product_Student_Animal_User.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductManager  {
    private List<Product> productList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public ProductManager() {
        productList.add(new Product(1, "A", 9807131));
        productList.add(new Product(2, "B", 934827564));
        productList.add(new Product(3, "C", 9817354));
        productList.add(new Product(4, "D", 932075465));
    }

    public void addProduct() {
        //System.out.println("nhap id:");
        // int id = Integer.parseInt(scanner.nextLine());
        long id = productList.size()+1;

        System.out.println(id);
        System.out.println("Nhập Tên sp:");
        String name = scanner.nextLine();

        System.out.println("Nhập giá:");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, price);
        productList.add(product);
    }

    public void showProducts() {
        System.out.printf("%-12s%-12s%-12s\n", "Id", "Tên SP", "Giá");
        for (Product product : productList) {
            System.out.printf("%-12s%-12s%-12s\n", product.getId(), product.getName(), product.getPrice());
        }
    }

    public void sortByPrice() {
        List<Product> newProductList = new ArrayList<>(productList);
        Comparator<Product> price = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                double result = o1.getPrice() - o2.getPrice();
                return result == 0 ? 0 : (result > 0 ? 1 : -1);

            }
        };
        newProductList.sort(price);
        System.out.printf("%-12s%-12s%-12s\n", "Id", "Tên SP", "Giá");
        for (Product product : newProductList) {
            System.out.printf("%-12s%-12s%-12s\n", product.getId(), product.getName(), product.getPrice());
        }
    }

//    public void search() {
//        String query = "dsf";
//        for (Product product : productList) {
//          if (product.getName().contains(query)){}
//        }
//    }

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.showProducts();
        productManager.sortByPrice();
        productManager.showProducts();
        productManager.addProduct();
        productManager.showProducts();
        productManager.addProduct();
        productManager.showProducts();
    }

}
