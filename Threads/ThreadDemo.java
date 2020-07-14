package Threads;

public class ThreadDemo {

	public static void m1() {
		String s1 = Thread.currentThread().getName();
		System.out.println("m1" + s1);
	}
	
	public static void m2() {
		String s2 = Thread.currentThread().getName();
		System.out.println("m2" + s2);
	}
	
	
	public static void main(String[] args) {
		
		String s3 = Thread.currentThread().getName();
		System.out.println("main" + s3);
		m1();
		m2();

	}

}
