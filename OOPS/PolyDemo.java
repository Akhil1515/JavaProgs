package OOPS;

class A{
	public void meth1() {
		System.out.println("Inside meth1 of A");
	}
	
}

class B extends A{
	public void meth1() {
		System.out.println("Inside meth1 of B");
	}
	
	public void meth2() {
		System.out.println("Inside meth2 of A");
	}
}



public class PolyDemo {

	public static void main(String[] args) {
		
		A obj = new B();
		obj.meth1();
		

	}

}
