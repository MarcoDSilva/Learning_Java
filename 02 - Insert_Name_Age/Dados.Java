
public class Dados {

	private String name;
	private int age;


	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public String toString() {
		return "your name is " + this.name + " and you are " + this.age + " years old";
	}

}