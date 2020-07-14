package DesignPatterns;

class Singleton{
	
	private static Singleton obj;
	int val;
	
	private Singleton(int val) {
		this.val = val;
	}
	
	public static Singleton getInstance(int val) {
		if(obj==null) obj = new Singleton(val);
		return obj;
	}
}


// RULES FOR SINGLETON DESIGN PATTERN:
// 1. Create a private constructor
// 2. Create an object of class type which is static and private
// 3. Create a method which is public and static


public class SingletonEx1 {

	public static void main(String[] args) {
		

		Singleton a = Singleton.getInstance(100);
		Singleton b = Singleton.getInstance(200);
		System.out.println("A value:" + a.val);
		System.out.println("B value:" + b.val);
		
	}

}
