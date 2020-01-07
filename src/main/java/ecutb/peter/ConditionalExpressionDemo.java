package ecutb.peter;
//https://www.youtube.com/watch?v=WR-PfTLAYaE&list=PLQXo9104N61EFwJlfWvTAE8ihs8tPwM7m&index=14
public class ConditionalExpressionDemo {

    public static void main(String[] args) {

        int hours = 10;

        if (hours == 1)
            System.out.println("You worked " + hours + " hour");
        else
            System.out.println("You worked " + hours + " hours");

        System.out.println("You worked " + hours + (hours == 1? " hour": " hours"));

    }
}
