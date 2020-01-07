package ecutb.peter2;
//https://www.youtube.com/watch?v=ryv-6rxqUgE&list=PLQXo9104N61GgQJlO7qqQudgvCgh1YX4o&index=12
public class SequentialSearchDemo {

    public static void main(String[] args) {

                //     0   1   2   3   4  5    6   7   8
        int[] array = {45, 67, 23, 50, 1, 505, 54, 40, 90};
        int searchKey = 24;
        //System.out.println(search(array, searchKey));
        int index = search(array, searchKey);

        if(index > -1)
            System.out.println("Item found at index: " + index);
        else
            System.out.println("Item not found");
    }

    public static int search(int[] x, int key){
        for(int i=0; i<x.length; i++){
            if(x[i] == key)
                return i;
        }
        return -1;
    }
}
