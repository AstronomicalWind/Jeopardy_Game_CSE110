/**
Dylan Bealey, Arnav Limaye, Peter Rooney, Diya Sankla
CSE 110
Farideh Tadayon-Navabi
20 November 2022

 */

import java.util.Scanner;

public class Jeopardy
{
//false means player1's turn
//true means player2's turn
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		Questions question = new Questions();
		System.out.println("*****Welcome to Jeopardy!***** \n");
		System.out.println("Enter Player 1 Name: ");
		String name = scan.nextLine(); //takes first player's name
		Player player1= new Player(name);
		player1.assignPlayer1(name);
		System.out.println("Enter Player 2 Name: ");
		name = scan.nextLine(); //takes second player's name
		Player player2= new Player(name);
		player2.assignPlayer2(name);
		System.out.print(player1.toString()+"'s turn"); //p1 goes first
		String choice;
		char command; //checks the user's input
		int turn=1; //variable to determine turn
		boolean clock=false; //goes back to main menu
		int pointChoice =0;
		
		do {
		
		printMainMenu();
		System.out.println("\nChoose a Topic \n");
	
		//checks to see what topic player chooses
		  choice = scan.next().toLowerCase();
	      command = choice.charAt(0);
	      clock=true;
	  	//Player p1 = new Player (name,);
		
			switch(command)
			{
				case 'a':
				{
				do {
					//printPointMenu();
					System.out.println(question.toString(1));
					System.out.println("Choose a point value \n");
					pointChoice = scan.nextInt();
					
					//input validations
					}while(pointChoice != 100 && pointChoice !=200 && pointChoice !=300 && pointChoice != 400 && pointChoice !=500);
				}
				int cat=1; //if they choose geography
				int pointVal=pointChoice;
				System.out.println(question.retrieveQuestion(cat,question.matchIndex(cat, pointVal))); //pulls up the question 
				                                                                                       //correlated with point val
				//System.out.println(question.matchIndex(cat, pointVal)); 
				String input=scan.nextLine();
				String answer = scan.nextLine();
				//checks the answer to see if its correct or not
				int point=question.checkAnswer(answer,cat,question.matchIndex(cat, pointVal));
				//checks the point value
				System.out.println(question.checkAnswer(answer,cat,question.matchIndex(cat, pointVal))); 
				//if answer is correct update points
				question.updatePoints(cat, question.matchIndex(cat, pointVal));
				turn=player1.getTurn();
				
				
				if (turn==1)
				{
					player1.addPoints(point);
				}
				else if (turn==-1)
				{
					player2.addPoints(point);
					System.out.println("turn2");
				}
				player1.determineTurn(point);
				clock=false;
					break;
			
				case 'b':
				{
					do {
						//printPointMenu();
						System.out.println(question.toString(2));
						System.out.println("Choose a point value \n");
						pointChoice = scan.nextInt();
						
						
						}while(pointChoice != 100 && pointChoice !=200 && pointChoice !=300 && pointChoice != 400 && pointChoice !=500);
					}
					 cat=2;
					 pointVal=pointChoice;
					System.out.println(question.retrieveQuestion(cat,question.matchIndex(cat, pointVal)));
					//System.out.println(question.matchIndex(cat, pointVal));
					answer = scan.next();
					System.out.println(question.checkAnswer(answer,cat,question.matchIndex(cat, pointVal)));
					point=question.checkAnswer(answer,cat,question.matchIndex(cat, pointVal));
					question.updatePoints(cat, question.matchIndex(cat, pointVal));
					
					turn=player1.getTurn();
					if (turn==1)
					{
						player1.addPoints(point);
					}
					else if (turn==-1)
					{
						player2.addPoints(point);
					}
					player1.determineTurn(point);
					clock=false;
						break;
				
				
				case 'c':
				{
					do {
						//printPointMenu();
						System.out.println(question.toString(3));
						System.out.println("Choose a point value \n");
						pointChoice = scan.nextInt();
						
						
						}while(pointChoice != 100 && pointChoice !=200 && pointChoice !=300 && pointChoice != 400 && pointChoice !=500);
					}
					 cat=3;
					 pointVal=pointChoice;
					System.out.println(question.retrieveQuestion(cat,question.matchIndex(cat, pointVal)));
					//System.out.println(question.matchIndex(cat, pointVal));
					input=scan.nextLine();
					answer = scan.nextLine();
					System.out.println(question.checkAnswer(answer,cat,question.matchIndex(cat, pointVal)));
					point=question.checkAnswer(answer,cat,question.matchIndex(cat, pointVal));
					question.updatePoints(cat, question.matchIndex(cat, pointVal));
					
					turn=player1.getTurn();
					if (turn==1)
					{
						player1.addPoints(point);
					}
					else if (turn==-1)
					{
						player2.addPoints(point);
					}
					player1.determineTurn(point);
					clock=false;
					break;
				case 'd': 
				{
					do {
						//printPointMenu();
						System.out.println(question.toString(4));
						System.out.println("Choose a point value \n");
						pointChoice = scan.nextInt();
						
						
						}while(pointChoice != 100 && pointChoice !=200 && pointChoice !=300 && pointChoice != 400 && pointChoice !=500);
					}
					 cat=4;
					 pointVal=pointChoice;
					System.out.println(question.retrieveQuestion(cat,question.matchIndex(cat, pointVal)));
					//System.out.println(question.matchIndex(cat, pointVal));
					answer = scan.next();
					System.out.println(question.checkAnswer(answer,cat,question.matchIndex(cat, pointVal)));
					point=question.checkAnswer(answer,cat,question.matchIndex(cat, pointVal));
					question.updatePoints(cat, question.matchIndex(cat, pointVal));
					
					turn=player1.getTurn();
					if (turn==1)
					{
						player1.addPoints(point);
					}
					else if (turn==-1)
					{
						player2.addPoints(point);
					}
					player1.determineTurn(point);
					clock=false;
						break;
				case 'e':
				{
					do {
						//printPointMenu();
						System.out.println(question.toString(5));
						System.out.println("Choose a point value \n");
						pointChoice = scan.nextInt();
						
						
						}while(pointChoice != 100 && pointChoice !=200 && pointChoice !=300 && pointChoice != 400 && pointChoice !=500);
					}
					 cat=5;
					 pointVal=pointChoice;
					System.out.println(question.retrieveQuestion(cat,question.matchIndex(cat, pointVal)));					//System.out.println(question.matchIndex(cat, pointVal));
					input=scan.nextLine();
					answer = scan.nextLine();
					System.out.println(question.checkAnswer(answer,cat,question.matchIndex(cat, pointVal)));
					point=question.checkAnswer(answer,cat,question.matchIndex(cat, pointVal));
					question.updatePoints(cat, question.matchIndex(cat, pointVal));
					
					turn=player1.getTurn();
					if (turn==1)
					{
						player1.addPoints(point);
					}
					else if (turn==-1)
					{
						player2.addPoints(point);
					}
					player1.determineTurn(point);
					clock=false;
					break;
					
				case 'p': //displays score
				{
					System.out.println(player1.toString()+": "+player1.returnScore());
					System.out.println(player2.toString()+": "+player2.returnScore());
					break;
				}
					
			
					
				default: System.out.println("Invalid input");
			}
			}while (command !='a' && command != 'b' && command != 'c' && command != 'd' && command !='e'|| !clock);
		}
		

	  private static void printMainMenu() //prints the menu out
	   {
	    System.out.print(
	    		"\na: Geography "
	    		+"\nb: Mathematics"
	    		+"\nc: Sports"
	    		+"\nd: CSE Terminology"
	    		+"\ne: World History"
	    		+"\np: View Score"
	    		);
	              
	    } // end of the printMenu method
	  

	  
//	  public static void printPointMenu()
//	  {
//		  System.out.println(
//		  		"100: "
//				+"\n200: "
//		  		+"\n300: "
//				+"\n400: "
//		  		+"\n500: ");
//	  }
	 

}
