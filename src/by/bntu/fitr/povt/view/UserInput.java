package by.bntu.fitr.povt.view;

import java.util.Scanner;

public class UserInput {

    public static String input (String msg) {

        System.out.println(msg);

        return new Scanner(System.in).next();
    }

}
