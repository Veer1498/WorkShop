package workshop;

import java.util.Scanner;

/**
 * Create a TicTacToe Game Simulation.
 * @author Veer.Singa
 *
 */
	//TicTacToe Class
public class TicTacToe {
	/**
	 * 1.Created an Array Board which takes 10 characters.
	 * 2.Imported a scanner 
	 * 3.Created a method createBoard, added a For Loop where i up to array length.
	 * 4.board[i] will be stored empty.
	 * 5.Created a showBoard Function and arranged the method output as required.
	 * 6.Main function with welcome message is created and createBoard function is called.
	 * 
	 */
	
	//UC1- Creating an Empty Board
	
	public static char[] gameBoard = new char[10];
	public static Scanner sc = new Scanner(System.in);
	public static char computerTurn;
	public static char userTurn;
	
	
	
	
	//Welcome Function
	public static void welcome() {
		System.out.println("Welcome to Tic Tac Toe Game");
		System.out.println("***************************");
		System.out.println("");
	}
		
	//createBoard Function
	public static void createBoard() {
		for (int i=1;i<gameBoard.length;i++) {
			gameBoard[i] = ' ';
		}
		
	}
	
	//User function
	public static char user() {
		System.out.println("Enter Your Choice X or O");
		char letter = sc.next().charAt(0);
		return letter;		
			}
//	//showBoard Function
//	public static void showBoard() {
//		System.out.println(gameBoard[1]+"|"+gameBoard[2]+"|"+gameBoard[3]+"|");
//		System.out.println("-------");
//		System.out.println(gameBoard[4]+"|"+gameBoard[5]+"|"+gameBoard[6]+"|");
//		System.out.println("-------");
//		System.out.println(gameBoard[7]+"|"+gameBoard[8]+"|"+gameBoard[9]+"|");
//	}
	
	
		
	//Main Function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calling Required Methods
		welcome();
		createBoard();
		user();
	//	showBoard();
		
	}

}
