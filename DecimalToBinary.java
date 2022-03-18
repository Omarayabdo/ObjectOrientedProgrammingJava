
public class DecimalToBinary {
	
	public static void main (String[] args) {
		
		for (int i = 0; i <= 32; i++) 
			System.out.println( i + ": " + dec2Bin(i));
	}
	
	public static String dec2Bin(int value) {
		if (value == 0)
			return "0";
		else if (value == 1)
			return "1";
		else
			return dec2Bin(value / 2) + (value % 2);
	}
}
