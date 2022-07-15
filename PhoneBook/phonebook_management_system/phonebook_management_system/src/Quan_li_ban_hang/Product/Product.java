package Quan_li_ban_hang.Product;

import java.util.ArrayList;

public class Product {
    private Integer id;
    private String name;
    private Integer quantity;
    private String description;
    private float price;
    private Object productUpdateDate;

    public Product() {};
    public static ArrayList<Product> products = new ArrayList<Product>();
    public Product(Integer id,String name,Integer quantity,String description,float price){
        this.id=id;
        this.name=name;
        this.quantity=quantity;
        this.description=description;
        this.price=price;
    }
    public Product(String name,Integer quantity,String description,float price){
        this.name=name;
        this.quantity=quantity;
        this.description=description;
        this.price=price;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return String.format("%s%15s%30s%15s%30s",id,name,quantity,price,description+"\n");
    }
}

