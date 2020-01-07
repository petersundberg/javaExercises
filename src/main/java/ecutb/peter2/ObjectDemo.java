package ecutb.peter2;
import java.util.Scanner;

//https://www.youtube.com/watch?v=EMoHBbSp6ZE&list=PLQXo9104N61GgQJlO7qqQudgvCgh1YX4o&index=14
public class ObjectDemo {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = keyboard.next();
        System.out.println("Hello, " + name.toUpperCase());


    }
}
