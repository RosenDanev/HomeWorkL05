package HomeWorkL08oop;

public class Cat extends Animal{
    private String breed;

    public void setBreed(String breed) {
        if (!breed.isEmpty() && !breed.isBlank()) {
            this.breed = breed;
        }else{
            System.out.println("ERROR: Invalid input data for Breed");
        }

    }

    public void mau() {
        System.out.println("mau mau");
    }
    public void printData(){
        System.out.printf("Name is: %s, breed is: %s, age is %d, weight is: %.3f and has a Tail: %b\n", super.getName(), breed, super.getAge(),
                super.getWeight(), super.HasTail());
    }
}