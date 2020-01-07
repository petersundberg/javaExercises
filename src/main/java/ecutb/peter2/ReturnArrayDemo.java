package ecutb.peter2;
//https://www.youtube.com/watch?v=vV4NE2oaWSg&list=PLQXo9104N61GgQJlO7qqQudgvCgh1YX4o&index=7
public class ReturnArrayDemo {

    public static void main(String[] args) {

        int[] a = getIntArray();    //Call method getIntArray
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        String[] b = getStringArray();  //Call method getStringArray
        for(int i=0; i<b.length; i++){
            System.out.println(b[i]);
        }
    }

    public static String[] getStringArray(){
        String[] colors = {"blue", "green", "yellow", "red"};
        return colors;
    }

    public static int[] getIntArray(){
        int[] numbers = {1, 4, 5, 6, 8};
        return numbers;
    }
}
