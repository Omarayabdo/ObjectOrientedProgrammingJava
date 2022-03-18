
public class OurInteger {
	
	private int value;
	
	public OurInteger(int value) { this.value = value; }
	
	public int getValue() { return value; }
	
	public boolean isEven() { return (value % 2) == 0; }
	public static boolean isEven(int num) {
		OurInteger temp = new OurInteger(num);
		return temp.isEven();
	}
	public static boolean isEven(OurInteger num) {
		return num.isEven();
	}
	public boolean isOdd() { return (value % 2) == 1; }
	public static boolean isOdd(int num) {
		OurInteger temp = new OurInteger(num);
		return temp.isOdd();
	}
	public static boolean isOdd(OurInteger num) {
		return num.isOdd();
	}
	public boolean isPrime() {
		if (value <= 1)
			return false;
		for (int i = 2; i < value; i++) {
			if ((value % i) == 0)
				return false;
		}
		return true;
	}
	public static boolean isPrime(int num) {
		OurInteger temp = new OurInteger(num);
		return temp.isPrime();
	}
	public static boolean isPrime(OurInteger num) {
		return num.isPrime();
	}
	
	public boolean equals(int num) {
		return this.value == num;
	}
	public boolean equals(OurInteger num) {
		return this.value == num.getValue();
	}

	public static OurInteger parseInt(String num) {
		boolean negative = false;
		int index = 0;
		int value = 0;
		int length = num.length();
		
		if (length == 0)
			return new OurInteger(0);
		if (num.charAt(0) == '-') {
			if (length == 1)
				return null;
			negative = true;
			index++;
		}
		
		while (index < length) {
			char c = num.charAt(index);
			System.out.println(c);
			if (c < '0' || c > '9')
				return null;
			int power = (length - 1) - (index);
			int currentVal = (int)(c - '0');
			value += currentVal * Math.pow(10, power);
			index++;
		}
		if (negative)
			value = -value;
		return new OurInteger(value);
	}
	
	
}
