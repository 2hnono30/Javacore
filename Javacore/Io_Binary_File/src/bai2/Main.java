package bai2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream obs = new ObjectOutputStream(fileOutputStream);
            obs.writeObject(students);
            obs.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<Student>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile("G:\\JavaCore\\Javacore\\Io_Binary_File\\src\\bai2\\Student.txt", students);
        List<Student> studentList = readDataFromFile("G:\\JavaCore\\Javacore\\Io_Binary_File\\src\\bai2\\Student.txt");
        for (Student s: studentList) {
            System.out.println(s);
        }

    }
}
