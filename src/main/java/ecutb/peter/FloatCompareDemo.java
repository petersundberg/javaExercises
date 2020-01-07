package ecutb.peter;
//https://www.youtube.com/watch?v=m0PLceVGB00&list=PLQXo9104N61EFwJlfWvTAE8ihs8tPwM7m&index=15
public class FloatCompareDemo {

    public static void main(String[] args) {

        final double EPSILON = 0.0001;
        double a = 3.333333333;
        double b = 3.333333334;

        if(Math.abs(a-b) < EPSILON)
            System.out.println("The same");
        else
            System.out.println("Not the same");
    }
}
