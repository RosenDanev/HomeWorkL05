package HomeWorkL07;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //Напишете програма, която отпечатва на конзолата числата от 1 до N, които не се делят на 3 и 7.
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
                if ((i % 3 == 0) && (i % 7 == 0)) {
                    continue;
                }
                System.out.println(i);
            }
        }
    }

