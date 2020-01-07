package ecutb.peter3;

import java.util.Scanner;

//https://www.youtube.com/watch?v=4Vvc00FowGA&list=PLQXo9104N61G_Suw1n0Jjg1VrBFvYBZMg&index=5
public class StreamsUsingStrings {

    public static void main(String[] args) {

        String message = "John Smith 21";
        Scanner sc = new Scanner(message);

        String firstName = sc.next();
        String lastName = sc.next();
        int age = sc.nextInt();
        System.out.println(firstName + " " + lastName + " is " + age + " years old");
    }
}
