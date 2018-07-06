package strings;

import java.util.ArrayList;
import java.util.StringTokenizer;

/* FaceBook group: Java how to
 * GitHub : Java how to
 * Breaking String in to words with StringTokenizer
 */
public class StringTokenizerDemo {
	String text = "Java: is a computer-programming language concurrent, class-based, object-oriented";

	/*
	 * Splitting string according to spaces in a string
	 */
	private void demo1() {
		System.out.println(text + "\n");
		System.out.println("***************StringTokenizer(String)*************************************\n");

		// StringTokenizer(String text)
		StringTokenizer st = new StringTokenizer(text);

		// hasMoreTokens(), nextToken()- value of a next word in string
		while (st.hasMoreTokens()) { // while more words present in string
			System.out.println(st.nextToken()); // print next word
		}
	}

	/*
	 * Splitting string according to defined delimiters in a string
	 */
	private void demo2() {
		System.out.println(text + "\n");
		System.out.println("***************StringTokenizer(String, delimiter)***************************\n");

		// StringTokenizer(String text, String delimiter)
		StringTokenizer st1 = new StringTokenizer(text, ",");

		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}

		System.out.println("*************StringTokenizer(String, delimiter)*****************************\n");

		StringTokenizer st2 = new StringTokenizer(text, ":-, ");

		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}
	
	/*
	 * Splitting string according to defined delimiters in a string
	 * and showing delimiters as values
	 */
	private void demo3() {
		System.out.println(text + "\n");
		System.out.println("****************StringTokenizer(String, delimiter, true)********************\n");

		// StringTokenizer(String text, String delimiter, boolean) bool can be true or
		// false
		// true = show delimiters
		StringTokenizer st3 = new StringTokenizer(text, ":-, ", true);

		while (st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
	}

	/*
	 * the same as demo3 but with values in the method parameter list
	 */
	private void demo4(String string, String delimiter, boolean showDelimiter) {
		System.out.println(text + "\n");
		System.out.println("****************StringTokenizer(String, delimiter)**from parameter**********\n");

		// StringTokenizer(String text, String delimiter, boolean) from parameter
		// true = show delimiters
		StringTokenizer st4 = new StringTokenizer(string, delimiter, showDelimiter);

		while (st4.hasMoreTokens()) {
			System.out.println(st4.nextToken());
		}
	}

	/*
	 * Checking if and what values exist between delimiters
	 * everything given in method parameter list.  
	 */
	private void demo5(String string, String delimiter, int numberOfValues) {
		String[] valuesArray = new String[numberOfValues]; // array for all parameter values
		System.out.println("****************StringTokenizer(String, delimiter)**doesn value exist?******\n");

		// StringTokenizer(String text, String delimiter, boolean) from parameter
		// true = show delimiters
		StringTokenizer st5 = new StringTokenizer(string, delimiter, true);

		int index = 0; // index for valuesArray
		while (st5.hasMoreTokens()) {
			String tempString = st5.nextToken();
			if (tempString.equals(delimiter)) {
				index++;	// add +1 to index
				continue;	// if its a delimiter jump back to while
			}
			valuesArray[index]=tempString;	// add value from nextToken to valuesArray;
		}
		
		//Show all values
		for (int i = 0; i < valuesArray.length; i++) {
			System.out.print(valuesArray[i]+" ");
		}
		System.out.println("\n");	// jump to next line
	}
	
	/*
	 *to start all of the demos 
	 */
	private void demos() {
		demo1();
		//demo2();
		//demo3();
		//demo4(text, "-;,", false);
		//demo5("1|2||4|5", "|",5);	// 3 does not exist between parameters
	}

	public static void main(String[] args) {
		StringTokenizerDemo startDemo = new StringTokenizerDemo();
		startDemo.demos();
	}

}
