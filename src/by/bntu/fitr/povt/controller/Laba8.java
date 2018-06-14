package by.bntu.fitr.povt.controller;

import by.bntu.fitr.povt.model.Bouquet;
import by.bntu.fitr.povt.model.Florist;
import by.bntu.fitr.povt.model.Price;
import by.bntu.fitr.povt.view.View;

public class Laba8 {

    public static void main(String[] args) {

        View.print("\nHello, you are in the flower's shop.\n");

        Florist florist = new Florist();

        //create bouquet of flowers
        Bouquet bouquet = florist.createBouquet();


        if (bouquet.size() > 0) {

            //count price of bouquet
            Price price = new Price();
            double totalPrice = price.getTotalPrice(bouquet) ;

            //sort bouquet
            bouquet = bouquet.getSortBouquet();

            ///view
            View.print("Cost of your bouquet " + totalPrice);
            View.printSortedBouquet(bouquet);
        } else {
            View.print("In your bouquet is not any  flowers");
        }
    }
}
