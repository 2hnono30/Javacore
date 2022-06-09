import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int m,n;
        Scanner scanner= new Scanner(System.in);
        System.out.println("input rol:");
        m = scanner.nextInt();
        System.out.println("input span:");
        n= scanner.nextInt();
        int [][]arr=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("nhap phan tu cua arr["+i+"]["+j+"]");
                arr[i][j]=scanner.nextInt();
            }
        }
        int sum=0;
        System.out.println("nhap cot muon tinh tong:");
        int socot = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (socot==j){
                    sum+=arr[i][socot];
                }
            }
        }
        System.out.println("tong cua cot "+socot+": "+sum+"");
    }
}