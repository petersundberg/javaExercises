package ecutb.peter3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

//https://www.youtube.com/watch?v=mkqbbkBqOaU&list=PLQXo9104N61G_Suw1n0Jjg1VrBFvYBZMg&index=6
public class WriteFile {
    public static void main(String[] args) throws FileNotFoundException {

        FileOutputStream fos = new FileOutputStream("myfile.txt", true);
        PrintWriter pw = new PrintWriter(fos);

        pw.println("I love Java");
        pw.println(56);
        pw.close();
        System.out.println("File myfile.txt was written to");

    }
}
