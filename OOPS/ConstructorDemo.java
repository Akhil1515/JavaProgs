package OOPS;
class Cons{
	int x;
	int y;
	Cons(){
		System.out.println("Default");
	}
	
	Cons(int x){
		this();
		System.out.println("One parameter: "+x);
	}
	
	Cons(int x, int y){
		this(x);
		System.out.println("Two parameters: " + x + " " + y);
	}
}





public class ConstructorDemo {

	public static void main(String[] args) {
		Cons c = new Cons(7,8);

	}

}
