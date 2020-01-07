package ecutb.peter;
//https://www.youtube.com/watch?v=YhiL7QDLeRQ&list=PLQXo9104N61EFwJlfWvTAE8ihs8tPwM7m&index=16
public class CharCompareDemo {

    public static void main(String[] args) {

        char char1 = 'X';
        char char2 = 'X';

        if (char1 > char2)
            System.out.println(char1 + " is greater than " + char2);
        else if(char1 == char2)
            System.out.println(char1 + " is equal to " + char2);
        else
            System.out.println(char1 + " is less than " + char2);
    }
}
