package Strings;

public class StringContains {

	public static void main(String[] args) {
		String first = "pranita";
		String second = "pfggprghranitajhtdfa";
		int i=0,j=0;
		while(j<second.length() && i<first.length()) {
			if(first.charAt(i)==second.charAt(j)) {
				i++;
			}
			j++;
		}
		if(i==first.length()) System.out.println("Found");
		else System.out.println("Not found");

	}

}
