package phonebook;

import java.util.Scanner;

public class Main {
    public static void callContact(String name){
        System.out.println("Calling : " + name);
    }
    public static void saveContact(String name,long number){
        System.out.println("Saving contact  "+ name +" : "+ number);
    }
    public static void findNumber(String name){
        System.out.println("Could not find " + name);
    }
    public static void displayMenu(){
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("what would you like to do? (1 or 2 or 3...enter)");
        System.out.println("MENU:");
        System.out.println("1.Call Contact");
        System.out.println("2.Save Contact");
        System.out.println("3.Find Number");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice){
            case 1:
                System.out.println("who would you like to call?");
                 name = scanner.nextLine();
                callContact(name);
                break;
            case 2:
                System.out.println("who is the name of the person you would like to save???");
                 name = scanner.nextLine();
                System.out.println("what is the phone number of the person you are saving???");
                long number = scanner.nextLong();
                scanner.nextLine();
                saveContact(name,number);
                break;
            case 3:
                System.out.println("what is the name of the person whose phone number you are searching???");
                findNumber(scanner.nextLine());
                break;
        }

    }

    public static void main(String[] args) {
        displayMenu();
    }
}
