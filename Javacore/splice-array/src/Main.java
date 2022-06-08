import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {34, 24, 54, 532, 25, 10, 30, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("input num:");
        int num = scanner.nextInt();
        System.out.println("input index:");
        int index_input = scanner.nextInt();
        if (index_input < 0 || index_input > arr.length - 1) {
            System.out.println("ko the them vao:");
            return;
        }
        for (int i = arr.length - 1; i > index_input; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index_input] = num;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }

    }
}


