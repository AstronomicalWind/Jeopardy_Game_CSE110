
public class Player {
Questions question = new Questions(); //get a questions object from the class running
private String name; //name of the player
private static String p1Name; //specific static to determine which player is which
private static String p2Name;
private static int totalPoints=0; //total points that count until all questions have been answered
private static final int MAXIMUMPOINTS=7500; //this is the max amount of points possible
private int points; //points of the user
private static int turn=1; //determines the turn
public Player(String name) //get name from user input
{
	this.name=name;
}
private void addToTotal(int points) //adds to the total amount until the game is over
{
	totalPoints=totalPoints+points;
	if (totalPoints==MAXIMUMPOINTS)
	{
		System.out.println("***The Game has ended, press p to view the final score***");
		
		
	}
}

public void assignPlayer1(String name) //assigns name to static variable
{
	p1Name=name;
}

public void assignPlayer2(String name)
{
	p2Name=name;
}

public void addPoints(int points) //adds point to the cumialtive sum
{
	this.points=this.points+points;
	this.addToTotal(Math.abs(points));
}
public void determineTurn(int earnedPoints) //determines the turned based on if the answer is right
{
	//System.out.println("turn is"+turn);
	if (earnedPoints<0)
	{
		turn*=-1;
	}
	if (turn==1)
	{
		System.out.println(p1Name+"'s turn");
	}
	else if (turn==-1)
	{
		System.out.println(p2Name+"'s turn");
	}
	
}
public String toString() //tostring that gives back the name
{
	return name;
}
public int returnScore() //returns the score
{
	return points;
}
public int getTurn() //determines turn
{
	return turn;
}
}
