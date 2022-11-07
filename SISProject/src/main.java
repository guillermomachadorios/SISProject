import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class main{
<<<<<<< HEAD

		public static void main(String[] args)
			{
			
=======
		public static void main(String[] args)
			{		
				System.out.println("yahoo");
				System.out.println("iowhiorgq");
				System.out.println("dog");
				System.out.println("What up shlat");
>>>>>>> branch 'master' of https://github.com/guillermomachadorios/SISProject.git
			}
      
		public static void sorting() 
		{
			System.out.println("How would you like to sort the student?");
            System.out.println("(1) Name");
            System.out.println("(2) GPA");
       
          
            
            Scanner userInput = new Scanner(System.in);
            int menuChoice = userInput.nextInt();

            if(menuChoice == 1)
            {
                System.out.println("");
                Collections.sort(Students, new nameSorter());

            }
            else if(menuChoice == 2)
          {
                System.out.println("");
                Collections.sort(Students, new GPASorter());

            
        }
        
		}
}
