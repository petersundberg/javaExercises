package ecutb.peter;

import java.util.Scanner;

public class InutValidationDemo {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = keyboard.nextInt();

        while(age <0 || age > 130){
            System.out.println("That's not possible, try again!");
            age = keyboard.nextInt();
        }
        System.out.println("You are " + age + " years old");
    }
}
