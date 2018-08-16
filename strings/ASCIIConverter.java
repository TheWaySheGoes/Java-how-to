package strings;

/* FaceBook group: Programming
 * GitHub : Java how to
 * Converting from ASCII to Unicode Character
 */
public class ASCIIConverter {
	
	/*
	 * Converts and returns character in Unicode from ASCII  
	 */
	private Character demo1(Character character) {
		return (char)character;
	}
	
	/*
	 * Similar to demo1 but need a ASCII character array as parameter
	 */
	private String demo2(Character[] character) {
		StringBuilder text = new StringBuilder();
		for (int i = 0; i < character.length; i++) {
			text.append((char)character[i]);
		}
		return text.toString();
	}
	
	/*
	 * converts from decimal to character and returns it
	 */
	private Character demo3(int character) {
		return (char)character;
	}
	
	/*
	 * Similar to demo3 but takes int array as a parameter
	 */
	private String demo3(int[] character) {
		StringBuilder text = new StringBuilder();
		for (int i = 0; i < character.length; i++) {
			text.append((char)character[i]);
		}
		return text.toString();
	}
	
	/*
	 * Run demo methods from here 
	 */
	private void demos() {
		Character[] characters = {'\u00a5','\u0024','\u20AC','\u00A3'};
		int[] charactersINT = {65,66,67,68};
		
		System.out.println(demo1('\u00a5'));	// demo1
		//System.out.println(demo2(characters));	//demo2
		//System.out.println(demo3(65));		// demo3
		//System.out.println(demo3(charactersINT));		// demo4
		
	}
	
	public static void main(String[] args) {
		ASCIIConverter ac= new ASCIIConverter();
		ac.demos();
	}
}
