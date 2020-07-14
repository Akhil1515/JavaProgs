package Files;
import java.io.*;


public class ObjectOutputStreamDemo {
	
	ObjectOutputStreamDemo(){
		try {
			FileOutputStream fos = new FileOutputStream("customer.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			Customer c = new Customer("akhil",101);
			oos.writeObject(c);
			System.out.println("Wrote object into Text file");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ObjectOutputStreamDemo();

	}

}
