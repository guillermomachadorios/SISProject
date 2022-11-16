import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class main{
		public static void main(String[] args)
			{		
				System.out.println("yahoo");
				System.out.println("iowhiorgq");
				System.out.println("dog");
				System.out.println("What up shlat");
			}
      
		public static void sorting() 
		{
			System.out.println("How would you like to sort the student?");
            System.out.println("   1) Name");
            System.out.println("   2) GPA");
            System.out.println("   3) Period");
       
          
            
            Scanner userInput = new Scanner(System.in);
            int menuChoice = userInput.nextInt();

            if(menuChoice == 1)
            {
                System.out.println("");
                Collections.sort(Roster.roster, new NameSorter());

            }
            else if(menuChoice == 2)
          {
                System.out.println("");
                Collections.sort(Roster.roster, new GPASorter());

            
        }
            else if(menuChoice == 3)
                {
                      System.out.println("");
                      Collections.sort(Roster.roster, new PeriodSorter());
                      System.out.println(" ");
                  
              }
        
		}
}