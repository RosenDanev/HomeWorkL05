package Test.Object;

public class Test {
    public static void main(String[] args) {
        Dog pomeranian = new Dog();
        System.out.println(pomeranian.age +" "+ pomeranian.name);
        pomeranian.name = "Lexy";
        pomeranian.age = 6;

        System.out.println("My dog`s name is: "+ pomeranian.name+". "+ "It`s a "+ pomeranian.age + " years old.");
    }
}
