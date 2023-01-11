package HomeWorkL05;

import java.util.Scanner;

public class Oldtask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int num1 = Integer.parseInt(scanner.nextLine());

        if (num * num1 ==25) {
            System.out.println("Числото е четно");
        }
        else {
            System.out.println("Числото е нечетно");
        }
    }
}
