package Files;

import java.io.*;

public class Customer implements Serializable{

	String name;
	int number;
	
	Customer(String name, int number){
		this.name = name;
		this.number = number;
	}
}
