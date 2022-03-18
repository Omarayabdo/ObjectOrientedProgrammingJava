import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter the dimentions of an n x m matrix: ");
		int n = stdin.nextInt();
		int m = stdin.nextInt();
		
		System.out.printf("Enter the matrix of %d x %d:\n", n, m);
		
		double[][] Array = new double[n][m];
		for (int i = 0; i < Array.length; i++) {
			for (int j = 0; j < Array[i].length; j++) {
				Array[i][j] = stdin.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("The sum of the columns is: ");
		
		for(int i = 0; i < Array[0].length; i++) {
			System.out.print(Addition(Array, i) + " ");
		}
		stdin.close();
	}
	
	public static double Addition(double[][] m, int c) {
		double Sum = 0;
		for (int i = 0; i < m.length; i++) {
			Sum += m[i][c];
		}
		return Sum;
	}
}