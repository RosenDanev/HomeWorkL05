package HomeWorkL05;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String beforeChange = "My name is <myName>";
        System.out.println (beforeChange);
        System.out.println ("Please, enter your name");
        String outputName = scanner.nextLine();
        System.out.println(beforeChange.replace("<myName>", outputName));

    }
}
