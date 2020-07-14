package DataStructures;
import java.util.*;


public class HashMapDemo {

	public static void main(String[] args) {
		

		Map<String,Integer> hm = new HashMap<>();
		
		hm.put("Tesla",100000);
		hm.put("Ford",30000);
		hm.put("BMW",70000);
		hm.put("Audi",60000);
		hm.put("Jeep",40000);
		
		System.out.println(hm);
		
		Set<String> set = hm.keySet();
		System.out.println(set);
		
		Collection<Integer> coll = hm.values();
		System.out.println(coll);
		
		for(Map.Entry<String, Integer> entry: hm.entrySet()) {
			if(entry.getValue()<70000) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}
		System.out.println();
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(5,1,6,1,1,4,7,5,1,6));
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i:arr) {
			if(!map.containsKey(i)) map.put(i,1);
			else map.put(i,map.get(i)+1);
		}
		
		for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
			System.out.println("Number: " + entry.getKey() + " Value: " + entry.getValue());
		}
		
		
		
	}

}
