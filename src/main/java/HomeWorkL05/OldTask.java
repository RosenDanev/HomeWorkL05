package HomeWorkL05;

import java.util.Scanner;

public class OldTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Моля въведете число");
        int number = Integer.parseInt(scanner.nextLine());

        if ((number % 2) == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is uneven");
        }
    }
}



