package Files;
import java.io.*;


public class FileReaderDemo {

	
	FileReaderDemo(){
		try {
		File f = new File("akhil.txt");
		FileReader fr = new FileReader(f);
		int x = fr.read();
		while(x!=-1) {
			System.out.print((char) x);
			x=fr.read();
		}
		}
		catch(Exception e) {
			System.out.println("Caught");
		}
		
	}
	public static void main(String[] args) {
		
		new FileReaderDemo();
	}

}
