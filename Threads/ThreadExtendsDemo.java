package Threads;

class MyThread extends Thread{
	public void run() {
		String name = Thread.currentThread().getName();
		if(name.equals("first")) m1();
		else m2();
		
	}
	
	public static void m1() {
		String s = Thread.currentThread().getName();
		System.out.println("m1: " + s);
		try {
		Thread.sleep(5000);
		}
		catch(InterruptedException ie) {
			System.out.println("Caught");
		}
		System.out.println("Waited for some time..");
	}
	
	public static void m2() {
		String s = Thread.currentThread().getName();
		System.out.println("m2: " + s);
	}
}




public class ThreadExtendsDemo {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		t1.setName("first");
		t1.start();
		
		MyThread t2 = new MyThread();
		t2.setName("second");
		t2.start();

	}

}
