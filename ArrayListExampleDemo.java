import java.util.*;


public class ArrayListExampleDemo {
	public static void main(String[] args) {
		
		ArrayList<String> arr1 = new ArrayList<String>(Arrays.asList("apple","mango","orange","anything"));
		ArrayList<String> arr2 = new ArrayList<String>(Arrays.asList("banana","anything","kiwi"));
		arr1.addAll(arr2); // merging arr1 and arr2 into arr1
		//ArrayList<String> input1 = new ArrayList<String>(Arrays.asList("apple","mango","orange","banana","banana","grapes","kiwi"));
		ArrayList<String> input1 = new ArrayList<String>(Arrays.asList("apple","mango","orange","kiwi","banana","grapes","kiwi"));
		
		int print1 = 0;
		if(arr1.size()!=input1.size()) print1=5;
		else {
			for(int i=0;i<arr1.size();i++) {
				if(!arr1.get(i).equals("anything")) {
					if(!arr1.get(i).equals(input1.get(i))) {
						print1=5;
						break;
					}
				}
			}
			
		}
		
		if(print1==5) System.out.println("False - Not equal");
		else System.out.println("True - Equal");
	}
}
