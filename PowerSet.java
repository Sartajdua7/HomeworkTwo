package homework2;

public class PowerSet {

	public static void powerSet(int[] x) {
		String temp = "";
		for(int i = 0; i < x.length; i++) {
			temp = "";
			for(int r = i; r < x.length; r++) {
				temp += Integer.toString(r) + ", ";
			}
			System.out.println(temp);
		}
	}
	public static void main(String[] args) {
		int[] x = {1, 2, 3};
		powerSet(x);
	}
}
