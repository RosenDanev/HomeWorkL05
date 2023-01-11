package HomeWorkL07;

import java.util.Scanner;

public class Task4Version3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        numbersToN(a);

    }

    public static void numbersToN(int number){
        for (int i = 0; i <= number ; i++) {
            System.out.println(i);

        }


    }
}
