package DataStructures;


import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(19);
		v.addElement(27);
		v.add(85);
		v.add(101);
		
		v.insertElementAt(8,2);
		
		for(int i=0;i<v.size();i++) {
			System.out.print(v.get(i) + " ");
		}
//		System.out.println(v);
		System.out.println();
		System.out.println("Contains 85: " + v.contains(85));
		System.out.println("First element: " + v.firstElement());
		System.out.println("Last element: " + v.lastElement());
		System.out.println("3rd index element: " + v.get(3));
		
		System.out.println("Size: " + v.size());
		System.out.println("Index of 101 is: " + v.indexOf(101));
		
		v.add(107);
		System.out.println("After adding new element: " + v);
		v.remove(3);
		System.out.println("After removing: " +v);
		
		v.clear();
		System.out.println(v);
	}

}
