import java.util.Scanner;
import java.util.Arrays;

public class TicTacToe {
	public static void main(String[] args) {
		Scanner UserInput = new Scanner(System.in);
		
		System.out.println("Welcome to Omar's TicTacToe Game!");
		
		System.out.print("Player 1 name: ");
		String Player1Name = UserInput.nextLine();
		System.out.print("Player 2 name: ");
		String Player2Name = UserInput.nextLine();
		
		char [][] Dimensions = new char[4][4];
		//Standard size of a tictactoe board 
		for (int Rows = 1; Rows < 4; Rows++) {
		//Loops the row size so it begins with 1 and incrementd to 3(3 spots)
			for (int Columns = 1; Columns < 4; Columns++) {
			//Same exact thing, except for columns.
				Dimensions[Rows][Columns] = '-';
				//Fills the dimensions with -
			}
		}
		
		//Keeping track of whose turn it is using a boolean expression
		boolean Player1Turn = true;
		
		//Keeping track if the game has ended
		boolean GameEnd = false;
		
			
	while(!GameEnd) {
			DrawingOutTheBoard(Dimensions);
			
			//Player symbols, X or O
			char Symbol = ' ';
			
			if (Player1Turn) {
				Symbol = 'X';
			}
			else {
				Symbol = 'O';
			}
			
			//Print out the players turn
			if (Player1Turn) {
				System.out.println(Player1Name + "'s turn (X) - ");
			}
			else {
				System.out.println(Player2Name + "'s turn (O) -");
			}
			
			
			int Row = 1;
			int Column = 1;
			
			
			//While loop will keep asking user to enter a valid spot in bounds
			while(true) {
				//Get Row and Columb from user, location of symbol
				System.out.print("Enter a row {1 , 2, or 3}: ");
				Row = UserInput.nextInt();
				System.out.print("Enter a column {1 , 2, or 3}: ");
				Column = UserInput.nextInt();
				
				//Checking if Row and Column are valid from user, bounds [0,2] 
				if (Row < 1 || Column < 1 || Row > 3 || Column > 3) {
					System.out.println("Your input is out of bounds!");
				}
				//User also cannot use the same location more than once
				else if (Dimensions[Row][Column] != '-') {
					System.out.println("Spot already taken!");
				}
				else {
					break;
				}
			}
			
			//Setting position of the board to the players symbol
			//Wherever user choses, that spot will have a X or O
			Dimensions[Row][Column] = Symbol;
			
			//Check if a player has won
			if (hasWon(Dimensions) == 'X') {
			//This means Player 1 has won
				System.out.println(Player1Name + " has won, Congrats!");
				GameEnd = true;
			}
			else if (hasWon(Dimensions) == 'O') {
			//This means Player 2 has won
				System.out.println(Player2Name + " has won, Congrats!");
				GameEnd = true;
			}
			else {
				if (hasTied(Dimensions)) {
				//Nobody won
				System.out.println("Both "+ Player1Name + " and " 
										+ Player2Name + " have tied!");
				GameEnd = true;
				}
				else {
				//Continue game
					Player1Turn = !Player1Turn;
					//Changes turns, not player 1's turn anymore
				}
			}
		}
	DrawingOutTheBoard(Dimensions);
	UserInput.close();
	}
	
	//Check if a player won
	public static char hasWon(char[][] Dimensions) {
		//checking row
		for (int x = 1; x < 4; x++) {
			if (Dimensions[x][1] == Dimensions[x][2] && 
					Dimensions[x][2] == Dimensions[x][3] && 
						Dimensions[x][1] != '-') {
				return Dimensions[x][1];
				//Can return any positon, aslong as it returns the board
				//return Dimensions[Row][0] or return Dimensions[Row][1]
				// or return Dimensions[Row][2]
			}
		}
		//checking columns
		for (int y = 1; y < 4; y++) {
			if (Dimensions[1][y] == Dimensions[2][y] && 
				//If which ever player has X/O throughout all of
					Dimensions[2][y] == Dimensions[3][y] && 
						Dimensions[1][y] != '-') {
				return Dimensions[1][y];
				//Can return any positon, aslong as it returns the board
				//return Dimensions[0][Column] or return Dimensions[1][Column]
				// or return Dimensions[2][Column]
			}
		}
		//checking diagnals
		if (Dimensions[1][1] == Dimensions[2][2] && 
				Dimensions[2][2] == Dimensions[3][3] && 
					Dimensions[1][1] != '-') {
			return Dimensions[1][1];
			//Can return any positon, aslong as it returns the board
			//return Dimensions[0][0] or return Dimensions[1][1] 
			// or return Dimensions[2][2]
		}
		if (Dimensions[3][1] == Dimensions[2][2] && 
				Dimensions[2][2] == Dimensions[1][3] && 
					Dimensions[3][1] != '-') {
			return Dimensions[3][1];
			//Can return any positon, aslong as it returns the board
			//return Dimensions[0][0] or return Dimensions[1][1] 
			// or return Dimensions[2][2]
		}
			
		//Nobody Wins
		return '-';	
	}
		
	//Check if board is full and no one won
	public static boolean hasTied(char[][] Dimensions) {
		for (int Rows = 1; Rows < 4; Rows++) {
			//Loops the row size so it begins with 0 and incrementd to 2(3 spots)
				for (int Columns = 1; Columns < 4; Columns++) {
				//Same exact thing, except for columns.
					if (Dimensions[Rows][Columns] == '-') {
						return false;
						//False if there is an empty space
					}
				}
			}
		return true;
		//True if players tied and the board is full
	}
		
	/*Drawing out the Board method will not need to return anything
	 * therefore it is void, it will only give the lay out of the
	 * board using the dimensions created. Method is used when user
	 * gets to view board.*/
	public static void DrawingOutTheBoard(char [][] board) {
		for (int x = 1; x < 4; x++) {
			for (int y = 1; y < 4; y++) {
				System.out.print(board[x][y]);
			}
			System.out.println();
		}
			
	}
	
}