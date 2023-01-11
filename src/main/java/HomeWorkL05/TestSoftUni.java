package HomeWorkL05;

import java.util.Scanner;

public class TestSoftUni {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int firstCycle = number % 10;
        number = number/10;
        int secondCycle = number % 10;
        int thirdCycle = number/10;

        for(int i = 1; i <= firstCycle; i ++) {
            for(int j = 1; j <= secondCycle; j ++) {
                for(int h = 1; h <= thirdCycle; h ++) {
                    System.out.printf(" %d * %d * %d =", i, j, h);
                    System.out.print(" "+ (i * j * h) + ";");
                    System.out.println();
                }
            }
        }

    }
}
