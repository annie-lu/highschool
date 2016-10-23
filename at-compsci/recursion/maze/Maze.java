package maze;

public class Maze {
	private char[][] maze;
	private int ipos,jpos;
	private int Iexit, Jexit;
	private int moves;
	private char[] alphabet;

	public Maze(char[][] m, int i, int j) 
	{
		maze = m;
		ipos = i;
		jpos = j;
		moves=0;
		alphabet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

	}

	public void display() {
		for(char[] a : maze)
		{
			System.out.println();
			for(char x : a)
			{
				System.out.print(x);
			}
		}		
		System.out.println("Moves Made:" + moves);
		System.out.println("(" + ipos + "," + jpos + ")" );
	}

	public boolean findExit() {
		return findExit(ipos, jpos);
	}

	private boolean findExit(int x, int y)
	{	ipos=x;
		jpos=y;
		maze[x][y]=alphabet[moves];
		moves++;
		display();
		
		
		if(x==maze.length-1||x==0||y==0 || y==maze[0].length-1){
			Iexit = x;
	        Jexit = y;
			return true;
		}
		
		if( maze[x][y + 1]==' ')
		{
			if(findExit(x,y+1))
				return true;
		}
		if(maze[x][y - 1]==' ')
		{
			if(findExit(x,y-1))
				return true;
		}
		if(maze[x + 1][y] == ' ')
		{
			if(findExit(x+1,y))
				return true;
		}
		if(maze[x-1][y] ==' ' )
		{
			if(findExit(x-1,y))
				return true;
		}
		return false;
	}

	public int getIExit() {
		return Iexit;
	}

	public int getJExit() {
		return Jexit;
	}

	public String getSteps() {
		return moves + "";
	}
	
	

}
