package ecutb.peter;

import java.awt.image.BandedSampleModel;
import java.util.Scanner;

public class DoWhileDemo {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Enter the price: ");
            double price = keyboard.nextDouble();

            System.out.println("Enter the quantity: ");
            int qty = keyboard.nextInt();

            double total = price * qty;
            System.out.printf("The total is: $%.2f\n", total);

            System.out.println("Do you want to calculate another total? Yes (Y) or No (N)");
            answer = keyboard.next();
        }
        while(answer.equalsIgnoreCase("Y"));



    }
}
