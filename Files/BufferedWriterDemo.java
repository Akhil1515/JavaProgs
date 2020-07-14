package Files;
import java.io.*;


public class BufferedWriterDemo {

	
	BufferedWriterDemo(){
		try {
		File f = new File("prog1.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i=1;i<10;i++) {
			bw.write("Hi " + i + "\n");
		}
		
		bw.flush();
		}
		catch(Exception e) {
			System.out.println("Caught...");
		}
		System.out.println("Successfully created and wrote text to the file..");
	}
	public static void main(String[] args) {
		new BufferedWriterDemo();

	}

}
