package workshop;
/**
 * Tic-Tac-Toe Game Simulation.
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
	
	//UC1- Creating an Empty Board
	
	static char[] gameBoard = new char[10];
		
	//createBoard Function
	public static void createBoard() {
		for (int i=1;i<gameBoard.length;i++) {
			gameBoard[i] = ' ';
		}
	}
	public static void showBoard() {
		System.out.println(gameBoard[1]+"|"+gameBoard[2]+"|"+gameBoard[3]+"|");
		System.out.println("-------");
		System.out.println(gameBoard[4]+"|"+gameBoard[5]+"|"+gameBoard[6]+"|");
		System.out.println("-------");
		System.out.println(gameBoard[7]+"|"+gameBoard[8]+"|"+gameBoard[9]+"|");
	}
	
	//Main Function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Tic Tac Toe Game");
		createBoard();
		showBoard();
		
	}

}
