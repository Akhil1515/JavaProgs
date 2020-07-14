package DataStructures;

import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(7);
		st.push(4);
		st.push(18);
		st.push(new Integer(100));
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}

	}

}
