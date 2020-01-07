package ecutb.peter2;
//https://www.youtube.com/watch?v=FJmnBVZpEKc&list=PLQXo9104N61GgQJlO7qqQudgvCgh1YX4o&index=3
import java.util.Random;

public class ArrayDemo2 {

    public static void main(String[] args) {

        int[] temps = new int[365];

//        for(int i=0; i<temps.length; i++){
//            Random rand = new Random();
//            temps[i] = rand.nextInt(100);
//        }
//
//        for(int i=0; i<temps.length; i++){
//            System.out.println("temps[" + i + "] = " + temps[i]);
//        }

//        for(int i=0; i<temps.length; i++){
//            Random rand = new Random();
//            temps[i] = rand.nextInt(100);
//            System.out.println(temps[i]);
//            System.out.println("temps index[" + i + "] = " + temps[i]);
//        }

        String[] names = {"Lars", "Anna", "Marie", "Peter", "Kalle", "Olle", "Lisa", "Lena", "Pelle", "Ella"};

        for(int i=0; i<names.length; i++){
            Random rand = new Random();
            int randomName = rand.nextInt(10);
            System.out.println("Random name from array \"names\": " + names[randomName]);
        }

        //System.out.println("Length of array \"names\" is: " + names.length);

    }
}
