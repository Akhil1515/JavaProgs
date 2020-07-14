package Exceptions;

class InsufficientFunds extends Exception{
	public String getMessage() {
		return "Low balance";
	}
}


class Account{
	int accno;
	String name;
	int bal;
	Account(int accno, String name){
		this.accno = accno;
		this.name = name;
		bal = 10000;
	}
	
	public void withdraw(int amt) throws Exception{
		if(bal-amt<5000) {
			InsufficientFunds ifs = new InsufficientFunds();
			throw ifs;
		}
		else {
			bal=bal-amt;
		}
	}
	
	public void display() {
		System.out.println("Accno: " + accno + " Name: " + name + " Balance: " + bal);
	}
}


public class UserDefinedExceptionDemo {

	public static void main(String[] args) {
		
		Account a = new Account(123,"Akhil");
		try {
		a.withdraw(7000);
		a.display();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
