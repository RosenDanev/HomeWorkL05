package HomeWorkL08oop;

public class Dog extends Animal {
    private String breed;
    private int age;
    private String name;
    private float weight;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (!breed.isEmpty() && !breed.isBlank()) {
            this.breed = breed;
        }else{
            System.out.println("ERROR: Invalid input data for Breed");
        }

    }

    //method
    public void bark(){
        System.out.println("Bau bau");
    }
    public void printData(){
        System.out.printf("Name is: %s, breed is: %s, age is %d, weight is: %.3f, address is: %s\n", super.getName(), breed, super.getAge(),
                super.getWeight(), super.getAddress().toString());
    }

}
