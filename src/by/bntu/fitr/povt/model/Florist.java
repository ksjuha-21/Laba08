package by.bntu.fitr.povt.model;

import by.bntu.fitr.povt.model.product.flowers.Iris;
import by.bntu.fitr.povt.model.product.flowers.Rose;
import by.bntu.fitr.povt.model.product.flowers.Tulip;

public class Florist {

    public Bouquet createBouquet() {

        //create bouquet of flowers
        Bouquet bouquet = new Bouquet();
        bouquet.add(new Rose("Red"));
        bouquet.add(new Iris("White"));
        bouquet.add(new Tulip("Purple"));

        return bouquet;
    }

}
