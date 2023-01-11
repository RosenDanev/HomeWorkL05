package HomeWorkL07;

public class Test {
    public static void main(String[] args) {

        int[][] numbers = new int[3][4];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers [i] [j] = i+1;
                numbers [i] [j] = j+1;

                System.out.printf("%d  %d, %d\n",i, j, numbers[i] [j]);
            }
        }
    }
}

