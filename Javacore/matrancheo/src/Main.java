import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int m;
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap bac ma tran:");
        m = scanner.nextInt();
        int [][]arr=new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("nhap phan tu cua arr["+i+"]["+j+"]");
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Ma trận A vừa nhập:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int sum =0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                // kiểm tra nếu i == j thì mới tính tổng
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }

        System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + sum);
    }
}