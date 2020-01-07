package ecutb.peter;

import java.text.DecimalFormat;

//https://www.youtube.com/watch?v=hjsTu8300vg&list=PLQXo9104N61EFwJlfWvTAE8ihs8tPwM7m&index=18
public class CurrencyDemo {

    public static void main(String[] args) {

        double price = 93.4567;

        //printf:
        System.out.printf("The total price is $%,.2f\n", price);


        //println:
        DecimalFormat df = new DecimalFormat("$#,##0.00");
        System.out.println("The total price is " + df.format(price));


    }
}
