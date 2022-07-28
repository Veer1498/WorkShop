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
	public static int position;
	public static int computerPosition;
;
	
	
	//Main Function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calling Required Methods
		welcome();
		toss();
		createBoard();
		user();
		moveLocation();
		computerMove();
		showBoard();
		
	}
	
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
		//showBoard Function
		public static void showBoard() {
			System.out.println(gameBoard[1]+" | "+gameBoard[2]+" | "+gameBoard[3]);
			System.out.println("----------");
			System.out.println(gameBoard[4]+" | "+gameBoard[5]+" | "+gameBoard[6]);
			System.out.println("----------");
			System.out.println(gameBoard[7]+" | "+gameBoard[8]+" | "+gameBoard[9]);
		}
		
		//moveLocation Function
		public static void moveLocation() {
			System.out.println("Enter the Position (1-9) to Enter Your Letter");
			position = sc.nextInt();
			switch (position) {
			case 1 :
			if(gameBoard[1]==' '){
				gameBoard[1]= userTurn;
			}
			break;
			case 2 :
				if(gameBoard[2]==' '){
					gameBoard[2]= userTurn;
				}
				break;
			case 3 :
				if(gameBoard[3]==' '){
					gameBoard[3]= userTurn;
				}
				break;
			case 4 :
				if(gameBoard[4]==' '){
					gameBoard[4]= userTurn;
				}
				break;
			case 5 :
				if(gameBoard[5]==' '){
					gameBoard[5]= userTurn;
				}
				break;
			case 6 :
				if(gameBoard[6]==' '){
					gameBoard[6]= userTurn;
				}
				break;
			case 7 :
				if(gameBoard[7]==' '){
					gameBoard[7]= userTurn;
				}
				break;
			case 8 :
				if(gameBoard[8]==' '){
					gameBoard[8]= userTurn;
				}
				break;
			case 9 :
				if(gameBoard[9]==' '){
					gameBoard[9]= userTurn;
				}
				break;
			default :
				System.out.println("Please Enter Correct Option");
				System.out.println("===========================");
			}
		}
		//Computer Move Function
		public static void computerMove() {
			boolean flag = false;
			while(true) {
				computerPosition = (int) (Math.floor(Math.random()*8));
				switch(computerPosition) {
				case 0:
					if(gameBoard[1]==' ') {
						gameBoard[1]= computerTurn;
						flag = true;
					}
					break;
				case 1:
					if(gameBoard[2]==' ') {
						gameBoard[2]= computerTurn;
						flag = true;
					}
					break;
				case 2:
					if(gameBoard[3]==' ') {
						gameBoard[3]= computerTurn;
						flag = true;
					}
					break;
				case 3:
					if(gameBoard[4]==' ') {
						gameBoard[4]= computerTurn;
						flag = true;
					}
					break;
				case 4:
					if(gameBoard[5]==' ') {
						gameBoard[5]= computerTurn;
						flag = true;
					}
					break;
				case 5:
					if(gameBoard[6]==' ') {
						gameBoard[6]= computerTurn;
						flag = true;
					}
					break;
				case 6:
					if(gameBoard[7]==' ') {
						gameBoard[7]= computerTurn;
						flag = true;
					}
					break;
				case 7:
					if(gameBoard[8]==' ') {
						gameBoard[8]= computerTurn;
						flag = true;
					}
					break;
				case 8:
					if(gameBoard[9]==' ') {
						gameBoard[9]= computerTurn;
						flag = true;
					}
					break;
				}
				if (flag) {
					break;
				}
			}
			
		}
		public static void toss() {
			System.out.println("Toss to check Who plays First");
			int check = (int) (Math.floor(Math.random()*1));
			System.out.println("\n1.Tails \n2.Heads");
			int toss = sc.nextInt();
			if(toss == check) {
				System.out.println("I won Toss");
			}
			else
				System.out.println("Computer Won Toss");
		}

}
