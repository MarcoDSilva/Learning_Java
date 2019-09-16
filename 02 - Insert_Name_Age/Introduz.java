/*
 * MIT - Free License
 */
package core;

import java.util.Scanner;

/**
 * @author O_Homem_Da_Banana
 */
public class Introduz {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Person person = new Person();
        Person person2 = new Person("Mariana", 25, "1985-03-12", "Lisboa", "Solteirona");

        System.out.print("Insert your name: ");
        String name = reader.nextLine();

        System.out.print("Insert your age: ");
        int age = Integer.parseInt(reader.nextLine());

        System.out.print("Born in the date of (yyyy-mm-dd):  ");
        String born = reader.nextLine();

        System.out.print("and in this place: ");
        String place = reader.nextLine();

        System.out.print("And your civil state is : ");
        String state = reader.nextLine();

        person.setName(name);
        person.setAge(age);

        person.setBorn_year(born);
        person.setNaturality(place);
        person.setCivil_state(state);

        System.out.println(person.toString());
        System.out.println(person2.toString());
    }
}
