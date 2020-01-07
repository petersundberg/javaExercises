package ecutb.peter2;
//https://www.youtube.com/watch?v=b8w50JBVIZ4&list=PLQXo9104N61GuVcaNIxo6B28hHpGzJgfb&index=8

// INTE FÄRDIG!!!!!!!!!!!!!!!!!!!!!!!!!!!!

/**
 * The method overloading Demo class
 */
public class CreatingAPIDemo {
    /**
     * the main method
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add("hello ", "world"));


    }

    /**
     * this method will add up two integers
     * @param a the first integer
     * @param b the second integer
     * @return the sum of and b
     */
    public static int add(int a, int b){
        return a + b;
    }

    /*
     * this is the add method that takes 3 integers
     */
    public static int add(int a, int b, int c){
        return a +b +c;
    }

    /**
     * add up two strings
     * @param a first string
     * @param b 2nd string
     * @return the two strings combined
     */
    public static String add(String a, String b){
        return a + b;
    }
}
