package strings;
/* FaceBook group: Programming
 * GitHub : Java how to
 * Manipulating string one character at a time 
 */
public class CharAttDemo {
	String text = "Java: is a computer-programming language concurrent, class-based, object-oriented";

	/*
	 * getting one character at a time with for loop
	 */
	private void demo1() {
		// for character at index from 0 to last index in text String
		for (int i = 0; i < text.length(); i++) {
			// get character at index i and print it
			char character = text.charAt(i);
			System.out.print(character);
		}
		System.out.print("\n"); // go to a next line
	}

	private void demo2() {
		for (char character : text.toCharArray()) {
			System.out.print(character);
		}
		System.out.print("\n"); // go to a next line
	}

	/*
	 * to start all of the demos
	 */
	private void demos() {
		demo1();
		demo2();
	}

	public static void main(String[] args) {
		CharAttDemo cad = new CharAttDemo();
		cad.demos();
	}
}
