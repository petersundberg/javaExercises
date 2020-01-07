package ecutb.peter;
//https://www.youtube.com/watch?v=gJqUwp62Ur0&list=PLQXo9104N61GapjToZ6FRCGt7dRoh8JtO&index=11
import java.util.Scanner;

public class BreakContinueDemo {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int i = 0;

    do {
        System.out.println("Enter number 1:");
        int number1 = keyboard.nextInt();

        System.out.println("Enter number 2:");
        int number2 = keyboard.nextInt();
        if(number2 == 0){
            //break;    //avbryter loop
            continue;   //avbryter pågående loop iteration, går till nästa loop iteration
        }
        System.out.println(number1 + "/" + number2 + " is " + (number1 / number2));
        i++;

    } while(i<10);

        System.out.println("The end");
    }
}
