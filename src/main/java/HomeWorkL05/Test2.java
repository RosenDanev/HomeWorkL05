package HomeWorkL05;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "Rosen Danev e super";
        System.out.println(name);
        System.out.println("Enter new name");
        String family = scanner.nextLine();
        System.out.println(name.replaceAll("Rosen Danev",family));

        String test1 = "Proba";
        int test2 = 5;
        System.out.printf("%s = %d\n",test1, test2);

        String food = " I like to travel around Europe ";
        int count = food.split("\\s").length;
        System.out.println(count);
        System.out.println("Enter two numbers: a - double, b - int");
        double a = Double.parseDouble(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        double c = a*b;


    }
}
