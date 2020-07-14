package Threads;

class ThreadsAll implements Runnable{
	public void run() {
		String name = Thread.currentThread().getName();
		if(name.equals("firstthread")) m1();
		else m2();
	}
	
	public static void m1() {
		String s = Thread.currentThread().getName();
		System.out.println("M1: " + s);
	}
	
	public static void m2() {
		String s = Thread.currentThread().getName();
		System.out.println("M2: " + s);
	}
}



public class RunnableDemo {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		ThreadsAll obj = new ThreadsAll();
		Thread t1 = new Thread(obj,"firstthread");
		t1.start();
		Thread t2 = new Thread(obj,"secondthread");
		t2.start();

	}

}
