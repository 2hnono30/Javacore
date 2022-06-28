import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        Scanner scanner = new Scanner(System.in);
        System.out.println("input num:");
        int X = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==X){
                arr[i]=arr[i++];
            }
            System.out.println(arr[i] + "");
        }
    }
}