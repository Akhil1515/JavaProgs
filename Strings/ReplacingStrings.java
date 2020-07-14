package Strings;

import java.util.*;

public class ReplacingStrings {

	public static void main(String[] args) {
		String name = "PrapraPrapppra";
		
		String result = "";
		result = name.replaceAll("p", "Lp");
		String result1 = result.replaceAll("P", "LP");
		System.out.println("Replacing p and P to Lp and LP respectively..");
		System.out.println("Result: " + result1);
		System.out.println();
		
		
		String names = "HelloGoodMorning";
		String ans = "";
		ans = names.replaceAll("[aeiou]", "");
		System.out.println("Removing all vowels");
		System.out.println("Answer: " + ans);
		System.out.println();
		
		
		System.out.println("Using StringBuilder class to remove non-vowels");
		String phrase = "What a day!!";
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<phrase.length();i++) {
			if(phrase.charAt(i)!='a' && phrase.charAt(i)!='e' && phrase.charAt(i)!='i' && phrase.charAt(i)!='o' && phrase.charAt(i)!='u')
			{
				sb.append(phrase.charAt(i));
			}
		}
		String val = sb.toString();
		System.out.println("Phrase after removing non-vowels: " + val);
		
	}

}
