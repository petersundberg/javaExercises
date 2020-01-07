package ecutb.peter2;
//https://www.youtube.com/watch?v=_XnTiAlw8Oo&list=PLQXo9104N61FrXvyst6V7V-o4i_cUPl7U&index=12
public class WrapperDemo {

    public static void main(String[] args) {

        String  name = "james";
        name = name.toUpperCase();
        System.out.println(name);

        //print max value out of 2 values:
        System.out.println(Integer.max(10, 15));

        //String to integer:
        String  numString = "5";
        int num = Integer.parseInt(numString);
        num++;
        System.out.println(num);

        //String to double:
        String doubleString = "5.95";
        double num2 = Double.parseDouble(doubleString);
        num2++;
        System.out.println(num2);

        char someChar = 'a';
        System.out.println(Character.isDigit(someChar));
        System.out.println(Character.isLetter(someChar));
        System.out.println(Character.toUpperCase(someChar));

        System.out.println(Character.hashCode(someChar));
        System.out.println(Character.getName(someChar));
        System.out.println(Character.isLetterOrDigit(someChar));
        System.out.println(Character.getType(someChar));
        System.out.println("toString: " + Character.toString(someChar));
        System.out.println(Character.isAlphabetic(someChar));



    }
}
