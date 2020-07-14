package DataStructures;


import java.util.*;


public class SetDemo {

	public static void main(String[] args) {
		
		Set<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(17);
		hs.add(85);
		hs.add(6);
		hs.add(17);
		hs.add(25);
		
		Iterator<Integer> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
