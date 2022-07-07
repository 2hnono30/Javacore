package thapphan_change_nhiphan;

public class DecimalToBinaryExample1 {


    public void convertBinary(int num) {

        int binary[] = new int[40];

        int index = 0;

        while (num > 0) {

            binary[index++] = num % 2;

            num = num / 2;

        }

        for (int i = index - 1; i >= 0; i--) {

            System.out.print(binary[i]);

        }

    }


    public static void main(String[] args) {

        int decimalNumber = 123456789;

        System.out.print("Hệ nhị phân của " + decimalNumber + " là :");

        new DecimalToBinaryExample1().convertBinary(decimalNumber);

    }
}


