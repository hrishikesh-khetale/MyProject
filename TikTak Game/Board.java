package TikTak;

public class Board
{
	// Creating an array of size 3 X 3
	char[][] board = new char[3][3];
     
	public  Board()
	{
		display(board);
	}
	
	////To take input from Player1
	    public void Player1(int a,int b)
      {
		char p ='X';
		if(board[a][b]=='X' || board[a][b]=='O')
		{
			System.out.println("Postion Entered is already used");
			return;
		}
		board[a][b]=p;
		display(board);
		}	
////To take input from Player1
	public void Player2(int a,int b)
	{
			char p ='O';
			if(board[a][b]=='X' || board[a][b]=='O')
			{
				System.out.println("Postion Entered is already used");
				return;
			}
			board[a][b]=p;
			display(board);
	}	
		//To display the array
	public  void display(char[][] board)
	{
		for(int i =0;i<board.length;i++)
		{
			for(int j=0;j<board.length;j++)
			{
				System.out.print(board[i][j]+"| ");
			}
			System.out.println();
		
			
		}
		System.out.println();
		System.out.println();
	}
	public Boolean Winner()
	{
		if(board[0][0]==board[0][1] && board[0][1]==board[0][2] && board[0][2]!='\u0000' )
			return true;
		else if(board[0][0]==board[1][0] && board[1][0]==board[2][0] && board[2][0]!='\u0000' )
			return true;
		else if(board[0][0]==board[1][1]&& board[1][1]==board[2][2] && board[2][2]!='\u0000' )
			return true;
		else if(board[1][0]==board[1][1]&& board[1][1]==board[1][2] && board[1][2]!='\u0000' )
			return true;
		else if(board[0][1]==board[1][1]&& board[1][1]==board[2][0] && board[2][0]!='\u0000' )
			return true;
		else if(board[0][2]==board[1][2]&& board[1][2]==board[2][2] && board[2][2]!='\u0000' )
			return true;
		else if(board[2][0]==board[2][1]&& board[2][1]==board[2][2] && board[2][2]!='\u0000' )
			return true;
		else if(board[2][0]==board[1][1]&& board[1][1]==board[0][2] && board[0][2]!='\u0000' )
			return true;
		return false;
		
	}
	
	public void Enter(int choice,boolean flag)
	{
		switch(choice)
		{
		case 1 :
			if(flag)
				Player1(0,0);
			else 
				Player2(0,0);
			break;
		case 2 :
			if(flag)
				Player1(0,1);
			else 
				Player2(0,1);
			break;
		case 3 :
			if(flag)
				Player1(0,2);
			else 
				Player2(0,2);
			break;
		case 4 :
			if(flag)
			Player1(1,0);
			else 
				Player2(1,0);
			break;
		case 5 :
			if(flag)
				Player1(1,1);
			else 
				Player2(1,1);
			break;
		case 6 :
			if(flag)
				Player1(1,2);
			else 
				Player2(1,2);
			break;
			
		case 7 :
			if(flag)
				Player1(2,0);
			else 
				Player2(2,0);
			break;
		case 8 :
			if(flag)
				Player1(2,1);
			else 
			Player2(2,1);
			break;
		case 9 :
			if(flag)
				Player1(2,2);
			else 
				Player2(2,2);
			break;
			default:
             System.out.println("Invalid Input");			
		}
	}
	
}
