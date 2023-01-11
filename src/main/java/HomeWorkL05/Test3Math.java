package HomeWorkL05;

public class Test3Math {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = (int)Math.pow(a, b);
        int d = 2^3;
        System.out.println(c); //степенуване
        System.out.println(d); // побитово
        int randomNum = (int)(Math.random() * 101); //тук може да се даде какво да бъде числото за горната граница
        System.out.println(randomNum); // печата рандом число при всяко стартиране на програмата
    }
}
