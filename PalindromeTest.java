import java.util.*;


public class PalindromeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.next();
		int k=0;
		int p=0;
		if(palin(s)) System.out.println("Palindrome");
		else {
			for(int i=0;i<s.length();i++) {
				StringBuffer sb = new StringBuffer();
				if(i>0) sb.append(s.substring(0,i));
				sb.append(s.substring(i+1));
				if(palin(sb.toString())) {
					p=1;
					System.out.println("Original string is: "+s); 
					System.out.println(sb.toString() + " is a Palindrome after removing " + s.charAt(i) + " letter");
					break;
				}
				else {
					k=10;
				}
			}
		}
		if(p!=1 && k==10) System.out.println("Not a palindrome");

	}
	
	
	public static boolean palin(String str) {
		for(int i=0,j=str.length()-1;i<str.length()/2;i++,j--) {
			if(str.charAt(i)!=str.charAt(j)) return false;
		}
		return true;
	}

}
