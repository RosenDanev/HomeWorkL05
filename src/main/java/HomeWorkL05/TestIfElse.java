package HomeWorkL05;

public class TestIfElse {
    public static void main(String[] args) {
        int a = 3;
        int b = 10;
        int c = 11;

        if ((a == b) && (a < c)) {
            System.out.println(c);
        }
        else {
            System.out.println("Invalid");

            int time = 20;

            String result = (time < 18) ? "Good day" : "Good night";
            System.out.println(result);

        }
    }
}