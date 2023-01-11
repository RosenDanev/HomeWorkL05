package HomeWorkL07;

import java.util.Scanner;

public class Task6Version2 {
    public static void main(String[] args) {
        System.out.println("\nPlease enter a length for the Fibonacci sequence: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        int[] values = new int[a];
        values[0] = 0;
        values[1] = 1;

        for(int i = 2; i < a; i++){
            values[i] = values[i - 1] + values[i - 2];}
        for(int i = 0; i < a; i++){
            System.out.println(values[i]);}
    }
}
