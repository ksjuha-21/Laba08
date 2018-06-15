package by.bntu.fitr.povt.controller;

import by.bntu.fitr.povt.model.Bouquet;
import by.bntu.fitr.povt.model.Florist;
import by.bntu.fitr.povt.model.Price;
import by.bntu.fitr.povt.view.UserInput;
import by.bntu.fitr.povt.view.View;

public class Controller {

    Florist florist = new Florist();
    Bouquet bouquet = new Bouquet();

    public void request() {

        View.print("What kind of flowers for your bouquet do you want?\n");

        chooseFlowerAndColor(); // 1-st flower
        chooseFlowerAndColor(); // 2-nd flower
        chooseFlowerAndColor(); // 3-d flower

    }

    public void response() {

        if (bouquet.size() > 0) {

            //count price of bouquet
            Price price = new Price();
            double totalPrice = price.getTotalPrice(bouquet);

            //sort bouquet
            bouquet = bouquet.getSortBouquet();

            ///view
            View.print("Your order is ready:\n");
            View.printSortedBouquet(bouquet);
            View.print("Cost of your bouquet " + totalPrice);
            View.print("Thanks for order!");
        } else {
            View.print("In your bouquet is not any  flowers");
        }

    }

    private boolean check(String flower) {
        if (flower.toUpperCase().equals("R") | flower.toUpperCase().equals("C") | flower.toUpperCase().equals("I") | flower.toUpperCase().equals("T")) {
            return true;
        }
        return false;
    }

    private void chooseFlowerAndColor() {
        String flower = UserInput.input("Choose kind of flower:  C - Camomile, I - Iris, R - Rose, T - Tulip\n");

        if (check(flower)) {
            String color = UserInput.input("Color of flower:\n");
            bouquet = florist.createBouquet(flower, color); // add flower in bouquet
        } else {
            View.print("Sorry, but this flower is not yet in our FlowerShop\n");
        }

    }
}
