package ecutb.peter3;

import java.io.IOException;

//https://www.youtube.com/watch?v=KNkkpdHTT_Q&list=PLQXo9104N61G_Suw1n0Jjg1VrBFvYBZMg&index=2
public class InputStreamDemo {

    public static void main(String[] args) throws IOException {

        //read 1st byte
        int input = System.in.read();

        //print ASCII character
        System.out.println(input);

    }
}
