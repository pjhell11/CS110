package chap9;

public class MyString1 {
	
	private char[] chars;

	public MyString1(char[] chars) {
		this.chars = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			this.chars[i] = chars[i];
		}
	}
	
	public char charAt(int index) {
		return chars[index];
	}
	
	public int length() {
		return chars.length;	
	}
	
	public MyString1 substring(int begin, int end) {
		int length = end - begin;
		char[] sub = new char[length];
		for (int i = 0; i < length; i++) {
			sub[i] = chars[begin + i];
		}
		return new MyString1(sub);
	}
	
	public MyString1 toLowerCase() {
		int length = chars.length;
		char[] lower = new char[length];
		for (int i = 0; i < length; i++) {
			lower[i] = Character.toLowerCase(chars[i]);
		}
		return new MyString1(lower);
	}
	
	public boolean equals(MyString1 s) {
		boolean equal = true;
		if (this == s){
			equal = true;
		}
		if (this.length() != s.length()) {
			equal = false;
		}
		for (int i = 0; i < length(); i++) {
			if (this.charAt(i) != s.charAt(i)) {
				equal = false;
			}
		}
		return equal;
		
	}
	
	//public static MyString1 ValueOf(int i) {
		//Will be asking about this in class on Tuesday morning.
	//}
}
