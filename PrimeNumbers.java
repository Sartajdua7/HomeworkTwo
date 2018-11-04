package homework2;
import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
	int number = scan.nextInt();
	ArrayList<Integer> intList = new ArrayList<>();
	ArrayList<Boolean> boolList = new ArrayList<>();
	for(int i = 0; i <= number; i++) {
		intList.add(i);
		if(i > 1) {
			boolList.add(true);
		}
		else {
			boolList.add(false);
		}
	}
	int pointer = 2;
	while(pointer <= number/2) {
		for(int i = 2; i < number; i++) {
			int temp = intList.get(pointer) * i;
			if(temp < intList.size()) {
				boolList.set(temp, false);
			}
		}
		pointer++;
	}
	for(int i = 0; i < boolList.size(); i++) {
		if(boolList.get(i) == true) {
			System.out.println(intList.get(i));
		}
	}
	}
}
