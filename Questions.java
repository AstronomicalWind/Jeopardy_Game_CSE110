import java.util.Arrays;
public class Questions {
//base index
private int index=0;
//geography 
private int geographyPoints[]= {100,200,300,400,500};
private String geographyQuestions[]= {"This landform is characterized as being almost entirely surrounded by water (3 sides out of 4).",
		"This country has the same name as an American state with the capital Atlanta.",
		"At 4,132 miles long, this is considered the longest river in the world.",
		"This country has been deemed the smallest in both population and land mass.",
		"This number is the amount of time zones that exist within the United States of America."};
private String geographyAnswers[] = {"peninsula","georgia","nile","vatican city","6"};

//mathematics
private int mathematicsPoints[] = {100,200,300,400,500};
private String mathematicsQuestions[] = {"This number is the product of 8 and 7 subtracted by 3.",
		"This number is the derivative of any numerical constant in calculus.",
		"This polygon has 12 sides and an interior angle sum of 1800°.",
		"This number represents the amount of zeroes in the number ‘one hundred billion’.",
		"This number represents the area under the curve of y = sin(x) + cos(x)  over [0, pi]."};
		
private String mathematicsAnswers[]= {"53","0","dodecagon","11","2"};

//sports
private int sportsPoints[] = {100,200,300,400,500};
private String sportsQuestions[] = {"This swimmer is the most decorated Olympian in history, with a total of 28 medals.",
		"This NBA team is based in Phoenix, Arizona, and currently ranks 5th in the Western Conference.",
		"A womens’ gymnastics all-around competition consists of this number of events.",
		"Arizona State University currently holds a 3-8 win-loss record in this sport.",
		"As one of the strongest nations at this sport, Lithuania often labels it “their second religion”."};
				
private String sportsAnswers[]={"Michael Phelps", "suns", "4", "football", "basketball"};

//CSE terminology
private int cse110Points[] = {100,200,300,400,500};
private String cse110Questions[] = {"This reserved word is used to construct an object of a class.",
		"This IDE component is responsible for translating source code into class files.",
		 "It is good programming etiquette to capitalize this type of variable.",
		 "This term describes the process of providing a public interface but hiding the implementation details in a program.",
		 "In Java, the % symbol has a special name and is used to yield the remainder of integer division."};
		

private String cse110Answers[] = {"new","compiler","constants","encapsulation","modulus"};

//history
private int historyPoints[] = {100,200,300,400,500};
private String historyQuestions[] = {"This country officially secured its independence on July 4th, 1776.",
		"This historical event is considered the largest and most successful slave revolt in the Western Hemisphere.",
		"This nomadic leader ruled the Mongol Empire during its takeover of China in the 1200s."
		,"This period refers to the time in Europe before the Enlightenment in which modern science replaced previously accepted Greek views about the natural world."
		,"This major event refers to the split of the Christian church into the Eastern Orthodox and Roman Catholic sects in 1054."};
		

private String historyAnswers[] = {"USA","Haitian Revolution","Genghis Khan","Scientific Revolution","Great Schism"};



//finds the match index of the point value the user chooses
public int matchIndex(int cat, int pointVal ) //takes the parameters
{
	if (cat==1) //for geography
	{
		String matchVal=Integer.toString(pointVal);
		boolean found=false;
		int match=0;
		for (int i=0;i<geographyPoints.length && !found;i++)
		{
			if (geographyPoints[i]==pointVal)
			{
				found=true;
				index=i;
				
			}
		}
		return index;
	}
	if (cat==2) //for math
	{
		String matchVal=Integer.toString(pointVal);
		boolean found=false;
		int match=0;
		for (int i=0;i<mathematicsPoints.length && !found;i++)
		{
			if (mathematicsPoints[i]==pointVal)
			{
				found=true;
				index=i;
				
			}
		}
		return index;
	}
	if (cat==3) //for sports
	{
		String matchVal=Integer.toString(pointVal);
		boolean found=false;
		int match=0;
		for (int i=0;i<sportsPoints.length && !found;i++)
		{
			if (sportsPoints[i]==pointVal)
			{
				found=true;
				index=i;
				
			}
		}
		return index;
	}
	if (cat==4) //cse110
	{
		String matchVal=Integer.toString(pointVal);
		boolean found=false;
		int match=0;
		for (int i=0;i<cse110Points.length && !found;i++)
		{
			if (cse110Points[i]==pointVal)
			{
				found=true;
				index=i;
				
			}
		}
		return index;
	}
	if (cat==5) //history
	{
		String matchVal=Integer.toString(pointVal);
		boolean found=false;
		int match=0;
		for (int i=0;i<historyPoints.length && !found;i++)
		{
			if (historyPoints[i]==pointVal)
			{
				found=true;
				index=i;
				
			}
		}
		return index;
	}
	else
	{
		return -1;
	}
}


public String retrieveQuestion(int cat, int match) //gets the question to the user
{
	
	if (cat==1) //if geography
	{
		
		return (geographyQuestions[match]);

	}
	if (cat==2)
	{
		return (mathematicsQuestions[match]);

	}
	if (cat==3)
	{
		return (sportsQuestions[match]);

	}
	if (cat==4)
	{
		return (cse110Questions[match]);

	}
	if (cat==5)
	{
		return (historyQuestions[match]);

	}
	else
	{
		return "m";
	}
}

public int checkAnswer(String ans, int cat, int match) //checks the user's answer to see if it is correct vs the right answer
{
	
	if (cat==1)
	{
		if (geographyAnswers[match].equalsIgnoreCase(ans))
		{
			return geographyPoints[match];
		}
		else
		{
			return geographyPoints[match]*-1;
		}
	}
	if (cat==2)
	{
		if (mathematicsAnswers[match].equalsIgnoreCase(ans))
		{
			return mathematicsPoints[match];
		}
		else
		{
			return mathematicsPoints[match]*-1;
		}
	}
	if (cat==3)
	{
		if (sportsAnswers[match].equalsIgnoreCase(ans))
		{
			return sportsPoints[match];
		}
		else
		{
			return sportsPoints[match]*-1;
		}
	}
	if (cat==4)
	{
		if (cse110Answers[match].equalsIgnoreCase(ans))
		{
			return cse110Points[match];
		}
		else
		{
			return cse110Points[match]*-1;
		}
	}
	if (cat==5)
	{
		if (historyAnswers[match].equalsIgnoreCase(ans))
		{
			return historyPoints[match];
		}
		else
		{
			return historyPoints[match]*-1;
		}
	}
	else
	{
		return -1;
	}
}
//
//public void refill()
//{
//	for (int i=0;i<5;i++)
//	{
//		for (int p=100;p<600;p+=100)
//		{
//			geographyPoints[i]=p;
//			mathematicsPoints[i]=p;
//			sportsPoints[i]=p;
//			cse110Points[i]=p;
//			historyPoints[i]=p;
//		}
//	}
//}
public String toString(int cat) //prints the point list as a string

{
	String list="";
	if (cat==1)
	{
		for (int i=0;i<geographyPoints.length;i++)
		{
			list=list+geographyPoints[i]+"\n";
		}
		return list;
	}
	if (cat==2)
	{
		for (int i=0;i<mathematicsPoints.length;i++)
		{
			list=list+mathematicsPoints[i]+"\n";
		}
		return list;
	}
	if (cat==3)
	{
		for (int i=0;i<sportsPoints.length;i++)
		{
			list=list+sportsPoints[i]+"\n";
		}
		return list;
	}
	if (cat==4)
	{
		for (int i=0;i<cse110Points.length;i++)
		{
			list=list+cse110Points[i]+"\n";
		}
		return list;
	}
	if (cat==5)
	{
		for (int i=0;i<historyPoints.length;i++)
		{
			list=list+historyPoints[i]+"\n";
		}
		return list;
	}
	else 
		return "x";
}

public void updatePoints(int cat, int match) //after the question is answered the point value becomes 0
{
	if (cat==1)
	{
		geographyPoints[match]=0;
	}
	if (cat==2)
	{
		mathematicsPoints[match]=0;
	}
	if (cat==3)
	{
		sportsPoints[match]=0;
	}
	if (cat==4)
	{
		cse110Points[match]=0;
	}
	if (cat==5)
	{
		historyPoints[match]=0;
	}
}


	
}

