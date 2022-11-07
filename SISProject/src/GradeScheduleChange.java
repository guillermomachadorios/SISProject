import java.util.Scanner;

public class GradeScheduleChange
	{
		static Scanner userIntInput = new Scanner(System.in);
		static Scanner userStringInput = new Scanner(System.in);
		static int choice = 0;
		
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
			Student evan = new Student ("evan", "limani", 2.00, "english", "B", "math", "B-", "science", "C+");
			String gradeChange = "";
			System.out.println("Who's grade would you like to change?");
			System.out.println("1. " + evan.getName() +" "+ evan.getLast() +" "+ evan.getGPA() +" "+ evan.getPeriodOne() +" "+ evan.getGradeOne() +" "+ evan.getPeriodTwo() +" "+ evan.getGradeTwo() +" "+ evan.getPeriodThree() +" "+ evan.getGradeThree());
			choice = userIntInput.nextInt();
			System.out.println("Choose a grade to change.");
			System.out.println("   1) " + evan.getPeriodOne() + " " + evan.getGradeOne() + "\n   2) "+ evan.getPeriodTwo() + " " + evan.getGradeTwo() +"\n   3) "+ evan.getPeriodThree() + " " + evan.getGradeThree());
			choice = userIntInput.nextInt();
			if(choice==1) {
				System.out.println("Current grade for " + evan.getPeriodOne() + ": "+ evan.getGradeOne());
				System.out.println("What would you like to change it to?");
				gradeChange = userStringInput.nextLine();
				gradeChange = gradeChange.toUpperCase();
				evan.setGradeOne(gradeChange);
				System.out.println(evan.getName() +" "+ evan.getLast()+"'s current grade for " + evan.getPeriodOne() + " is now "+ evan.getGradeOne() + ".");
			} else if(choice==2) {
				System.out.println("Current grade for " + evan.getPeriodTwo() + ": "+ evan.getGradeTwo());
				System.out.println("What would you like to change it to?");
				gradeChange = userStringInput.nextLine();
				gradeChange = gradeChange.toUpperCase();
				evan.setGradeTwo(gradeChange);
				System.out.println(evan.getName() +" "+ evan.getLast()+"'s current grade for " + evan.getPeriodTwo() + " is now "+ evan.getGradeTwo() + ".");
			} else if(choice==3) {
				System.out.println("Current grade for " + evan.getPeriodThree() + ": "+ evan.getGradeThree());
				System.out.println("What would you like to change it to?");
				gradeChange = userStringInput.nextLine();
				gradeChange = gradeChange.toUpperCase();
				evan.setGradeThree(gradeChange);
				System.out.println(evan.getName() +" "+ evan.getLast()+"'s current grade for " + evan.getPeriodThree() + " is now "+ evan.getGradeThree() + ".");
			}
		}
		
		public static void scheduleChanger() {
			Student evan = new Student ("evan", "limani", 2.00, "english", "b", "math", "b", "science", "c");
			String scheduleChange = "";
			System.out.println("Who's schedule would you like to change?");
			System.out.println("1. " + evan.getName() +" "+ evan.getLast() +" "+ evan.getGPA() +" "+ evan.getPeriodOne() +" "+ evan.getGradeOne() +" "+ evan.getPeriodTwo() +" "+ evan.getGradeTwo() +" "+ evan.getPeriodThree() +" "+ evan.getGradeThree());
			choice = userIntInput.nextInt();
			System.out.println("Choose a period to swap.");
			System.out.println("   1) " + evan.getPeriodOne() + "\n   2) "+ evan.getPeriodTwo() + "\n   3) " + evan.getPeriodThree());
			choice = userIntInput.nextInt();
			if(choice==1) {
				scheduleChange = evan.getPeriodOne();
				System.out.println("What period would you like to swap it with?");
				System.out.println("   1) "+ evan.getPeriodTwo() + "\n   2) " + evan.getPeriodThree());
				choice = userIntInput.nextInt();
				if(choice==1) {
					evan.setPeriodOne(evan.getPeriodTwo());
					evan.setPeriodTwo(scheduleChange);
					System.out.println(evan.getName() +" "+ evan.getLast()+"'s schedule is now:");
					System.out.println("   1) " + evan.getPeriodOne() + "\n   2) "+ evan.getPeriodTwo() + "\n   3) " + evan.getPeriodThree());
				} else if(choice==2){
					evan.setPeriodOne(evan.getPeriodThree());
					evan.setPeriodThree(scheduleChange);
					System.out.println(evan.getName() +" "+ evan.getLast()+"'s schedule is now:");
					System.out.println("   1) " + evan.getPeriodOne() + "\n   2) "+ evan.getPeriodTwo() + "\n   3) " + evan.getPeriodThree());
				}
			} else if(choice==2) {
				scheduleChange = evan.getPeriodTwo();
				System.out.println("What period would you like to swap it with?");
				System.out.println("   1) "+ evan.getPeriodOne() + "\n   2) " + evan.getPeriodThree());
				choice = userIntInput.nextInt();
				if(choice==1) {
					evan.setPeriodTwo(evan.getPeriodOne());
					evan.setPeriodOne(scheduleChange);
					System.out.println(evan.getName() +" "+ evan.getLast()+"'s schedule is now:");
					System.out.println("   1) " + evan.getPeriodOne() + "\n   2) "+ evan.getPeriodTwo() + "\n   3) " + evan.getPeriodThree());
				} else if(choice==2){
					evan.setPeriodTwo(evan.getPeriodThree());
					evan.setPeriodThree(scheduleChange);
					System.out.println(evan.getName() +" "+ evan.getLast()+"'s schedule is now:");
					System.out.println("   1) " + evan.getPeriodOne() + "\n   2) "+ evan.getPeriodTwo() + "\n   3) " + evan.getPeriodThree());
				}
			} else if(choice==3) {
				scheduleChange = evan.getPeriodThree();
				System.out.println("What period would you like to swap it with?");
				System.out.println("   1) "+ evan.getPeriodOne() + "\n   2) " + evan.getPeriodTwo());
				choice = userIntInput.nextInt();
				if(choice==1) {
					evan.setPeriodThree(evan.getPeriodOne());
					evan.setPeriodOne(scheduleChange);
					System.out.println(evan.getName() +" "+ evan.getLast()+"'s schedule is now:");
					System.out.println("   1) " + evan.getPeriodOne() + "\n   2) "+ evan.getPeriodTwo() + "\n   3) " + evan.getPeriodThree());
				} else if(choice==2){
					evan.setPeriodThree(evan.getPeriodTwo());
					evan.setPeriodTwo(scheduleChange);
					System.out.println(evan.getName() +" "+ evan.getLast()+"'s schedule is now:");
					System.out.println("   1) " + evan.getPeriodOne() + "\n   2) "+ evan.getPeriodTwo() + "\n   3) " + evan.getPeriodThree());
				}
			}
		}
	}
