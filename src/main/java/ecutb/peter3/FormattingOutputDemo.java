package ecutb.peter3;
//https://www.youtube.com/watch?v=V8jLACwvCzs&list=PLQXo9104N61G_Suw1n0Jjg1VrBFvYBZMg&index=3

public class FormattingOutputDemo {

    public static void main(String[] args) {

        String name = "Bob";
        int age = 20;
        double weight = 184.5;
        char initial = 'B';
        int examScore = 100;

        System.out.println(name + " is " + age + " years old and weighs " + weight);
        System.out.printf("%s is %d years old and weighs %.2f%n", name, age, weight);

        System.out.printf("%s's initial is %c and he got %d%% on his exam", name, initial, examScore);

    }
}
