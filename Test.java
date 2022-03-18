
public class Test {
	
	public static void main (String[] args) {
		
		OurInteger num1 = new OurInteger(24);
		OurInteger num2 = new OurInteger(3);
		OurInteger num3 = new OurInteger(-4);
		
		System.out.println("num1 is even: " + num1.isEven());
		System.out.println("3 is even: " + OurInteger.isEven(3));
		System.out.println("4 is even: " + OurInteger.isEven(new OurInteger(4)));
		
		System.out.println("num2 is even: " + num2.isOdd());
		System.out.println("5 is odd: " + OurInteger.isOdd(5));
		System.out.println("6 is odd: " + OurInteger.isOdd(new OurInteger(6)));
		
		System.out.println("num3 is prime: " + num2.isPrime());
		System.out.println("8 is prime: " + OurInteger.isPrime(8));
		System.out.println("11 is prime: " + OurInteger.isPrime(new OurInteger(11)));
		
		System.out.println("23 is equal to 3: " + num1.equals(3));
		System.out.println("23 is equal to 3 (obj): " + num1.equals(num2));
		System.out.println("23 is equal to itself: " + num1.equals(24));
		
		System.out.println("wowowowowo");
		OurInteger num4 = OurInteger.parseInt("100000");
		System.out.println("num4 value is: " + num4.getValue());
	}
}
