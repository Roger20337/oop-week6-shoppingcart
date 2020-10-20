package com.company;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        ArrayList<Items> items = new ArrayList<items>();

        items.add(orange);
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
