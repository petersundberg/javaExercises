package ecutb.peter2;
//https://www.youtube.com/watch?v=aIy1-6mcHPE&list=PLQXo9104N61GgQJlO7qqQudgvCgh1YX4o&index=9
public class ArrayMethodsDemo {

    public static void main(String[] args) {

        int[] array = {2, 4, 6, 8, 10};

        System.out.println("Min is: " + min(array));
        System.out.println("Max is: " + max(array));
        System.out.println("Sum is: " + sum(array));
        System.out.println("Average is: " + average(array));

    }
    //minimum
    public static int min(int[] x){
        int temp = x[0];
        for(int i=0; i<x.length; i++){
            if(temp > x[i])
                temp = x[i];
        }
        return temp;
    }
    //max
    public static int max(int[] x){
        int temp = x[0];
        for(int i=0; i<x.length; i++){
            if(temp < x[i])
               temp = x[i];
        }
        return temp;
    }
    //sum
    public static int sum(int[] x){
        int total = 0;
        for(int i=0; i<x.length; i++) {
            total += x[i];
        }
        return total;
        }
    //average
    public static int average(int[] x){
        int total = 0;
        for(int i=0; i<x.length; i++) {
            total += x[i];
        }
        return total/x.length;
    }
}

