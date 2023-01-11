package HomeWorkL07;

import java.util.Scanner;

public class Task4From1toN {
    public static void main(String[] args) {
        //Напишете програма (метод), която отпечатва на конзолата числата от 1 до N.
        // Числото N се приема като параметър.
        System.out.println("Please enter a number for length for a new array");
        Scanner scanner = new Scanner(System.in);
        int [] newArr = new int[scanner.nextInt()];

        for (int i=0; i< newArr.length; i++){
            newArr[i] = i+1;
            System.out.println(newArr[i]);

        }

    }
}
