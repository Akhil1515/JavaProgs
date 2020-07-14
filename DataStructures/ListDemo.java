package DataStructures;

import java.util.*;


public class ListDemo {

	public static void main(String[] args) {
		
		List<String> arr = new ArrayList<String>();
		arr.add("Apple");
		arr.add("Samsung");
		arr.add("Jio");
		arr.add("Nokia");
		arr.add("Jio");
		System.out.println(arr);
		
		List<String> list1 = new LinkedList<String>();
		list1.add("Audi");
		list1.add("BMW");
		list1.add("Tesla");
		list1.add("Ford");
		list1.add("Jeep");
		System.out.println(list1);
		
		
		System.out.println("Arr contains Mi: " + arr.contains("Mi"));
		System.out.println("Get element at index 3: " + arr.get(3));

	}

}
