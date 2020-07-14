package Files;

import java.io.*;


public class FileWriterDemo {

	FileWriterDemo(){
	
		try {
		File f = new File("akhil.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("This is a java program written by Akhil Bitra");
		fw.flush();
		fw.close();
		System.out.println("Created and wrote to a file");
		}
		catch(Exception e) {
			System.out.println("Caught");
		}
	}
	
	
	public static void main(String[] args) {
		
		new FileWriterDemo();

	}

}
