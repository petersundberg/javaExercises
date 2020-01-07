package ecutb.peter3;

import java.io.PrintWriter;
import java.io.StringWriter;

//https://www.youtube.com/watch?v=4Vvc00FowGA&list=PLQXo9104N61G_Suw1n0Jjg1VrBFvYBZMg&index=5
public class StringOutputDemo {

    public static void main(String[] args) {

        StringWriter charStream = new StringWriter();
        PrintWriter outputStringStream = new PrintWriter(charStream);

        String firstName = "Will";
        String lastName = "Smith";
        int age = 49;

        outputStringStream.print(firstName + " " + lastName + " is " + age + " years old");
        String message = charStream.toString();
        System.out.println(message);

    }
}
