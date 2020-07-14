package OOPS;
import java.util.*;


interface AdvancedArithmetic{
	int divisor_sum(int n);
}



public class MyCalculator implements AdvancedArithmetic {

	public int divisor_sum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println();
		System.out.println("I implemented: AdvancedArithmetic");
		MyCalculator cal = new MyCalculator();
		System.out.println(cal.divisor_sum(n));
	}

}
