package contact;

import sun.tools.java.Scanner;

/**
 * Created by guodont on 15/12/17.
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal(12);
        Animal animal3 = new Animal(12,14);
        Animal animal4 = new Animal("hello4",0,14);
        Animal animal5 = new Animal("hello5",12);
        Animal animal6 = new Animal("hello6");
        System.out.println(animal4.getName());
        animal1.setName("hello1");
        System.out.println(animal1.getName());
    }
}
