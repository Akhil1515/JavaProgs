package Java8Features;


interface shape{
	// void draw();
	 int add(int a, int b);
}


public class java8features{
	
	
//	shape s = () -> {
//		System.out.println("Drawing method");
//	};
	
	public static void main(String[] args) {
		shape s = (a,b) -> a+b;
		new Thread(()-> {
			System.out.println("Thread is running .. good");
		}).start();
		
		System.out.println();
		System.out.println("sum of two numbers is: " + s.add(4,8));

	}

}
