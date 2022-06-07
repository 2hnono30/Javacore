public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int a = 1;a <=7;a++){
        for (int b = 1; b <=7; b++) {
            System.out.print("* ");
             }
        System.out.println("");
        }
        for(int c = 1; c <= 7; c++){
            for(int j = 1; j <= 5; j++) {
                if(c == 1 || c == 7 || j == 1 || j == 5)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
            }
            System.out.println("");
        }
    }
}
