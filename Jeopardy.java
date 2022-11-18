import java.util.Scanner;

public class Jepardy
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*****Welcome to Japrdy!***** \n");
		System.out.println("Enter Player Name: ");
		
		String name = scan.nextLine();
		
		String choice;
		char command;
		
		int pointChoice =0;
		
		do {
		printMainMenu();
		System.out.println("\nChoose a Topic \n");
	
		
		  choice = scan.next().toLowerCase();
	      command = choice.charAt(0);
	  	//Player p1 = new Player (name,);
		
			switch(command)
			{
				case 'a':
				{
				do {
					printPointMenu();
					System.out.println("Choose a point value \n");
					pointChoice = scan.nextInt();
				
					switch(pointChoice)
					{
						case 100:
						{
							System.out.println("This is the question that will be stored in the array ");
							break;
						}
						case 200:
						{
							System.out.println("This is the question that will be stored in the array ");
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
						System.out.println("Choose a point value \n");
						pointChoice = scan.nextInt();
					
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
						System.out.println("Choose a point value \n");
						pointChoice = scan.nextInt();
					
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
						System.out.println("Choose a point value \n");
						pointChoice = scan.nextInt();
					
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
						System.out.println("Choose a point value \n");
						pointChoice = scan.nextInt();
					
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
			
					
				default: System.out.println("Invalid input");
			}
			}while (command !='a' && command != 'b' && command != 'c' && command != 'd' && command !='e');
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
	  
	  public static void printPointMenu()
	  {
		  System.out.println(
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
