import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("enter a size:");
        size = scanner.nextInt();
        int []arr  = new int [size];
        for (int i = 0; i < size; i++) {
            System.out.println("nhap phan tu arr["+i+"]:");
            arr[i]=scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("phan tu nho nhat trong mang : "+min+"");
    }
}