package HomeWorkL07;

public class Task1ArrayX5 {
    //Да се напише програма, която създава масив с 20 елемента от целочислен тип и инициализира всеки
    // от елементите със стойност равна на индекса на елемента умножен по 5.
    // Елементите на масива да се изведат на конзолата.

    public static void main(String[] args) {
        int[] arr = new int[20];

        for ( int i = 0; i < arr.length; i++) {
            arr[i] = i * 5;
            System.out.printf("Index is: %d and the value is %d\n",i, arr[i]);
        }

    }
}
