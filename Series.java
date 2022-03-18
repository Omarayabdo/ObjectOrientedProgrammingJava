
public class Series {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("m(" + i + ") = " + m(i));
		}
	}
	
	public static double m(int n) {
		if (n == 1)
			return 1;
		else 
			return 1.0 / n + m(n-1);
	}

}
