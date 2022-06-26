import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,c;
        System.out.println("enter a,b,c:");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b= scanner.nextDouble();
        c = scanner.nextDouble();
        QuadraticEquation quadraticEquation= new QuadraticEquation (a,b,c);
        if(quadraticEquation.getDiscriminant()<0) System.out.println("The equation has no roots");
        else if(quadraticEquation.getDiscriminant()==0) System.out.println("The equation has one root: "+quadraticEquation.getRoot1());
        else{
            System.out.println("The equation has two roots: ");
            System.out.println("Denta is: "+quadraticEquation.getDiscriminant());
            System.out.println("Root1 is: "+quadraticEquation.getRoot1());
            System.out.println("Root2 is: "+quadraticEquation.getRoot2());
        }
    }
}
