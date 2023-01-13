package HomeWorkL08oop;

import org.jetbrains.annotations.NotNull;

public class Animal {
    private int age;
    private String name;
    private float weight;
    private boolean hasTail;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean HasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        }else{
            System.out.println("ERROR: Invalid input data for age");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        if (!name.isEmpty() && !name.isBlank()) {
            this.name = name;
        }else{
            System.out.println("ERROR: Invalid input data for Name");
        }

    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight > 0){
            this.weight = weight;
        }else{
            System.out.println("ERROR: Invalid input data for weight");
        }
    }
    public void printData(){
        System.out.printf("Name is: %s, age is %d, weight is: %.3f and has a Tail: %b\n", name, age, weight, hasTail);
    }
}

