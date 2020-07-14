package Java8Features;

import java.util.*;
import java.util.stream.Collectors;

public class StreamingAPIDemo {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Akhil","Arun","Roy","Raj","Sreekar","Tej","Utsav"));
		System.out.println(names.stream().filter(a -> a.startsWith("R")).collect(Collectors.toList()));
		System.out.println(names.stream().map(a -> a.toUpperCase()).collect(Collectors.toList()));
		System.out.println(names.stream().reduce((w1, w2)->w1+"-"+w2));
		System.out.println(names.stream().reduce((w1,w2)->w1.length()>w2.length()?w1:w2));
		boolean b = names.stream().anyMatch(a->a.endsWith("j"));
		System.out.println("Ending with j: " + b);
		System.out.println();
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,3,29,16,11,6,8,13,40));
		System.out.println("Numbers are: " + numbers);
		System.out.println("Numbers greater than 10: " + numbers.stream().filter(a -> a>10).collect(Collectors.toList()));
		System.out.println("Squaring every number: " + numbers.stream().map(a-> a*a).collect(Collectors.toList()));
		System.out.println("Max: " + numbers.stream().max((i1,i2)->Integer.compare(i1, i2)));
		System.out.println("Min: " + numbers.stream().min((i1,i2)->Integer.compare(i1, i2)));
		System.out.println("Average: " + numbers.stream().mapToInt(i->i).average());
		System.out.println("Sum: " + numbers.stream().mapToInt(i->i).sum());
		System.out.println("Count for numbers > 11: " + numbers.stream().filter(a->a>11).count());
		System.out.println("Limiting to first three"+ numbers.stream().limit(3).collect(Collectors.toList()));
		System.out.println("Skipping first two"+ numbers.stream().skip(2).collect(Collectors.toList()));
		System.out.println("Sorting: " + numbers.stream().sorted().collect(Collectors.toList()));
		

	}

}
