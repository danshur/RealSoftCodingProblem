
public class Justified {

	public static void main(String[] args) {
		/*
		 * In text processing, one approach to making a document appealing to
		 * the eye is to justify paragraph text. With monospaced fonts in a
		 * terminal, as you might see in a man page, this is accomplished by
		 * inserting spaces between words to produce a line of text where the
		 * first character of that line begins on the left-hand margin and the
		 * last printable character is on the right-hand margin. For this
		 * problem, we would like you to think of a single line of text, and
		 * justify that text into a buffer, where the first character of the
		 * line of text is in the first spot in the buffer and the last
		 * character of text is in the specifed slot in the buffer.
		 */

		// String text = "The quick brown fox jumps over the lazy dog.";
		String text = "The quick brown";

		int buffer = 18;
		int spaces = 0;
		String delim = "[ ]+";
		String[] chars = text.split("");
		String[] words = text.split(delim);

		// get count of spaces
		for (int i = 0; i < chars.length; i++) {
			// System.out.println(chars[i]);
			if (chars[i].matches("\\s")) {
				++spaces;
			}
		}
		int charstoadd = buffer - chars.length;
		int fill = charstoadd / spaces;
		int isthereextra = charstoadd % spaces;		
		// what we have
		System.out.println();
		System.out.println(buffer + " how big the buffer is");
		System.out.println(chars.length + " characters in the string");
		System.out.println(words.length + " words");
		System.out.println(spaces + " spaces");
		System.out.println(charstoadd + " space characters to add to fill buffer");
		System.out.println(fill + " spaces to add between words");
		System.out.println(isthereextra + " there should be an extra space");

		// method for justify. Need to add extra spaces here. 
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
			if (chars[i].matches("\\s")) {
				int p = fill;
				while (p > 0) {
					System.out.print(" ");
					
					//check if you need extra space. this is not working right now
					if ( ((charstoadd % spaces) > 0) && (spaces == 1) ){
						System.out.print("x");
					}
					
					p--;
				}
			}
		}

	}

}
