package encapsulation;

import java.util.LinkedList;

public class Person {
    private String name;
    private float money;
    public Person(String name, float money){
        setName(name);
        setMoney(money);
    }

    private LinkedList<Product> bagOfProducts = new LinkedList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.trim().isEmpty() && !name.isBlank()) {
        this.name = name;
    }else{
        System.out.println("ERROR: Invalid input data for Name");
    }
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        if (money >= 0) {
            this.money = money;
        }
        else {
            System.out.println("ERROR: Invalid input data for Money");
        }
    }
    public void buyProduct(Product product){
        if (this.getMoney()>=product.getCost()){
            this.bagOfProducts.add(product);
            this.setMoney(this.getMoney()- product.getCost());
            System.out.printf("\" %s bought %s \"\n", this.getName(), product.getName());
        }else {
            System.out.printf("\" %s can't afford %s \"\n", this.getName(), product.getName());
        }
    }

    public void printItemsFromTheBag(){
        if (bagOfProducts.size() == 0){
            System.out.printf("\" %s Nothing bought \"\n", this.getName());
            return;
        }
        String itemNames = "";
        int index = bagOfProducts.size();
        for (Product product : bagOfProducts){
            if (index > 1){
                itemNames += product.getName() + ", ";
                index --;
            }else{
                itemNames += product.getName();

            }

        }
        System.out.println(this.getName() + " - " + itemNames);
        }
}
