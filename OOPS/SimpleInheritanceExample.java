package OOPS;
class Person{
	String name;
	Person(String name){
		this.name = name;
	}
	public void habits() {
		System.out.println("Eat and sleep");
	}
}

class Student extends Person{
	Student(String name){
		super(name);
	}
	public void print() {
		System.out.println("His name is: " + name);
	}
	public void habits() {
		System.out.println("Eat and sleep and study");
	}
}

class Teacher extends Person{
	int class1;
	Teacher(String name, int class1){
		super(name);
		this.class1 = class1;
	}
	
	public void print() {
		System.out.println("Name: "+name+" Grade: "+class1);
	}
	public void habits() {
		System.out.println("Eat and sleep and teach");
	}
}

class SubTeacher extends Teacher{
	String entry;
	SubTeacher(String name, int class1, String entry){
		super(name,class1);
		this.entry = entry;
	}
	
	public void print() {
		System.out.println("Name: "+name+" Grade: "+class1+" Entry: "+entry);
	}
	
	public void habits() {
		System.out.println("Eat and sleep and teach");
	}
}


public class SimpleInheritanceExample {

	public static void main(String[] args) {
		Student s = new Student("Akhil");
		s.print();
		s.habits();
		
		Teacher t = new Teacher("Roy",8);
		t.print();
		t.habits();
		
		SubTeacher st = new SubTeacher("Adam",4,"ExaminationTest");
		st.print();
		st.habits();
	}

}
