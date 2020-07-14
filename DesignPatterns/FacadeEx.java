package DesignPatterns;

interface Shape{
	public void draw();
}

class Circle implements Shape{
	public void draw() {
		System.out.println("Drawing Circle..");
	}
}

class Triangle implements Shape{
	public void draw() {
		System.out.println("Drawing Triangle..");
	}
}

class Square implements Shape{
	public void draw() {
		System.out.println("Drawing Square..");
	}
}

class FacadeClass{
	private Shape circle;
	private Shape tri;
	private Shape square;
	
	FacadeClass(){
		circle = new Circle();
		tri = new Triangle();
		square = new Square();
	}
	
	public void drawC() {
		circle.draw();
	}
	
	public void drawT() {
		tri.draw();
	}
	
	public void drawS() {
		square.draw();
	}
}


public class FacadeEx {

	public static void main(String[] args) {
		FacadeClass obj = new FacadeClass();
		obj.drawC();
		obj.drawS();
		obj.drawT();

	}

}
