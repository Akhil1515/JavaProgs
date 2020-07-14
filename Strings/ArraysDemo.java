package Strings;

public class ArraysDemo {

	public static int cal(int[] arr) {
		int prod = 1;
		for(int i=0;i<arr.length;i++) {
			prod*=arr[i];
		}
		System.out.println("Prod: " + prod);
		return prod%100;
	}
	
	public static void main(String[] args) {
		int[] arr = {17,14,8,3,2};
		System.out.println(cal(arr));

	}

}
