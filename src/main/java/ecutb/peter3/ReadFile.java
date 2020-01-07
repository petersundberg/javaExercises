package ecutb.peter3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//https://www.youtube.com/watch?v=mkqbbkBqOaU&list=PLQXo9104N61G_Suw1n0Jjg1VrBFvYBZMg&index=6
public class ReadFile {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("myfile.txt");
        Scanner in = new Scanner(fis);

        //print content while there is any (loop through each row)
        while (in.hasNext()){
            System.out.println(in.nextLine());
        }

    }
}
