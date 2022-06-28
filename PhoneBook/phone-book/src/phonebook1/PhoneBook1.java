package phonebook1;

import java.util.Scanner;


public class PhoneBook1 {




    public static void main(String[] args) {

        SLList newList=new SLList();
        InputOutput newIO = new InputOutput();
        Scanner in = new Scanner(System.in);
        String fileName = "";

        String menu;
        boolean done = false;

        do {
            System.out.println("******************************************************************************************************************");
            System.out.println("*                                             ** ~~ ~~ ~~ ~~ ~~ ~~ ~~ **                                         *");
            System.out.println("*                                             *                        *                                         *");
            System.out.println("*                                             *          MENU          *                                         *");
            System.out.println("*                                             *                        *                                         *");
            System.out.println("*                                             ** ~~ ~~ ~~ ~~ ~~ ~~ ~~ **                                         *");
            System.out.println("*                                                   (1.)Add                                                      *");
            System.out.println("*                                                   (2)Delete                                                    *");
            System.out.println("*                                                   (3)Email Search                                              *");
            System.out.println("*                                                   (4)Print List                                                *");
            System.out.println("*                                                   (5)Restore from database                                     *");
            System.out.println("*                                                   (6)Search                                                    *");
            System.out.println("*                                                   (7)write to Disk                                             *");
            System.out.println("*                                                   (8)Exit                                                      *");
            System.out.println("*                                                                                                                *");
            System.out.println("*                                                                                                                *");
            System.out.println("******************************************************************************************************************");
            System.out.println("Please Enter a command: ");
            menu = in.nextLine().toUpperCase();

            switch (menu) {
                case "1":
                    System.out.println("Add an entry");

                    System.out.print("Enter a FIRST and LAST Name: ");
                    String name = in.nextLine();

                    System.out.print("Enter an EMAIL ADDRESS: ");
                    String email = in.nextLine();

                    System.out.print("Enter a PHONE NUMBER: ");
                    double phoneNumber = in.nextDouble();



                    newList.add(name, email, phoneNumber);
                    break;
                case "2":
                    System.out.print("Enter index number to delete: ");
                    int delete = in.nextInt();
                    newList.delete(delete);
                    break;
                case "3":
                    System.out.print("Enter an E-mail to search for: ");
                    String sEmail = in.nextLine();
                    newList.emailSearch(sEmail);
                    break;
                case "4":
                    System.out.println("Print Phonebook");
                    newList.printList();
                    break;
                case "5":
                    System.out.println("Restore from disk");
                    if(fileName.equals("")){
                        fileName = "pages";
                    }
                    newIO.readFile(fileName);
                    break;
                case "6":
                    System.out.print("Enter a Name to search for: ");
                    String sName = in.nextLine();
                    newList.nameSearch(sName);
                    break;
                case "7":
                    System.out.println("Write to disk\n");
                    if(fileName.equals("")){
                        System.out.print("Name of file: ");
                        fileName = in.nextLine();
                    }else{
                        System.out.print("Use existing file " + fileName + " ? (Y/N): ");
                        String yn = in.nextLine();
                        switch(yn.toLowerCase()){
                            case "y":
                                break;
                            case "n":
                                System.out.print("New file name: ");
                                fileName = in.nextLine();
                        }
                    }
                    newIO.writeFile(fileName, newList);
                    break;
                case "8":
                   System.out.println("Exiting!");
                    done = true;
                    break;
                default:
                    System.out.println("Unknown entry");
            }

        }  while (!done);
        System.out.println("Thanks for using ");

    }
}
