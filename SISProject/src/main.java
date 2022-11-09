import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class main{

		public static void main(String[] args) 
			{		
			 
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
                Collections.sort(Students, new NameSorter());

            }
            else if(menuChoice == 2)
          {
                System.out.println("");
                Collections.sort(Students, new GPASorter());

            
        }
            else if(menuChoice == 3)
                {
                      System.out.println("");
                      Collections.sort(Students, new PeriodSorter());
                      System.out.println(" ");
                  
              }
        
		}
}