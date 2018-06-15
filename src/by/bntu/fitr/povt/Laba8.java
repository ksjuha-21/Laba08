package by.bntu.fitr.povt;

import by.bntu.fitr.povt.controller.Controller;
import by.bntu.fitr.povt.view.View;

/**
 * Laboratory work #8
 * Advance Object-Oriented Programming with Java.SOLID and GRASP principles
 *
 * @author oksana.severovostokova
 * group 30701216
 */
public class Laba8 {

    public static void main(String[] args) {

        View.print("\nHello, you are in the FlowerShop.\n");

        Controller controller = new Controller();

        controller.request();
        controller.response();

    }
}
