package ecutb.peter2;

import java.util.ArrayList;
import java.util.Collections;

//https://www.youtube.com/watch?v=Z-Zs4sgcyv0&list=PLQXo9104N61FrXvyst6V7V-o4i_cUPl7U&index=15
public class ArrayListDemo2 {

    public static void main(String[] args) {

        //ArrayList of Double
        ArrayList<Double> prices = new ArrayList<Double>();
        prices.add(5.15);
        prices.add(9.78);
        prices.add(99.95);
        prices.add(15.41);
        prices.add(1.45);
        prices.add(2.25);
        int nrOfItems = prices.size()-1;
        System.out.println("Number of items in ArrayList \"prices\" is: " + prices.size() + " (index 0 - " + nrOfItems + ")");
        prices.set(0, 100.100);     //Replace index 0 with 100.100
        Collections.sort(prices);   //Sort ArrayList lowest to highest
        Collections.reverse(prices);    //Reverse ArrayList to show highest to lowest

        for(int i=0; i<prices.size(); i++){
            System.out.println(prices.get(i));
        }
    }
}
