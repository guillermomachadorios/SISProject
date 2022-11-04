import java.util.Scanner;

public class GradeScheduleChange
	{
		static Scanner userIntInput = new Scanner(System.in);
		static int choice = 0;
		
		public static void main(String[] args){
			System.out.println("Change Student's Grades/Schedule\n   1) Change Grades\n   2) Switch Classes");
			choice = userIntInput.nextInt();
			if(choice==1) {
				gradeChanger();
			} else if(choice==2) {
				scheduleChanger();
			}			
		}
		
		public static void gradeChanger() {
			System.out.println("Who's grade would you like to change?");
			System.out.println("(pretend display of all the students is here)");
			choice = userIntInput.nextInt();
		}
		
		public static void scheduleChanger() {
			System.out.println("Who's schedule would you like to change?");
			System.out.println("(pretend display of all the students is here)");
			choice = userIntInput.nextInt();
		}
	}
