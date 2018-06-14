package by.bntu.fitr.povt.model.product.flowers;

public abstract class Plant {

    private final String name;
    private String color;

    public Plant(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }


}
