package OOPS;

class Shape{
	public void display() {
		System.out.println("I am a shape");
	}
}

class Circle extends Shape{
	public void display() {
		System.out.println("I am a circle");
	}
}

class Triangle extends Shape{
	public void display() {
		System.out.println("I am a Triangle");
	}
}

class Square extends Shape{
	public void display() {
		System.out.println("I am a square");
	}
}




public class PolyDemoExample {

	public static void main(String[] args) {
		
		Shape obj;
		obj = new Circle();
		obj.display();
		
		obj = new Triangle();
		obj.display();
		
		obj = new Square();
		obj.display();

	}

}
