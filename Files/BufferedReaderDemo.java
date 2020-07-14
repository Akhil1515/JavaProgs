package Files;
import java.io.*;

public class BufferedReaderDemo {

	
	BufferedReaderDemo(){
		try {
			File f = new File("prog1.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String str = br.readLine();
			while(str!=null) {
				System.out.println(str);
				str = br.readLine();
			}
			
		}
		catch(Exception e) {
			System.out.println("Caught..");
		}
	}
	public static void main(String[] args) {
		new BufferedReaderDemo();
	}

}
