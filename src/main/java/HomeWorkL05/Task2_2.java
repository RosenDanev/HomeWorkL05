package HomeWorkL05;

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String firstName = scanner.nextLine();

        System.out.println("Enter your username");
        String userName = scanner.nextLine();

        System.out.println(firstName.equalsIgnoreCase(userName));
    }
}
