package ecutb.peter;
//https://www.youtube.com/watch?v=_GqgDq1pSHI&list=PLQXo9104N61GapjToZ6FRCGt7dRoh8JtO&index=12
public class EnumDemo {

    public enum Light { GREEN, YELLOW, RED }

    public static void main(String[] args) {

        Light trafficLight = Light.YELLOW;

        //System.out.println(trafficLight);

        if(trafficLight == Light.GREEN)
            System.out.println("Go");
        else if(trafficLight == Light.YELLOW)
                System.out.println("Slow down");
        else
            System.out.println("Stop!");
    }
}
