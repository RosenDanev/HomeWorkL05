package HomeWorkL05;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        arr = shiftElementToTheLeft(arr, 4);

        System.out.println(Arrays.toString(arr));
    }

    static int[] shiftElementToTheLeft(int[] arr, int shift) {
        if (arr.length < 1) {
            return new int[0];
        }

        if (shift > arr.length) {
            shift = shift % arr.length;
        }
        int[] arr2 = new int[arr.length];

        int newIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (i - shift < 0) {
                newIndex = arr.length - Math.abs(i - shift);
            } else {
                newIndex = i - shift;
            }

            arr2[newIndex] = arr[i];
        }
        return arr2;
    }
}

