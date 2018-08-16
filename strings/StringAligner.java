package strings;

import java.text.FieldPosition;
import java.text.Format;
/* FaceBook group: Programming
 * GitHub : Java how to
 * Align a text to CENTER, LEFT, or RIGHT, with a given line width, and given text 
 */
public class StringAligner extends Format{

	private static final long serialVersionUID = 1L;

	// constants for text alignment
	private enum Alignment {
		CENTER, LEFT, RIGHT
	}

	// current alignment
	private Alignment currentAlignment;
	// current line width
	private int currentWidth;

	/**
	 * Constructor for alignment object defining width of the output document, and
	 * type of alignment, CENTER, LEFT, or RIGHT
	 * 
	 * @param lineWidth
	 *            maximal line width of output text
	 * @param alignment
	 *            One of three possible values CENTER, LEFT, or RIGHT
	 */
	public StringAligner(int lineWidth, Alignment alignment) {

		// defines type of alignment, throws exception if wrong value given
		switch (alignment) {
		case CENTER:
			this.currentAlignment = alignment;
			break;
		case LEFT:
			this.currentAlignment = alignment;
			break;
		case RIGHT:
			this.currentAlignment = alignment;
			break;
		default:
			throw new IllegalArgumentException("Alignment CENTER, LEFT, or RIGHT only");
		}

		// throws exception if text width defined as negative number
		if (lineWidth < 0) {
			throw new IllegalArgumentException("Line width must be a positive value");
		}

		// defines the width of the doc
		this.currentWidth = lineWidth;

	}

	@Override
	public StringBuffer format(Object obj, StringBuffer toAppendTo, FieldPosition pos) {
		
		String string = obj.toString();
		String stringPart = string.substring(0,Math.min(string.length(), this.currentWidth));
		int numberOfChars = this.currentWidth-stringPart.length();
		switch(this.currentAlignment) {
		case CENTER:
			for (int i = 0; i < numberOfChars/2; i++) {
				toAppendTo.append(' ');
			}
			toAppendTo.append(stringPart);
			for (int i = 0; i < numberOfChars-numberOfChars/2; i++) {
				toAppendTo.append(' ');
			}
			break;
		case LEFT:
			toAppendTo.append(stringPart);
			for (int i = 0; i < numberOfChars; i++) {
				toAppendTo.append(' ');
			}
			break;
			
		case RIGHT:
			for (int i = 0; i < numberOfChars; i++) {
				toAppendTo.append(' ');
			}
			toAppendTo.append(stringPart);
			break;
		}
		
		return toAppendTo;
	}

	@Override
	public Object parseObject(String source, ParsePosition pos) {
		// needed for Format extension 
		return null;
	}

	public static void main(String[] args) {
		String text = "Java: is a computer-programming language concurrent, class-based, object-oriented";
		StringAligner alignment = new StringAligner(70,Alignment.CENTER);
		System.out.println(alignment.format(">>-CENTER-<<"));
		StringAligner alignment1 = new StringAligner(70,Alignment.LEFT);
		System.out.println(alignment1.format(">>-LEFT-<<"));
		StringAligner alignment2 = new StringAligner(70,Alignment.RIGHT);
		System.out.println(alignment2.format(">>-RIGHT-<<"));
		StringAligner alignment3 = new StringAligner(70,Alignment.CENTER);
		System.out.println(alignment3.format(text));
		
	}
}
