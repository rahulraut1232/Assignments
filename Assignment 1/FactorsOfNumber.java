import java.util.Scanner;

public class FactorsOfNumber {
	
	public static void main(String[] args) {
	    Scanner	sc = new Scanner(System.in);
		
		System.out.println("Please Enter any number to Find Factors: ");
		int Number = sc.nextInt();
		
		for(int i = 1; i <= Number; i++) {
			if(Number%i == 0) {
				System.out.format(" %d  ", i);
			}
		}
	}
}