package homework2;

public class StringToChar {
public static char[] x = {'H', 'e', 'l', 'l', 'o'};
public static String word = "Hello";
	public static String charArrToString(char[] x) {
		String answer = "";
		for(int i = 0; i < x.length; i++) {
			answer += x[i];
		}
		
		
		return answer;
	}
	
	public static char[] stringToCharArr(String x) {
		char[] answer = new char[x.length()];
		for(int i = 0; i < x.length(); i++) {
			answer[i] = x.charAt(i);
		}
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(charArrToString(x));
		System.out.println(stringToCharArr(word));
	}
	
}
