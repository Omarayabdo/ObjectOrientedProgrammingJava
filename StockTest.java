
public class StockTest {
	
	public static void main(String[] args) {
		
		Stock g = new Stock("GOOG", "Google Inc.");
		g.setPreviousClosingPrice(100.0);
		g.setCurrentPrice(90.0);
		System.out.println("Price % change for GOOG is " + g.changePercent()); 
		
		Stock f = new Stock("GFB", "Facebook, Inc.");
		f.setPreviousClosingPrice(290.11);
		f.setCurrentPrice(293.54);
		System.out.println("Price % change for GOOG is " + f.changePercent()); 
	
		Stock a = new Stock("AMZN", "Amazon.com, Inc.");
		a.setPreviousClosingPrice(3074.96);
		a.setCurrentPrice(3110.87);
		System.out.println("Price % change for GOOG is " + a.changePercent());
	}
}
