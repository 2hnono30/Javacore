package Product_Student_Animal_User.Animal;

public class Animal {
    private long id;
    private String animalName;
    public Animal(long id,String animalName){
        this.id=id;
        this.animalName=animalName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAnimal() {
        return animalName;
    }

    public void setAnimal(String animal) {
        this.animalName = animalName;
    }
}
