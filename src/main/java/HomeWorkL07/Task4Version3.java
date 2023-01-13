package HomeWorkL07;

import java.util.Scanner;

public class Task4Version3 {
    public static void main(String[] args) {
        numbersToN();
    }

    public static void numbersToN(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i <= number ; i++) {
            System.out.println(i);

        }


    }
}
