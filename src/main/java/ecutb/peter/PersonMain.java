package ecutb.peter;

public class PersonMain {

    public static void main(String[] args) {


        Person peter = new Person("Peter Sundberg",51, 183, 90);

        System.out.println("Peter är " + peter.getLength() + " cm lång.");
        peter.talk();
        peter.setSleeping(true);

        System.out.println(peter.getName() + " is " + peter.getLength() + " cm tall." +
                "He is " + peter.getAge() + " years old and weighs " + peter.getWeight() + "." + "Peter is " +
                peter.isSleeping());

    }
}
