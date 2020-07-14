package Threads;

class MyThread11 extends Thread{
	public void run() {
		String name = Thread.currentThread().getName();
		if(name.equals("first")) odd();
		else even();
	}
	
	public static synchronized void odd() {
		String s = Thread.currentThread().getName();
		for(int i=1;i<50;i+=2) {
			System.out.println("U1: " + i);
		}
		
	}
	
	public static synchronized void even() {
		String s = Thread.currentThread().getName();
		for(int i=0;i<50;i+=2) {
			System.out.println("U2: " + i);
		}
		
	}
}




public class ThreadExtendsDemo2 {

	public static void main(String[] args) {
		
		MyThread11 t1 = new MyThread11();
		t1.setName("first");
		MyThread11 t2 = new MyThread11();
		t2.setName("second");
		t1.start();
		t2.start();
	}

}
