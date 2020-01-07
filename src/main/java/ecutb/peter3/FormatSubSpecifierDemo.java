package ecutb.peter3;
//https://www.youtube.com/watch?v=CpHEPf0kVjA&list=PLQXo9104N61G_Suw1n0Jjg1VrBFvYBZMg&index=4
public class FormatSubSpecifierDemo {

    public static void main(String[] args) {

        String item1 = "pizza";
        int qty1 = 5;
        double price1 = 9.25;

        String item2 = "soda";
        int qty2 = 10;
        double price2 = 12.99;

        String item3 = "chips";
        int qty3 = 200;
        double price3 = 134;

        System.out.printf("Item\tQty\t\tPrice%n");      // \t = Tab
        System.out.printf("------  ---     ------%n");
        System.out.printf("%-7s %-5d $%7.2f%n", item1, qty1, price1);
        System.out.printf("%-7s %-5d $%7.2f%n", item2, qty2, price2);
        System.out.printf("%-7s %-5d $%7.2f%n", item3, qty3, price3);

    }
}
