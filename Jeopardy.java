import java.util.Scanner;

public class Jeopardy
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		Questions question = new Questions();
		System.out.println("*****Welcome to Jeopardy!***** \n");
		System.out.println("Enter Player Name: ");
		
		String name = scan.nextLine();
		
		String choice;
		char command;
		boolean clock=false;
		int pointChoice =0;
		
		do {
		printMainMenu();
		System.out.println("\nChoose a Topic \n");
	
		
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
					
					
					}while(pointChoice != 100 && pointChoice !=200 && pointChoice !=300 && pointChoice != 400 && pointChoice !=500);
				}
				int cat=1;
				int pointVal=pointChoice;
				System.out.println(question.retrieveQuestion(cat,question.matchIndex(cat, pointVal)));
				//System.out.println(question.matchIndex(cat, pointVal));
				String answer = scan.next();
				System.out.println(question.checkAnswer(answer,cat,question.matchIndex(cat, pointVal)));
				question.updatePoints(cat, question.matchIndex(cat, pointVal));
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
					question.updatePoints(cat, question.matchIndex(cat, pointVal));
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
					String input=scan.nextLine();
					answer = scan.nextLine();
					System.out.println(answer);
					System.out.println(question.checkAnswer(answer,cat,question.matchIndex(cat, pointVal)));
					question.updatePoints(cat, question.matchIndex(cat, pointVal));
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
					question.updatePoints(cat, question.matchIndex(cat, pointVal));
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
					System.out.println(answer);
					System.out.println(question.checkAnswer(answer,cat,question.matchIndex(cat, pointVal)));
					question.updatePoints(cat, question.matchIndex(cat, pointVal));
					clock=false;
					break;
					
					
			
					
				default: System.out.println("Invalid input");
			}
			}while (command !='a' && command != 'b' && command != 'c' && command != 'd' && command !='e'|| !clock);
		}
		

	  public static void printMainMenu()
	   {
	    System.out.print(
	    		"\na: Georgraphy "
	    		+"\nb: Mathamatics"
	    		+"\nc: Sports"
	    		+"\nd: CSE Terminology"
	    		+"\ne: World History"
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
	  public static void funtionMenu()
	  {
		  
	  }

}
