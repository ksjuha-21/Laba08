package by.bntu.fitr.povt.model.product.flowers;


public abstract class Flower extends Plant {

    private double cost;

    public Flower(String name, double cost, String color) {
        super(name, color);
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
