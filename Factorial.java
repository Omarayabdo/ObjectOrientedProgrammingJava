
public class Factorial {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 11; i++) {
			System.out.println(i + "! = " + factorial(i));
		}
	}
	
	public static long factorial(long n) {
		if (n == 1)
			return 1;
		else 
			return n * factorial(n-1);
	}
}
