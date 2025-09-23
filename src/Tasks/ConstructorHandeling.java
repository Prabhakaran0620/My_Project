package Tasks;

public class ConstructorHandeling {

	String name;
	int Age;

//	Default Contructor
	public ConstructorHandeling() {
		name = "Unknown";
		Age = 0;
		System.out.println("Default Constructor calling");

	}

//	Parameterised Constructor
	public ConstructorHandeling(String studentName, int studentAge) {
		name = studentName;
		Age = studentAge;
		System.out.println("Parameterised Constructor calling");

	}

	public void display() {
		System.out.println(" Name : " + name + "," + " Age : " + Age);
	}

	public static void main(String[] args) {

		ConstructorHandeling obj = new ConstructorHandeling();
		obj.display();

		ConstructorHandeling obj1 = new ConstructorHandeling("Prabha", 25);
		obj1.display();

	}

}
