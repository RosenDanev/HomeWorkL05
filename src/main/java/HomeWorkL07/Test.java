package HomeWorkL07;

public class Test {
    public static void main(String[] args) {
        math(10, 10);
        System.out.println(add(1,1));

        int[][] numbers = new int[3][4];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers [i] [j] = i+1;
                numbers [i] [j] = j+1;

                System.out.printf("%d  %d, %d\n",i, j, numbers[i] [j]);
            }
        }
    }
    public static void math(int a, int b){
        int c = a*b;
        System.out.println(c);
    }
    public static int add(int a, int b){
        return a+b;
    }
}

