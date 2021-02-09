import java.util.*;

public class removeDoubleLetter {
	
	/*Scanner s = new Scanner(System.in);
	System.out.println*/
	
	public static String removeDoubleLetters(String word) {
	if(word.length() < 1) {
		System.out.println("Invalid string.");
		return "";
	}
	String newWord = "";
	newWord += word.charAt(0);
	for(int i = 1; i < word.length(); i++) {
		if(word.charAt(i) != (word.charAt(i-1))) {
			newWord += word.charAt(i);
		}
	}
	return newWord;
	

	}

	public static void main(String[] args) {
		System.out.println(removeDoubleLetters("78888"));
	}
}
