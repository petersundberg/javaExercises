package ecutb.peter;

public class Person {

    private String name;
    private int age;
    private double length;
    private double weight;
    private boolean sleeping;

    public Person(String name, int age, double length, double weight) {
        this.name = name;
        this.age = age;
        this.length = length;
        this.weight = weight;
        this.sleeping = sleeping;
        //getInfo();
    }

    //Metoder
    public void talk(){
        System.out.println(this.name + " is talking");
    }




    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", length=" + length +
                ", weight=" + weight +
                '}';
    }

    /*    public void getInfo(){
        getInfo();
    }*/


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isSleeping() {
        return sleeping;
    }
    public void setSleeping(boolean sleeping) {
        this.sleeping = sleeping;
    }
}






