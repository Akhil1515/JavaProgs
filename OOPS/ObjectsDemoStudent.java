package OOPS;
class ObjectsStudent{
	String name;
	int roll;
	String tech;
	
	public void read(String name, int roll, String tech) {
		this.name = name;
		this.roll = roll;
		this.tech = tech;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
		System.out.println("Tech: "+tech);
		System.out.println();
	}
}




public class ObjectsDemoStudent {

	public static void main(String[] args) {
		
		ObjectsStudent s1 = new ObjectsStudent();
		s1.read("Akhil", 1, "Java");
		s1.display();
		
		ObjectsStudent s2 = new ObjectsStudent();
		s2.read("Vinay", 2, "AWS");
		s2.display();
		
		ObjectsStudent s3 = new ObjectsStudent();
		s3.read("Madhu", 3, "DevOps");
		s3.display();
	}

}
