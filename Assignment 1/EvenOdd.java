//1.Check the given number is EVEN or ODD. 
class EvenOdd{
	static boolean IsEvenOdd(int num){
		if(num == 0)
			return true;
		if(num%2 == 0 )
			return true;
		return false;
	}
	public static void main(String args[]){
		int Val = 12;
		if(EvenOdd.IsEvenOdd(Val))
			System.out.println("Number id Even");
		else
			System.out.println("Number is Odd");
	}
}