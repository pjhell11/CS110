package chap9;

import java.util.Scanner;

public class PE912 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two strings to check if they are anagrams. ");
		String string1 = s.next();
		String string2 = s.next();
		string1 = string1.toLowerCase();
		string2 = string2.toLowerCase();
		
		if (isAnagram(string1, string2) == true) {
			System.out.println("The strings are anagrams.");
		}
		
		if (isAnagram(string1, string2) == false) {
			System.out.println("The strings are not anagrams.");
		}
	}
	
	public static boolean isAnagram(String s1, String s2) {
		boolean anagram = false;
		char[] s1arr = new char[s1.length()];
		char[] s2arr = new char[s2.length()];
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				s1arr[i] = s1.charAt(i);
				s2arr[i] = s2.charAt(i);
			}
			java.util.Arrays.sort(s1arr);
			java.util.Arrays.sort(s2arr);
			if (java.util.Arrays.equals(s1arr, s2arr) == true) {
				anagram = true;
			}
		}
		return anagram;
		
	}

}
