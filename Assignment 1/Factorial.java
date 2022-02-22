//2.Write a Java Program to find the Factorial of given number. 
class Factorial{
	static void Fact(int num){
		int sum = 1;
		for(int i = 1 ;i<=num;i++){
			sum = sum * i;
			System.out.print(sum+" ");
		}
	}
	public static void main(String args[]){
		int Val = 12;
		Factorial.Fact(Val);
	}
}