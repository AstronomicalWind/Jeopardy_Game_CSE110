import java.util.Scanner;

public class Jepardy
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		//intro to game
		System.out.println("*****Welcome to Japrdy!***** \n");
		System.out.println("Enter Player Name: ");
		
		//get the name of player - creat new player object 
		String name = scan.nextLine();
		Player p1 = new Player(name);
		
		System.out.println("------------------------------------------------------"
				+ "\nHi " + name+ " Choose a catagory of questions, then a point value, "
				+ "\nthe higher the point values the harder the question ");
		
		// getting the input 
		String choice;
		char command;
		
		//what amount of point the player chooses 
		int pointChoice =0;
		String userGuess;
		int addPoints;
		

		Boolean rightOrWrong;
		
		//Creat all the questions
		Questions q = new Questions();
		// main menu that handels user errors 
		while ( p1.getPoints()>=0 )
		{
			do {
			
			printMainMenu();
			
			
			
			 choice = scan.next().toLowerCase();
		     command = choice.charAt(0);
		     switch(command)
				{
					case 'a':
					{
					do {
						printPointMenu();
				
						pointChoice = scan.nextInt();
						scan.nextLine();
						
					
						switch(pointChoice)
						{
							case 100:
							{
								//match method - return index of question 
								int match =q.matchIndex(1, pointChoice);
								// print out question 
								System.out.println(q.retrieveQuestion(1, match));
								//ask the user for answer 
								System.out.println("Enter the answer: ");
								userGuess = scan.nextLine();
								
								//determine if answer is right or wrong 
						
								addPoints = q.checkAnswer(userGuess, 1, match);
								System.out.println(addPoints);
								rightOrWrong = q.rightOrWrong(userGuess, 1, match);
								
								// add point to player 1 
								p1.updatePoints(addPoints);
								
								// print next steps depending on answer  
								System.out.println(rightOrWrong);
								
								if (rightOrWrong)
								{
									System.out.println("Congradulations you now have + "+p1.getPoints() + " points");
									
								}
								else 
								{
									System.out.println("This answer is incorrect, - " +pointChoice+ " points "
											+"move on to the next queston: ");
								}
								break;
							}
							case 200:
							{
								//match method - return index of question 
								int match =q.matchIndex(1, pointChoice);
								// print out question 
								System.out.println(q.retrieveQuestion(1, match));
								//ask the user for answer 
								System.out.println("Enter the answer: ");
								userGuess = scan.nextLine();
								
								//determine if answer is right or wrong 
						
								addPoints = q.checkAnswer(userGuess, 1, match);
								System.out.println(addPoints);
								rightOrWrong = q.rightOrWrong(userGuess, 1, match);
								
								// add point to player 1 
								p1.updatePoints(addPoints);
								
								// print next steps depending on answer  
								System.out.println(rightOrWrong);
								
								if (rightOrWrong)
								{
									System.out.println("Congradulations you now have + "+p1.getPoints() + " points");
									
								}
								else 
								{
									System.out.println("This answer is incorrect, - " +pointChoice+ " points "
											+"move on to the next queston: ");
								}
								break;
							}
							case 300:
							{
								System.out.println("This is the question that will be stored in the array ");
								break;
							}
							case 400:
							{
								System.out.println("This is the question that will be stored in the array ");
								break;
							}
							case 500:
							{
								System.out.println("This is the question that will be stored in the array ");
								break;
							}
							default: System.out.println("Invalid input");
						}
						}while(pointChoice != 100 && pointChoice !=200 && pointChoice !=300 && pointChoice != 400 && pointChoice !=500);
					}
						break;
					case 'b':
					{
						do {
							printPointMenu();
					
							pointChoice = scan.nextInt();
							scan.nextLine();
						
							switch(pointChoice)
							{
								case 100:
								{
									System.out.println("This is the question that will be stored in the array ");
									break;
								}
								case 200:
								{
									break;
								}
								case 300:
								{
									break;
								}
								case 400:
								{
									break;
								}
								case 500:
								{	
									break;
								}
								default: System.out.println("Invalid input");
							}
							}while(pointChoice != 100 && pointChoice !=200 && pointChoice !=300 && pointChoice != 400 && pointChoice !=500);
						break;
					}
					case 'c':
					{
						do {
							printPointMenu();
						
							pointChoice = scan.nextInt();
							scan.nextLine();
						
							switch(pointChoice)
							{
								case 100:
								{
									System.out.println("This is the question that will be stored in the array ");
									break;
								}
								case 200:
								{
									break;
								}
								case 300:
								{
									break;
								}
								case 400:
								{
									break;
								}
								case 500:
								{
									break;
								}
								default: System.out.println("Invalid input");
							}
							}while(pointChoice != 100 && pointChoice !=200 && pointChoice !=300 && pointChoice != 400 && pointChoice !=500);
						break;
					}
					case 'd': 
					{
						do {
							printPointMenu();
						
							pointChoice = scan.nextInt();
							scan.nextLine();
						
							switch(pointChoice)
							{
								case 100:
								{
									System.out.println("This is the question that will be stored in the array ");
									break;
								}
								case 200:
								{
									break;
								}
								case 300:
								{
									break;
								}
								case 400:
								{	
									break;
								}
								case 500:
								{
									break;
								}
								default: System.out.println("Invalid input");
							}
							}while(pointChoice != 100 && pointChoice !=200 && pointChoice !=300 && pointChoice != 400 && pointChoice !=500);
						break;
					}
					case 'e':
					{
						do {
							printPointMenu();
					
							pointChoice = scan.nextInt();
							scan.nextLine();
						
							switch(pointChoice)
							{
								case 100:
								{
									System.out.println("This is the question that will be stored in the array ");
									break;
								}
								case 200:
								{
									break;
								}
								case 300:
								{
									break;
								}
								case 400:
								{
									break;
								}
								case 500:
								{
									break;
								}
								default: System.out.println("Invalid input");
							}
							}while(pointChoice != 100 && pointChoice !=200 && pointChoice !=300 && pointChoice != 400 && pointChoice !=500);
						break;
						
						}
					case 'q' :
					{
						break;
					}
					default: System.out.println("Invalid input");
				}
			}while (command !='a' && command != 'b' && command != 'c' && command != 'd' && command !='e' && command!='q');
		}
	}
		

	  public static void printMainMenu()
	   {
	    System.out.print(""+
	    		"\na: Georgraphy "
	    		+"\nb: Mathamatics"
	    		+"\nc: Sports"
	    		+"\nd: CSE Terminology"
	    		+"\ne: World History"
	    		+"\nq: Quit Game"
	    		);
	              
	    } // end of the printMenu method
	  
	  public static void printPointMenu()
	  {
		  System.out.println("\nChoose a point value \n"+
		  		"100: "
				+"\n200: "
		  		+"\n300: "
				+"\n400: "
		  		+"\n500: ");
	  }
	  public static void funtionMenu()
	  {
		  
	  }

}

