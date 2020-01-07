package ecutb.peter2;
//https://www.youtube.com/watch?v=sAp9C9x81Ck&list=PLQXo9104N61GgQJlO7qqQudgvCgh1YX4o&index=2
public class ArrayDemo {

    public static void main(String[] args) {
        int[] array1;
        array1 = new int[3];
        array1[0] = 5;
        array1[1] = 10;
        array1[2] = 15;
        System.out.println(array1[0] + array1[2]);

        double array2[] = new double[4];
        array2[0] = 1.50;
        array2[1] = 0.50;
        array2[2] = 4.99;
        array2[3] = 10.76;
        System.out.println(array2[3]);

        String[] names = {"Joe", "Jack", "Mary"};
        System.out.println(names[2]);
    }
}
