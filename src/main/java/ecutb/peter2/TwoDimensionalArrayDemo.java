package ecutb.peter2;

import java.util.Random;

//https://www.youtube.com/watch?v=JR0n67L-0is&list=PLQXo9104N61GgQJlO7qqQudgvCgh1YX4o&index=13
public class TwoDimensionalArrayDemo {

    public static void main(String[] args) {

        int[] array = new int[3];
        array[0] = 5;
        array[1] = 10;
        array[2] = 14;

        int[][] array2 = new int[3][4];

        array2[0][0] = 5;
        array2[0][1] = 10;
        Random rand = new Random();

        for(int r=0; r<array2.length; r++){
            for(int c=0; c<array2[r].length; c++){
                array2[r][c] = rand.nextInt(100);
            }
        }
        for(int r=0; r<array2.length; r++){
            for(int c=0; c<array2[r].length; c++){
                System.out.print(array2[r][c] + " ");
            }
            System.out.println();   //print blank space
        }

    }
}
