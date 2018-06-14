package by.bntu.fitr.povt.model;

import by.bntu.fitr.povt.model.product.flowers.Flower;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Bouquet extends ArrayList<Flower> {

    public Bouquet getSortBouquet() {

        Collections.sort(this, new Comparator<Flower>() {
            public int compare(Flower o1, Flower o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        return this;
    }
}
