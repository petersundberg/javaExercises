package ecutb.peter2;

import java.util.ArrayList;
import java.util.Collections;

//https://www.youtube.com/watch?v=Z-Zs4sgcyv0&list=PLQXo9104N61FrXvyst6V7V-o4i_cUPl7U&index=15
public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("cereal");
        list.add("milk");
        list.add("bacon");
        list.add("beer");
        list.remove("milk");    //Remove item "milk"
        list.set(1, "hot pockets"); //Add "hot pockets" at index 1
        //list.remove(2);      //Remove index 2
        //list.clear();   //clears ArrayList
        //list.add("carrots");
        Collections.sort(list); //Sort ArrayList alphabetically

        for(int i =0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("Size of ArrayList: " + list.size());

    }
}
