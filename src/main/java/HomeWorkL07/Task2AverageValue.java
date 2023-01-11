package HomeWorkL07;

public class Task2AverageValue {
    public static void main(String[] args) {
        //Напишете програма, която изчислява средната
        // стойност от всички числа в масив (може да се използва горния масив)
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 5;
        }

        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        int average = total / arr.length;
        System.out.printf("The average of the numbers in the array is %d\n", average);
    }
}
