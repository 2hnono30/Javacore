package Product_Student_Animal_User.Animal;

import Product_Student_Animal_User.Product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalTest {
    private List<Animal>AnimalList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public AnimalTest(){
        AnimalList.add(new Animal(1,"Dog"));
        AnimalList.add(new Animal(2,"Cat"));
        AnimalList.add(new Animal(3,"Duct"));
        AnimalList.add(new Animal(4,"bird"));
    }
    public void addAnimal() {
        //System.out.println("nhap id:");
        // int id = Integer.parseInt(scanner.nextLine());
        long id = AnimalList.size() + 1;

        System.out.println(id);
        System.out.println("Nhap Ten Animal:");
        String animalName = scanner.nextLine();
        Animal animal = new Animal(id, animalName);
        AnimalList.add(animal);
    }
    public void showAnimal() {
        System.out.printf("%-12s%-12s\n", "Id", "Tên Animal");
        for (Animal animal : AnimalList) {
            System.out.printf("%-12s%-12s\n", animal.getId(), animal.getAnimal());
        }
    }

    public static void main(String[] args) {
        AnimalTest animalTest = new AnimalTest();
        animalTest.showAnimal();
        animalTest.addAnimal();
        animalTest.showAnimal();
    }
}
