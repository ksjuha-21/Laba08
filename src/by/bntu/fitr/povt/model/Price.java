package by.bntu.fitr.povt.model;

import by.bntu.fitr.povt.model.product.flowers.Flower;

import java.util.List;

public class Price {

    public double getTotalPrice(List<Flower> flowers) {

        double price = 0.00;
        for (Flower f : flowers) {
            price += f.getCost();
        }
        return price;
    }


}
