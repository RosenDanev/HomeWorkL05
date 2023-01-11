package HomeWorkL07;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //Напишете програма, която отпечатва сумата на първите N члена от редицата на Фибоначи.
        // Числата на Фибоначи започват от 0 и 1, като всяко следващо се получава като сума от предходните две.
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 1;
        for (int i = 0; i<number; i++){
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }
    }

}
