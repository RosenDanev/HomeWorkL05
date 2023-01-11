package HomeWorkL07;

public class Task3ArrEvenorOdd {
    public static void main(String[] args) {
        //Напишете програма, която приема масив от числа и изчислява
        // сумата на всички четни и нечетни числа от поредицата изписвайки подходящо съобщение с резултат.
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 5;
        }
        int evenSum = 0;
        for (int i = 0; i < arr.length; i++)
            if (i % 2 == 0) {
                evenSum += arr[i];
            }
        System.out.printf("\nThe sum of even numbers is %d\n", evenSum);

        int oddSum = 0;
        for (int i = 0; i < arr.length; i++)
            if (i % 2 != 0) {
                oddSum += arr[i];
            }
        System.out.printf("The sum of odd numbers is %d\n", oddSum);
    }
}