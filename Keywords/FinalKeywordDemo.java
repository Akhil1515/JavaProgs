package Keywords;

final class Info{   // 3. Class cannot be inherited
	final int ssn;  // 1. Declare constant variable
	Info(){
		ssn = 12345;
	}
	
	final void display() {    // 2. Method cannot override this method
		System.out.println("SSN: " + ssn);
	}
	
	
}



public class FinalKeywordDemo {

	public static void main(String[] args) {
		Info i = new Info();
		i.display();

	}

}
