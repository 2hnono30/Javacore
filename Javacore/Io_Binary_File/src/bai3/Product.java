package bai3;

import java.util.PrimitiveIterator;

public class Product {
    private Long id;
    private String productName;
    private String hsx;
    private int gia;
    private String status;
    public Product(){
    }

    public Product(Long id, String productName, String hsx, int gia, String status) {
        this.id = id;
        this.productName = productName;
        this.hsx = hsx;
        this.gia = gia;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getHsx() {
        return hsx;
    }

    public void setHsx(String hsx) {
        this.hsx = hsx;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", hsx='" + hsx + '\'' +
                ", gia=" + gia +
                ", status='" + status + '\'' +
                '}';
    }
}
