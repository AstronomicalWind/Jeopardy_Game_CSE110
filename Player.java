
public class Player {
private String name;
private static String p1Name;
private static String p2Name;
private int points;
private static int turn=1;
public Player(String name)
{
	this.name=name;
}

public void assignPlayer1(String name)
{
	p1Name=name;
}

public void assignPlayer2(String name)
{
	p2Name=name;
}

public void addPoints(int points)
{
	this.points=this.points+points;
}
public void determineTurn(int earnedPoints)
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
public String toString()
{
	return name;
}
public int returnScore()
{
	return points;
}
public int getTurn()
{
	return turn;
}
}
