import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String chuoi;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
        System.out.println("nhập vào ký tự muốn biết số lần xuất hiện trong chuỗi:");
        String kytu= scanner.nextLine();
        for (int i = 0; i < chuoi.length(); i++) {
            if ( kytu.charAt(0) == chuoi.toLowerCase().charAt(i)) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + kytu +
                " trong chuỗi " + chuoi + " = " + count);
    }
}
