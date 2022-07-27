package workshop;
import java.util.Scanner;
/**
 * Tic-Tac-Toe Game Simulation
 * @author Veer.Singa
 *
 */

	//TicTacToe Class
public class TicTacToe {
	/**
	 * 1.Created an Array Board with 10 characters.
	 * 2.Imported a scanner 
	 * 3.Created a method createBoard, added a For Loop where i up to array length.
	 * 4.board[i] will be stored empty.
	 * 5.Main function with welcome message is created and createBoard function is called.
	 * 
	 */
	static char[] board = new char[10];
	static Scanner scanner = new Scanner(System.in);
	
	//UC1- Creating an Empty Board
	public static void createBoard() {
		for (int i=1;i<board.length;i++) {
			board[i] = ' ';
		}
}
	
	//Main Function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Tic Tac Toe Game");
		createBoard();
		
	}

}
