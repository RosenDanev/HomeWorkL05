package HomeWorkL05;

public class TestArrays {
    public static void main(String[] args) {
        String [] cars = {"Volvo", "Mazda", "Opel" };
        System.out.println(cars[0]);
        cars[0] = "Mercedes";
        for (int d=0; d< cars.length; d++)
        System.out.println(cars[d]);

        int [] myNum = new int [20];
        for (int i=0; i < myNum.length; i++) {
            myNum [i] = i *5;
            int sum = 0;
            sum+= myNum[i];
            System.out.println(sum);
            //int avarrageValue +=

            //System.out.println(myNum[i]);


        }
    }
}
