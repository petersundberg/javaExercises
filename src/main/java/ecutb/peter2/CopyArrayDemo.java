package ecutb.peter2;
//https://www.youtube.com/watch?v=6uemeqwFNeQ&list=PLQXo9104N61GgQJlO7qqQudgvCgh1YX4o&index=5
public class CopyArrayDemo {

    public static void main(String[] args) {

        int[] x = {0, 1, 2, 3};

//        int[] y = new int[4];
//        for(int i =0; i<x.length; i++){
//            y[i] = x[i];
//        }
//        for(int i =0; i<y.length; i++){
//            System.out.println(y[i]);
//        }

        int[] y = x.clone();    //clone array x to a new array, named y (now there are 2 different arrays)
        x[0] = 5000;

        for (int i=0; i<y.length; i++){
            System.out.println(y[i]);
        }

        for (int i=0; i<x.length; i++){
            System.out.println(x[i]);
        }

    }
}
