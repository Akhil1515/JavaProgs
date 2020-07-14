package Keywords;

class Student{
	String name;
	int roll;
	String city;
	String state;
	Student(String name, int roll, String city){
		this.name = name;  // 1. Refer to instance variables
		this.roll = roll;
		this.city = city;
	}
	
	Student(String name, int roll, String city, String state){
		this(name,roll,city);    // 2.Call current class constructor 
		this.state = state;
	}
	public void display() {
		System.out.println("Name: " + name + " Roll: "+ roll + " City: "+city + " State: "+state);
	}
	
	public void display2() {
		this.display();    // 3. Call current class method
		System.out.println("Hello");
	}
}




public class ThisKeywordDemo {

	public static void main(String[] args) {
		
		Student s = new Student("Bob",3,"Austin");
		s.display();
		
		Student s1 = new Student("Akhil",5,"Raleigh","NC");
		s1.display2();
		
		

	}

}
