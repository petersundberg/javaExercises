package ecutb.peter;
//https://www.youtube.com/watch?v=g_BsIuRVfvk&list=PLQXo9104N61EFwJlfWvTAE8ihs8tPwM7m&index=17
public class PrintfDemo {

    public static void main(String[] args) {

        String name = "Joe";
        int age = 21;
        double balance = 450.37;

        System.out.printf("Hello %s!\n", name);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You have $%.2f\n", balance);

        System.out.printf("Hi %s, you are %d years old and your balance is: $%.2f.\n", name, age, balance);

    }
}
