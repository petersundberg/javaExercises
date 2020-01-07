package ecutb.peter2;
//https://www.youtube.com/watch?v=yh34ft5ZfM4&list=PLQXo9104N61GgQJlO7qqQudgvCgh1YX4o&index=10
public class StringArrayDemo {

    public static void main(String[] args) {

        String[] colors = {"red", "orange", "yellow", "green", "blue", "purple"};

        System.out.println(colors.length);  //length or size of the array
        System.out.println(colors[0].length()); //length of the String "red"
        System.out.println(colors[3].length()); //length of the String "green"
        System.out.println(colors[3].toUpperCase()); //UPPERCASE letter of the String "green"

        loopStringArray(colors);
    }

    public static void loopStringArray(String[] x){
        for(int i=0; i<x.length; i++){
            System.out.println(x[i].length());
        }

    }
}
