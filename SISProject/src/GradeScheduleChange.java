import java.util.Scanner;

public class GradeScheduleChange
	{
		static Scanner userIntInput = new Scanner(System.in);
		static Scanner userStringInput = new Scanner(System.in);
		static int choice = 0;
		static int studentChoice = 0;
		
		public static void main(String[] args){
			System.out.println("");
			System.out.println("Change Student's Grades/Schedule\n   1) Change Grades\n   2) Switch Classes");
			choice = userIntInput.nextInt();
			if(choice==1) {
				gradeChanger();
			} else if(choice==2) {
				scheduleChanger();
			}			
		}
		
		public static void gradeChanger() {
			String gradeChange = "";
			System.out.println("Who's grade would you like to change?");
			for(int i=0; i<Roster.roster.size(); i++) {
				System.out.println((i+1)+". " + Roster.roster.get(i).getName() +" "+ Roster.roster.get(i).getLast() +" "+ Roster.roster.get(i).getGPA() +" "+ Roster.roster.get(i).getPeriodOne() +" "+ Roster.roster.get(i).getGradeOne() +" "+ Roster.roster.get(i).getPeriodTwo() +" "+ Roster.roster.get(i).getGradeTwo() +" "+ Roster.roster.get(i).getPeriodThree() +" "+ Roster.roster.get(i).getGradeThree());
			}			
			studentChoice = userIntInput.nextInt()-1;
			System.out.println("Choose a grade to change.");
			System.out.println("   1) " + Roster.roster.get(studentChoice).getPeriodOne() + " " + Roster.roster.get(studentChoice).getGradeOne() + "\n   2) "+ Roster.roster.get(studentChoice).getPeriodTwo() + " " + Roster.roster.get(studentChoice).getGradeTwo() +"\n   3) "+ Roster.roster.get(studentChoice).getPeriodThree() + " " + Roster.roster.get(studentChoice).getGradeThree());
			choice = userIntInput.nextInt();
			if(choice==1) {
				System.out.println("Current grade for " + Roster.roster.get(studentChoice).getPeriodOne() + ": "+ Roster.roster.get(studentChoice).getGradeOne());
				System.out.println("What would you like to change it to?");
				gradeChange = userStringInput.nextLine();
				gradeChange = gradeChange.toUpperCase();
				Roster.roster.get(studentChoice).setGradeOne(gradeChange);
				System.out.println(Roster.roster.get(studentChoice).getName() +" "+ Roster.roster.get(studentChoice).getLast()+"'s current grade for " + Roster.roster.get(studentChoice).getPeriodOne() + " is now "+ Roster.roster.get(studentChoice).getGradeOne() + ".");
			} else if(choice==2) {
				System.out.println("Current grade for " + Roster.roster.get(studentChoice).getPeriodTwo() + ": "+ Roster.roster.get(studentChoice).getGradeTwo());
				System.out.println("What would you like to change it to?");
				gradeChange = userStringInput.nextLine();
				gradeChange = gradeChange.toUpperCase();
				Roster.roster.get(studentChoice).setGradeTwo(gradeChange);
				System.out.println(Roster.roster.get(studentChoice).getName() +" "+ Roster.roster.get(studentChoice).getLast()+"'s current grade for " + Roster.roster.get(studentChoice).getPeriodTwo() + " is now "+ Roster.roster.get(studentChoice).getGradeTwo() + ".");
			} else if(choice==3) {
				System.out.println("Current grade for " + Roster.roster.get(studentChoice).getPeriodThree() + ": "+ Roster.roster.get(studentChoice).getGradeThree());
				System.out.println("What would you like to change it to?");
				gradeChange = userStringInput.nextLine();
				gradeChange = gradeChange.toUpperCase();
				Roster.roster.get(studentChoice).setGradeThree(gradeChange);
				System.out.println(Roster.roster.get(studentChoice).getName() +" "+ Roster.roster.get(studentChoice).getLast()+"'s current grade for " + Roster.roster.get(studentChoice).getPeriodThree() + " is now "+ Roster.roster.get(studentChoice).getGradeThree() + ".");
			}
		}
		
		public static void scheduleChanger() {
			String scheduleChange = "";
			System.out.println("Who's schedule would you like to change?");
			for(int i=0; i<Roster.roster.size(); i++) {
				System.out.println((i+1)+". " + Roster.roster.get(i).getName() +" "+ Roster.roster.get(i).getLast() +" "+ Roster.roster.get(i).getGPA() +" "+ Roster.roster.get(i).getPeriodOne() +" "+ Roster.roster.get(i).getGradeOne() +" "+ Roster.roster.get(i).getPeriodTwo() +" "+ Roster.roster.get(i).getGradeTwo() +" "+ Roster.roster.get(i).getPeriodThree() +" "+ Roster.roster.get(i).getGradeThree());
			}
			studentChoice = userIntInput.nextInt()-1;
			System.out.println("Choose a period to swap.");
			System.out.println("   1) " + Roster.roster.get(studentChoice).getPeriodOne() + "\n   2) "+ Roster.roster.get(studentChoice).getPeriodTwo() + "\n   3) " + Roster.roster.get(studentChoice).getPeriodThree());
			choice = userIntInput.nextInt();
			if(choice==1) {
				scheduleChange = Roster.roster.get(studentChoice).getPeriodOne();
				System.out.println("What period would you like to swap it with?");
				System.out.println("   1) "+ Roster.roster.get(studentChoice).getPeriodTwo() + "\n   2) " + Roster.roster.get(studentChoice).getPeriodThree());
				choice = userIntInput.nextInt();
				if(choice==1) {
					Roster.roster.get(studentChoice).setPeriodOne(Roster.roster.get(studentChoice).getPeriodTwo());
					Roster.roster.get(studentChoice).setPeriodTwo(scheduleChange);
					System.out.println(Roster.roster.get(studentChoice).getName() +" "+ Roster.roster.get(studentChoice).getLast()+"'s schedule is now:");
					System.out.println("   1) " + Roster.roster.get(studentChoice).getPeriodOne() + "\n   2) "+ Roster.roster.get(studentChoice).getPeriodTwo() + "\n   3) " + Roster.roster.get(studentChoice).getPeriodThree());
				} else if(choice==2){
					Roster.roster.get(studentChoice).setPeriodOne(Roster.roster.get(studentChoice).getPeriodThree());
					Roster.roster.get(studentChoice).setPeriodThree(scheduleChange);
					System.out.println(Roster.roster.get(studentChoice).getName() +" "+ Roster.roster.get(studentChoice).getLast()+"'s schedule is now:");
					System.out.println("   1) " + Roster.roster.get(studentChoice).getPeriodOne() + "\n   2) "+ Roster.roster.get(studentChoice).getPeriodTwo() + "\n   3) " + Roster.roster.get(studentChoice).getPeriodThree());
				}
			} else if(choice==2) {
				scheduleChange = Roster.roster.get(studentChoice).getPeriodTwo();
				System.out.println("What period would you like to swap it with?");
				System.out.println("   1) "+ Roster.roster.get(studentChoice).getPeriodOne() + "\n   2) " + Roster.roster.get(studentChoice).getPeriodThree());
				choice = userIntInput.nextInt();
				if(choice==1) {
					Roster.roster.get(studentChoice).setPeriodTwo(Roster.roster.get(studentChoice).getPeriodOne());
					Roster.roster.get(studentChoice).setPeriodOne(scheduleChange);
					System.out.println(Roster.roster.get(studentChoice).getName() +" "+ Roster.roster.get(studentChoice).getLast()+"'s schedule is now:");
					System.out.println("   1) " + Roster.roster.get(studentChoice).getPeriodOne() + "\n   2) "+ Roster.roster.get(studentChoice).getPeriodTwo() + "\n   3) " + Roster.roster.get(studentChoice).getPeriodThree());
				} else if(choice==2){
					Roster.roster.get(studentChoice).setPeriodTwo(Roster.roster.get(studentChoice).getPeriodThree());
					Roster.roster.get(studentChoice).setPeriodThree(scheduleChange);
					System.out.println(Roster.roster.get(studentChoice).getName() +" "+ Roster.roster.get(studentChoice).getLast()+"'s schedule is now:");
					System.out.println("   1) " + Roster.roster.get(studentChoice).getPeriodOne() + "\n   2) "+ Roster.roster.get(studentChoice).getPeriodTwo() + "\n   3) " + Roster.roster.get(studentChoice).getPeriodThree());
				}
			} else if(choice==3) {
				scheduleChange = Roster.roster.get(studentChoice).getPeriodThree();
				System.out.println("What period would you like to swap it with?");
				System.out.println("   1) "+ Roster.roster.get(studentChoice).getPeriodOne() + "\n   2) " + Roster.roster.get(studentChoice).getPeriodTwo());
				choice = userIntInput.nextInt();
				if(choice==1) {
					Roster.roster.get(studentChoice).setPeriodThree(Roster.roster.get(studentChoice).getPeriodOne());
					Roster.roster.get(studentChoice).setPeriodOne(scheduleChange);
					System.out.println(Roster.roster.get(studentChoice).getName() +" "+ Roster.roster.get(studentChoice).getLast()+"'s schedule is now:");
					System.out.println("   1) " + Roster.roster.get(studentChoice).getPeriodOne() + "\n   2) "+ Roster.roster.get(studentChoice).getPeriodTwo() + "\n   3) " + Roster.roster.get(studentChoice).getPeriodThree());
				} else if(choice==2){
					Roster.roster.get(studentChoice).setPeriodThree(Roster.roster.get(studentChoice).getPeriodTwo());
					Roster.roster.get(studentChoice).setPeriodTwo(scheduleChange);
					System.out.println(Roster.roster.get(studentChoice).getName() +" "+ Roster.roster.get(studentChoice).getLast()+"'s schedule is now:");
					System.out.println("   1) " + Roster.roster.get(studentChoice).getPeriodOne() + "\n   2) "+ Roster.roster.get(studentChoice).getPeriodTwo() + "\n   3) " + Roster.roster.get(studentChoice).getPeriodThree());
				}
			}
		}
	}
