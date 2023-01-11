package HomeWorkL05;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Please re-enter your name:");
        String rename = scanner.nextLine();
        boolean equals1 = name.equals(rename);
        System.out.println(equals1);

    }
}
