package OOPS;


class OverLoading{
	public void sum(int x, int y) {
		System.out.println("Sum is: "+(x+y));
	}
	
	public void sum(double x, double y) {
		System.out.println("Sum is: "+(x+y));
	}
	
	public void sum(int x, int y, int z) {
		System.out.println("Sum is: "+(x+y+z));
	}
	
}




public class OverloadingDemo {

	public static void main(String[] args) {
		OverLoading obj1 = new OverLoading();
		obj1.sum(5, 9);
		
		OverLoading obj2 = new OverLoading();
		obj2.sum(5.8, 9.64);
		
		OverLoading obj3 = new OverLoading();
		obj3.sum(5, 9, 7);

	}

}
