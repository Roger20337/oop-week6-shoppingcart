package com.company;
import java.util.ArrayList;
public class Main {

    public static <items> void main(String[] args) {

        ArrayList<items> items = new ArrayList<items>();

        items orange;
        items.add(orange);
        items apple;
        items.add(apple);

        Double [] price = {0.25, 0.60};
        int quantity = 0;
        double total = 0;

        for (int i = 0; i< items.length; i++) {
            total+=price[i] * quantity;
        }

        System.out.println("£ "+total);

    }
}
