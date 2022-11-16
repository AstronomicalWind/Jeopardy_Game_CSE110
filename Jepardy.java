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
		
		int pointChoice ;
		
		
		printMainMenu();
		System.out.println("\nChoose a Topic \n");
	
		
		  choice = scan.next().toLowerCase();
	       command = choice.charAt(0);
		
		switch(command)
		{
			case 'a':
			{
				System.out.println("Choose a point value \n");
				printPointMenu();
				pointChoice = scan.nextInt();
				
				switch(pointChoice)
				{
					case 100:
						System.out.println("This is the question that will be stored in the array ");
						
					break;
					
				}
				break;
			
			}
				
				
				
		}
		
		
		
		 
		
		//Player p1 = new Player (name,);
		
		
		
		
	}
	
	  public static void printMainMenu()
	   {
	    System.out.print(
	    		"\nA: Georgraphy "
	    		+"\nB: Mathamatics"
	    		+"\nC: Sports"
	    		+"\nD: CSE Terminology"
	    		+"\nE: World History+\n");
	              
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

}
