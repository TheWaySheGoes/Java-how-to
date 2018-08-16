package strings;

/* FaceBook group: Programming
 * GitHub : Java how to
 * Building strings from other strings
 * Adding strings together with StringBuilder
 * Adding comma between string values
 */
public class StringBuilderDemo {

	/*
	 * appending string to the end of another string
	 */
	private void demo1() {
		// create a StringBuilder
		StringBuilder sb = new StringBuilder();
		// add a string to a StringBuilder
		sb.append("one ");
		sb.append("two ");
		sb.append("three ");
		// print out StringBuilder
		System.out.println(sb);
	}

	/*
	 * Similar to demo1() but with method chaining
	 */
	private void demo2() {
		// create a StringBuilder
		StringBuilder sb = new StringBuilder();
		// add a strings to a StringBuilder
		sb.append("one ").append("two ").append("three ");
		// print out StringBuilder
		System.out.println(sb);

	}

	/*
	 * Manipulating string in a StringBuilder
	 */
	private void demo3() {
		// create a StringBuilder with a string in a constructor
		StringBuilder sb = new StringBuilder("aaaaaaaaaaaaaaaaaaaaaaa");
		// print out StringBuilder
		System.out.println("string: 		      "+sb);
		
		// insert(index, int/char/String...)  insert something at index 
		// index must be between 0 and string length
		sb.insert(1,"b"); // string index starts with 0
		// print out StringBuilder
		System.out.println("insert b at index 1: 	      "+sb);
		
		// replace(start index, end index, int/char/String...) replaces 
		// string values between start index and end index. end index not included
		// if replace string to long StringBuilder stretches it self
		sb.replace(2, 4, "ccc");	// replaces index 2 and 3. 4 not included 
		// print out StringBuilder
		System.out.println("replace from 2 to 3 with ccc: "+sb);
		
		// reverse(), reverses the StringBuilder values
		sb.reverse();
		// print out StringBuilder
		System.out.println("reverse the string: 	      "+sb);
		
		// deleteCharAt(index) deletes a character in StringBuilder on the given index
		// index starts from 0
		sb.deleteCharAt(24);
		// print out StringBuilder
		System.out.println("del char at index 24:         "+sb);
		
		// delete() Deletes the string values between start index and end index
		// end index not included 
		sb.delete(20, 24); // deletes string on index from 20 to 23. 24 not included
		// print out StringBuilder
		System.out.println("del string from 20 to 23:     "+sb);

	}

	/*
	 * Append comma after every value.
	 * Modifying an array of values in to a string 
	 * works with collections also 
	 */
	private void demo4() {
		//array of string values
		String[] stringArray = {"dog","cat","cow","duck"};
		
		//example without comma 
		StringBuilder sb = new StringBuilder();
		//for every value str in stringArray, append that value str to StringBuilder
		for(String str:stringArray) {
			sb.append(str);	
		}
		System.out.print("without comma: "+sb);
		
		//new line 
		System.out.print("\n");
		
		//example with comma
		StringBuilder sb1 = new StringBuilder();
		//for every value str1 in stringArray, append that value str1 to StringBuilder
		//if a some value already exist in StringBuilder append comma
		for(String str1:stringArray) {
			if(sb1.length()>0) {
				sb1.append(", ");
			}
			sb1.append(str1);
		}
		System.out.print("with comma:    "+sb1);
		
		
	}
	
	/*
	 * to start all of the demos
	 */
	private void demos() {
		demo1();
		//demo2();
		//demo3();
		//demo4();
	}

	public static void main(String[] args) {
		StringBuilderDemo sb = new StringBuilderDemo();
		sb.demos();
	}
}
