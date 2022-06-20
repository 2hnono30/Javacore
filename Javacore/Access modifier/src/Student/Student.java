package Student;

public class Student {
    private String name="john";
    private String classes="C02";
    Student(){
    }
    Student(String name,String classes){
    this.name=name;
    this.classes=classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
