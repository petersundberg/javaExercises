package ecutb.peter2;
//https://www.youtube.com/watch?v=SE5Oc89JumQ&list=PLQXo9104N61GgQJlO7qqQudgvCgh1YX4o&index=11
public class CompareArrayDemo {

    public static void main(String[] args) {

        int[] first = {2, 4, 6, 8, 10};
        int[] second = {2, 4, 6, 8, 10};

        if (equals(first, second))
            System.out.println("Same array");
        else
            System.out.println("Different array");
    }
    public static boolean equals(int[] a, int[] b){
        if(a.length != b.length)
            return false;

        for(int i =0; i<a.length; i++){
            if(a[i] != b[i])
                return false;
        }
        return true;
    }
}
