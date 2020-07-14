package Files;
import java.io.*;


public class ObjectInputStreamDemo {
	
	ObjectInputStreamDemo(){
		try {
			FileInputStream fis = new FileInputStream("customer.txt");
			ObjectInputStream oos = new ObjectInputStream(fis);
			
			Customer c = (Customer) oos.readObject();
			System.out.println("Name: " + c.name);
			System.out.println("Number: " + c.number);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ObjectInputStreamDemo();

	}

}
