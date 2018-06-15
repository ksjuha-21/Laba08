package by.bntu.fitr.povt.model;

import by.bntu.fitr.povt.model.product.flowers.Camomile;
import by.bntu.fitr.povt.model.product.flowers.Iris;
import by.bntu.fitr.povt.model.product.flowers.Rose;
import by.bntu.fitr.povt.model.product.flowers.Tulip;

public class Florist {

    //create bouquet of flowers
    Bouquet bouquet = new Bouquet();

    public Bouquet createBouquet(String flower, String color) {


        switch (flower.toUpperCase()) {
            case "R":
                bouquet.add(new Rose(color));
                break;
            case "C":
                bouquet.add(new Camomile(color));
                break;
            case "I":
                bouquet.add(new Iris(color));
                break;
            case "T":
                bouquet.add(new Tulip(color));
                break;
            default:
                return bouquet;
        }

        return bouquet;
    }

}
