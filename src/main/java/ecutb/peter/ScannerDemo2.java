package ecutb.peter;

import java.util.Scanner;

public class ScannerDemo2 {
//https://www.youtube.com/watch?v=A1QXB_6ALDA&list=PLQXo9104N61HtWKc_kG-wZI53fJEgwm2r&index=19

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = keyboard.nextLine();

        System.out.println("How old are you?");
        int age = keyboard.nextInt();

        System.out.println("How much money do you have?");
        double money = keyboard.nextDouble();

        System.out.println("What is your favorite character?");
        char favorite = keyboard.next().charAt(0);

        System.out.println("Hi, " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("You have $" + money);
        System.out.println("You love the " + favorite);

        //System.out.println(name.toUpperCase());
        String message = "I love Java programming!";

        System.out.println(message.toUpperCase());
        message = message.toUpperCase();
        System.out.println(message);


//        System.out.println(message.toLowerCase());
//        System.out.println(message.concat(" YAY!!!"));
//        System.out.println(message + " I really do!");
//        System.out.println(message.replace("Java","C++"));


    }
}
