package HomeWorkL08oop;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        Address dogAddress = new Address();
        dogAddress.setPostalCode(1000);
        dogAddress.setCity("Sofia");
        dogAddress.setStreetName("prof.At.Ishirkov");

        cat1.setBreed("Siamska");
        cat1.setName("Sara");
        cat1.setAge(3);
        cat1.setWeight(3.05f);
        cat1.setHasTail(true);

        dog1.setBreed("Pomeranian");
        dog1.setName("Lexy");
        dog1.setAge(6);
        dog1.setWeight(3.35f);
        dog1.setHasTail(true);
        dog1.setAddress(dogAddress);

        dog1.printData();
        dog1.bark();
        cat1.printData();
        cat1.mau();


    }
}
