import java.util.Scanner;

public class Introduz {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Dados person = new Dados();

		System.out.print("Insert your name: ");
		String name = reader.nextLine();

		System.out.print("Insert your age: ");
		int age = Integer.parseInt(reader.nextLine());

		person.setName(name);
		person.setAge(age);

		System.out.println(person.toString());
	}
}
