package encapsulation;

public class Main {
    public static void main(String[] args) {
        Person elena = new Person("Elena",11.0f);
        Person alex = new Person("Alex", 4.0f);
        Product coffee = new Product("Coffee", 10.0f);
        Product tea = new Product("Tea", 2.0f);

        elena.buyProduct(coffee);
        alex.buyProduct(tea);
        alex.buyProduct(tea);
        elena.buyProduct(tea);
        elena.printItemsFromTheBag();
        alex.printItemsFromTheBag();

    }


}
