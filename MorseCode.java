package homework2;

public class MorseCode {
	static char[] letter = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	static String[] morseCode = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.","...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

	public static String englishToMorse(String x) {
		String answer = "";
		char[] temp = StringToChar.stringToCharArr(x);
		for(int i = 0; i < temp.length; i++) {
			if(temp[i] == ' ')
				answer += "/ ";
			else {
			for(int r = 0; r < letter.length; r++) {
				if(temp[i] == letter[r]) {
					answer += morseCode[r] + " ";
					}
				}
			}
		}
		return answer;
	}
	
	public static String morseToEnglish(String x) {
		String word = "";
		String answer = "";
		for(int counter = 0; counter < x.length(); counter ++) {
			char part = x.charAt(counter);
			if(part == '.' || part == '-') {
				word += part;
			}
			else if(part == '/') {
				answer += " ";
				counter++;
			}
			else if(part == ' '){
				answer += morseToEnglishLetter(word);
				word = "";
			}
		}
		return answer;
	}
	
	
	public static char morseToEnglishLetter(String x) {
		for(int i = 0; i < morseCode.length; i++) {
			if(x.equals(morseCode[i])) {
				return letter[i];
			}
		}
		return '1';
	}
	
	  public static void main(String[] args) {  
		  System.out.println(englishToMorse("hello how are you doing today"));
		  System.out.println(morseToEnglish(".... . .-.. .-.. --- / .... --- .-- / .- .-. . / -.-- --- ..- / -.. --- .. -. --. / - --- -.. .- -.-- \n" + 
		  		""));
	  }
	
}
