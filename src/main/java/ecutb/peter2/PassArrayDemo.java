package ecutb.peter2;
//https://www.youtube.com/watch?v=szfN_MWsX9A&list=PLQXo9104N61GgQJlO7qqQudgvCgh1YX4o&index=6
public class PassArrayDemo {

    public static void main(String[] args) {

        String[] colors = {"blue", "purple", "yellow", "green", "red", "orange"};
        //Pass single array element to Method:
        printColor(colors[2]);
        //Pass whole array to Method:
        printColor(colors);
    }
    //Single array element to array:
    public static void printColor(String color){
        System.out.println(color);
    }
    //Whole array to Method:
    public static void printColor(String[] colors){
        for(int i=0; i<colors.length; i++){
            System.out.println(colors[i]);
        }
    }
}
