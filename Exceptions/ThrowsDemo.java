package Exceptions;

public class ThrowsDemo {

	public static void main(String[] args) {
		m1();

	}
	
	public static void m1() {
		try {
		m2();
		}
		catch(Exception e) {
			System.out.println("Caught here... ");
		}
	}
	
	public static void m2() throws Exception{
		m3();
	}
	
	public static void m3() throws Exception{
		int k = 7/0;
	}

}
