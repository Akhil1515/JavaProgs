package OOPS;
abstract class Employee{
	int a = 5;
	abstract void printName();
	abstract void calSalary();
	public void displaymsg() {
		System.out.println("Good morning everyone");
	}
}

class Manager extends Employee{
	public void printName() {
		System.out.println("George");
	}
	public void calSalary() {
		System.out.println("40000$");
	}
	public void displaymsg() {
		System.out.println("Hello");
	}
}

class Supervisor extends Employee{
	public void printName() {
		System.out.println("Roy");
	}
	public void calSalary() {
		System.out.println("50000$");
	}
}

class JuniorDev extends Supervisor{
	public void printName() {
		System.out.println("David");
	}
	public void calSalary() {
		System.out.println("25000$");
	}
}


public class AbstractDemo {

	public static void main(String[] args) {
		
		Manager m1 = new Manager();
		m1.displaymsg();
		m1.printName();
		m1.calSalary();
		System.out.println("Value of a is: " + m1.a);
	}

}
