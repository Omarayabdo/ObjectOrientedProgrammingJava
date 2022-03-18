
import java.util.Scanner;

public class DiscountSeller {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many items are you going to buy?: ");
		int quantity = scan.nextInt();
		
		System.out.println();
		
		System.out.print("What is the price?: ");
		double price = scan.nextDouble();
		
		double discount;
		discount = 0;
		
		System.out.println();
		
		if(quantity >= 10 && quantity < 20) {
			discount = 0.2;
		}
		else if(quantity >= 20 && quantity < 50) {
			discount = 0.3;
		}
		else if(quantity >= 50 && quantity < 100) {
			discount = 0.4;
		}
		else if(quantity >= 100) {
			discount = 0.5;
		}
		
		System.out.println("The discount is " + discount*100 + "%");
		
		System.out.println("The discounted price is $" + (price - price*discount));
		System.out.println("The discounted amount per unit is $" + (price*discount));
		System.out.println("The total price is $" + ((price - price*discount)*quantity));	
	}

}
