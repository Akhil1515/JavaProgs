package OOPS;

class First{
	public void display(int x) {
		System.out.println("Hello everyone " + x);
	}
}


class Second extends First{
	public void display(int x) {
		System.out.println("Hii everyone " + x);
	}
}




public class OverridingDemo {

	public static void main(String[] args) {
		
		First obj1 = new First();
		obj1.display(7);
		
		Second obj2 = new Second();
		obj2.display(9);
	}

}
