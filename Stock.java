
public class Stock {
		
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	public Stock(String symbol, String name) {
		previousClosingPrice = 0.0;
		currentPrice = 0.0;
		this.symbol = symbol;
		this.name = name;
	}
	
	public String getSymbol() {
		return symbol; }
	
	public String getName() {
		return name; }
	
	public double getPreviousClosingPrice() {
		return previousClosingPrice; }
	
	public double getCurrentPrice() {
		return currentPrice; }
	
	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice; }
	
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice; }
	
	public double changePercent() {
		double p = ((currentPrice/previousClosingPrice)-1)*100;
		return (double)(Math.round(p*100.0)/100.0);
	}
	
}
