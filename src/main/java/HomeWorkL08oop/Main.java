package HomeWorkL08oop;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog(3,"Lexy",3.05f,true, "Pomeranian" );
        Cat cat1 = new Cat(2,"Suzi",2.55f, true, "Siamska");
        Dog dog2 = new Dog(dog1);

        Address dogAddress = new Address();
        Address catAddress = new Address();

        dogAddress.setPostalCode(1000);
        dogAddress.setCity("Sofia");
        dogAddress.setStreetName("prof.At.Ishirkov");

        catAddress.setPostalCode(8800);
        catAddress.setCity("Sliven");
        catAddress.setStreetName("Hadzhi Dimitar");

        //cat1.setBreed("Siamska");
       // cat1.setName("Sara");
        //cat1.setAge(3);
       // cat1.setWeight(3.05f);
       // cat1.setHasTail(true);
        cat1.setAddress(catAddress);

        dog1.setAddress(dogAddress);

        dog2.setAddress(dogAddress);

        dog1.printData();
        dog1.bark();
        cat1.printData();
        cat1.mau();

        dog2.printData();


    }
}
