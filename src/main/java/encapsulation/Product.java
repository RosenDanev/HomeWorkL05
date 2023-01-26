package encapsulation;

public class Product {
    private String name;
    private float cost;

    public String getName() {
        return name;
    }

    public Product (String name, float cost){
        setName(name);
        setCost(cost);

    }

    public void setName(String name) {
        if (!name.trim().isEmpty() && !name.isBlank()) {
            this.name = name;
        }else{
            System.out.println("ERROR: Invalid input data for Name");
        }
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {

        if (cost >= 0) {
            this.cost = cost;
        }
        else {
            System.out.println("ERROR: Invalid input data for Cost");
        }
    }


}
