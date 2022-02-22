import java.util.*;

class Palindrome{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String/Number");
		
		String str1 = sc.nextLine();
		
		String str2 = "";
		
		for(int i = (str1.length()-1);i >= 0;i--){
			str2 = str2 + str1.charAt(i);
		}
		
		if(str1.equals(str2)){
			System.out.println("Given string/Number is palindrome");
		}
		else{
			System.out.println("Given string/Number is not palindrome");
		}
		
		int r,l;
		int num = 454;
		int sum = 0;
		l = num;
		while(num>0){
			r = num % 10;
			sum = sum * 10 + r;
			num = num /10;
		}
		
		if(l == sum){
			System.out.println("Given "+l+"Number is palindrome");
		}
		else{
			System.out.println("Given "+l+" Number is not palindrome");
		}
	}
}