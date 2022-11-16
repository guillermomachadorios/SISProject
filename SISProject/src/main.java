import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class main{
		   
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
                for(int i=0; i<Roster.roster.size(); i++) {
    				System.out.println((i+1)+". " + Roster.roster.get(i).getName() +" "+ Roster.roster.get(i).getLast() +" "+ Roster.roster.get(i).getGPA() +" "+ Roster.roster.get(i).getPeriodOne() +" "+ Roster.roster.get(i).getGradeOne() +" "+ Roster.roster.get(i).getPeriodTwo() +" "+ Roster.roster.get(i).getGradeTwo() +" "+ Roster.roster.get(i).getPeriodThree() +" "+ Roster.roster.get(i).getGradeThree());
    			}

            }
            else if(menuChoice == 2)
          {
                System.out.println("");
                Collections.sort(Roster.roster, new GPASorter());
                for(int i=0; i<Roster.roster.size(); i++) {
    				System.out.println((i+1)+". " + Roster.roster.get(i).getName() +" "+ Roster.roster.get(i).getLast() +" "+ Roster.roster.get(i).getGPA() +" "+ Roster.roster.get(i).getPeriodOne() +" "+ Roster.roster.get(i).getGradeOne() +" "+ Roster.roster.get(i).getPeriodTwo() +" "+ Roster.roster.get(i).getGradeTwo() +" "+ Roster.roster.get(i).getPeriodThree() +" "+ Roster.roster.get(i).getGradeThree());
    			}
            
        }
            else if(menuChoice == 3)
                {
                      System.out.println("");
                      Collections.sort(Roster.roster, new PeriodSorter());
                      for(int i=0; i<Roster.roster.size(); i++) {
          				System.out.println((i+1)+". " + Roster.roster.get(i).getName() +" "+ Roster.roster.get(i).getLast() +" "+ Roster.roster.get(i).getGPA() +" "+ Roster.roster.get(i).getPeriodOne() +" "+ Roster.roster.get(i).getGradeOne() +" "+ Roster.roster.get(i).getPeriodTwo() +" "+ Roster.roster.get(i).getGradeTwo() +" "+ Roster.roster.get(i).getPeriodThree() +" "+ Roster.roster.get(i).getGradeThree());
          			}
                  
              }
        
		}
}