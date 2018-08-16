package strings;

import java.util.Stack;
import java.util.StringTokenizer;
/* FaceBook group: Programming
 * GitHub : Java how to
 * Reversing words or all characters in a string with StringBuilder and with StringTokenizer 
 */
public class ReversingString {
	String text = "Java: is a computer-programming language concurrent, class-based, object-oriented";
	
	/*
	 * reversing a string from parameter list with StringBuilder. 
	 * easy and fast way to reverse a string
	 */
	private void demo1(String string) {
		// new String builder object with text as a string
		StringBuilder sb = new StringBuilder(string);
		//print original
		System.out.println(string);
		// print reverse
		System.out.println(sb.reverse());		
	}
	
	/*
	 * reversing a string from the parameter list using
	 * Stack, reading one char at a time, and reading backwards
	 */
	private void demo2(String string) {
		// a collection of objects (characters). 
		// collection without defined size can dynamically expand 
		Stack<Character> charStack = new Stack<Character>();
		// print original string from parameter list
		System.out.println(string);
		// read one character at a time from string
		for(int i=0;i<string.length();i++) {
			// add character with index i to the TOP of the stack collection
			charStack.push(string.charAt(i));	
		}
		// read one character at a time from the stack BACKWARDS  
		for (int i =charStack.size()-1; i >=0 ; i--) {
			// print character with index i from the stack collection
			System.out.print(charStack.get(i));
		}
		
	}
	
	/*
	 * reversing a string from the parameter list by WORD
	 * using Stack, and StringTokenizer
	 */
	private void demo3(String string) {
		//collection of Strings. collection can expand and
		// is defined without size
		Stack<String> stringStack = new Stack<String>();
		// string tokenizer of string from parameter list splits text in to words
		//StringTokenizer(text, delimiters, show delimiters as words)
		StringTokenizer st = new StringTokenizer(string,",;-.:<>()",true);
		// print original text
		System.out.println(string);
		// while more words in string Stringtokenizer
		while(st.hasMoreTokens()) {
			// add next word from StringTokenizer to the TOP of the stack collection
			stringStack.push(st.nextToken());
		}
		// while Stack collection is not empty
		while(!stringStack.empty()) {
			// print out and remove a word from the TOP of stack collection
			System.out.print(stringStack.pop());
		}
	
	}
	
	
	
	
	
	private void demos() {
		//demo1(text);
		//demo2(text);
		//demo3(text);
	}
	
	public static void main(String[] args) {
		ReversingString rs = new ReversingString();
		rs.demos();
	}
	
}
