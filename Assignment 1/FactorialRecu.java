//3.Find the Factorial of a number using Recursion. 
class FactorialRecu{
	static int Fact(int num){
		if(num == 1)
			return num;
		return Fact(num-1) * num;
	}
	public static void main(String args[]){
		int Val = 12;
		System.out.println(Factorial.Fact(Val));
	}
}