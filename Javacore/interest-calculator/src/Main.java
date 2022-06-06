import javax.sound.midi.Soundbank;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        double money = scanner.nextDouble();
        System.out.println("Enter number of month: ");
        int month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        double interestRate = scanner.nextDouble();
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.printf("Total of interest:%.3f\n ", totalInterest);
    }
}