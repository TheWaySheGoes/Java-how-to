package strings;

/* FaceBook group: Programming
 * GitHub : Java how to
 * Divide a String by index 
 */
public class SubStringDemo {
	String text = "Java: is a computer-programming language concurrent, class-based, object-oriented";
	
	/*
	 * substring(start index)
	 */
	private void demo1() {
		System.out.println(text+"/n");

		// substring(start index)
		String s2 = text.substring(5);
		System.out.println(s2);

	}

	/*
	 *substring(start index, end index) 
	 */
	private void demo2() {
		System.out.println(text+"/n");

		// substring(start index, end index) end index is not included
		String s2 = text.substring(2, 7);
		System.out.println(s2);

	}

	/*
	 * method with text, and start index as a parameter 
	 */
	private void demo3(String text, int startIndex) {
		System.out.println(text+"/n");
		String s3 = text.substring(startIndex);
		System.out.println(s3);

	}

	/*
	 * method with text, start index, and end index as parameter
	 */
	private void demo4(String text, int startIndex, int endIndex) {
		System.out.println(text+"/n");
		String s4 = text.substring(startIndex, endIndex);
		System.out.println(s4);

	}

	/*
	 * to start all of the demos
	 */
	private void demos() {
		demo1();
		//demo2();
		//demo3(text,5);
		//demo4(text,2,6);	// end index not included
	}

	public static void main(String[] args) {
		SubStringDemo startDemo = new SubStringDemo();
		startDemo.demos();
	}
}
