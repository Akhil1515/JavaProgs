package Keywords;

class Person{
	
	String name;
	public void read(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Name: " + name);
	}
}


class Stud extends Person{
	String desig;
	public void read(String name, String desig) {
		super.name = name;  // 1. refer to parent class variable
		this.desig = desig;
	}
	public void display() {
		super.display();   // 2. refer to parent class method
		System.out.println("Name: " + super.name + " Desig: " + desig);
	}
}

class Teacher extends Person{
	String desig;
	public void read(String desig) {
		this.desig = desig;
	}
	
	public void display() {
		System.out.println("Name: " + super.name + " Desig: " + desig);
	}
}

public class SuperKeywordDemo {

	public static void main(String[] args) {
		
		Person obj = new Person();
		obj.read("Akhil");
		obj.display();
		System.out.println();
		Stud s = new Stud();
		s.read("Bitra","Student");
		s.display();
		
	}

}
