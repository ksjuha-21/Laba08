package by.bntu.fitr.povt.view;

import by.bntu.fitr.povt.model.product.flowers.Flower;

import java.util.ArrayList;

public class View {

    public static void print (String msg) {
        System.out.println(msg);
    }

    public static void printSortedBouquet(ArrayList<Flower> flowers) {

        for (Flower flower: flowers)
            System.out.println(flower.getName() + "-" +  flower.getColor());
    }

}
