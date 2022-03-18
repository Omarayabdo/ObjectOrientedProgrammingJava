import java.util.Scanner; 

public class Complex implements Comparable, Cloneable{
	private double re;private double im;
	
	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
		}
	public Complex(double re) {
		this.re = re;
		this.im = 0;
		}
	public Complex() {
		this.im = 0;
		this.re = 0;
		}
	public String toString() {
		if(im == 0 && re == 0) {
			return "0";
			}
		else if (im == 0 && re != 0) {
			return String.valueOf(re);
			}
		else {
			return (String.valueOf(re) + " + " + String.valueOf(im) + "i");
			}
		}
	public double getReal() {
		return re;
		}
	public double getImaginary() {
		return im;
		}
	public Complex plus(Complex b) {
		Complex a = this;double real = a.re + b.re;
		double imaginary = a.im + b.im;return new Complex(real, imaginary);
		}
	public Complex minus(Complex b) {
		Complex a = this;
		double real = a.re - b.re;
		double imag = a.im - b.im;
		return new Complex(real, imag);
		}
	public Complex multiply(Complex b) {
		Complex a = this;
		double real = (a.re * b.re) - (a.im * b.im);
		double imag = (a.re*b.im) + (a.im * b.re);
		return new Complex(real, imag);
		}
	public Complex divide(Complex b) {
		Complex a = this;
		double bot = (2*b.re) + (2*b.im);
		double real = ((a.re * b.re) + (a.im * b.im)) / bot;double imag = ((a.im * b.re) - (a.re * b.im)) / bot;
		return new Complex(real, imag);
		}
	public Object clone() {
		try {
			return super.clone();
			}
		catch(CloneNotSupportedException ex) {
			return null;
			}
		}
	public int compareTo(Object o) {
		Complex a = this;
		Complex b = (Complex) o;
		if(a.re > b.re && a.im > b.im) {
			return 1;
			}
		else if (a.re < b.re && a.im < b.im) {
			return -1;
			}
		else {
			return 0;}
		}
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		double a, b;
		
		System.out.println("enter real, imaginary number for Complex number a:");
		if(input.hasNext()) {
			a = input.nextDouble();
			}
		else{
			a = 0;
			}
		if(input.hasNext()) {
			b = input.nextDouble();
			}
		else {
			b = 0;
			}
		}
	}