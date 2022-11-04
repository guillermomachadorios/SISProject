import java.util.Scanner;

public class Menu {

	static Scanner userStringInput = new Scanner(System.in);
	static String pause = "";
	
	public static void main(String[] args) {
		
		System.out.println("PRESS KEY");
		pause = userStringInput.nextLine();
		System.out.println("GENERATING LIST");
		pause = userStringInput.nextLine();
		
		boolean ask = true;
		
		while(ask) {
			
			Scanner userIntInput = new Scanner(System.in);
	        System.out.println("What would you like to do?");
			System.out.println("1. ADD or DELETE a student");
			System.out.println("2. CHANGE students grades or schedules");
			System.out.println("3. SORT students");
			int answer = userIntInput.nextInt();

			if(answer == 1) {
				
				ask = false;
				System.out.println("Add/delete");
				//add/delete();
			}else if(answer == 2) {
				
				ask = false;
				System.out.println("Grade/schedule");
				//grades/schedule();
			}else if(answer == 3) {
				
				ask = false;
				//
				System.out.println("sort");
				//sort();
			}else {
				
				System.out.println("Please chose a valid answer.");
				ask = true;
			}
		}

	}

}