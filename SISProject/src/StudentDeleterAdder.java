import java.text.DecimalFormat;
import java.util.Scanner;

public class StudentDeleterAdder {
	static DecimalFormat d = new DecimalFormat("0.00");   
	static Scanner userIntInput = new Scanner(System.in);
	static Scanner userStringInput = new Scanner(System.in);
	static int choice = 0;
	static int studentChoice = 0;

	public static void main(String[] args) {
		System.out.println("");
		System.out.println("What would you like to do?\n   1) Add Student\n   2) Delete Student");
		choice = userIntInput.nextInt();
		if (choice==1) {
			studentAdder();
		} else if(choice==2) {
			studentDeleter();
		}
	}
	
	public static void studentAdder() {
		double gpa=0;
		System.out.println("What's the first name of the student?");
		String firstName = userStringInput.nextLine();
		System.out.println("Last name?");
		String lastName = userStringInput.nextLine();
		System.out.println("First period?");
		String periodOne = userStringInput.nextLine();
		System.out.println("Grade for that period?");
		String gradeOne = userStringInput.nextLine();
		System.out.println("Second period?");
		String periodTwo = userStringInput.nextLine();
		System.out.println("Grade for that period?");
		String gradeTwo = userStringInput.nextLine();
		System.out.println("Third period?");
		String periodThree = userStringInput.nextLine();
		System.out.println("Grade for that period?");
		String gradeThree = userStringInput.nextLine();		
		switch (gradeOne) {
		case "A+":
			gpa = gpa+4.0;
			break;
		case "A":
			gpa = gpa+4.0;
			break;
		case "A-":
			gpa = gpa+3.7;
			break;
		case "B+":
			gpa = gpa+3.3;
			break;
		case "B":
			gpa = gpa+3.0;
			break;
		case "B-":
			gpa = gpa+2.7;
			break;
		case "C+":
			gpa = gpa+2.3;
			break;
		case "C":
			gpa = gpa+2.0;
			break;
		case "C-":
			gpa = gpa+1.7;
			break;
		case "D+":
			gpa = gpa+1.3;
			break;
		case "D":
			gpa = gpa+1.0;
			break;
		case "D-":
			gpa = gpa+0.7;
			break;
		case "F":
			gpa = gpa+0.0;
			break;
	}
	switch (gradeTwo) {
	case "A+":
		gpa = gpa+4.0;
		break;
	case "A":
		gpa = gpa+4.0;
		break;
	case "A-":
		gpa = gpa+3.7;
		break;
	case "B+":
		gpa = gpa+3.3;
		break;
	case "B":
		gpa = gpa+3.0;
		break;
	case "B-":
		gpa = gpa+2.7;
		break;
	case "C+":
		gpa = gpa+2.3;
		break;
	case "C":
		gpa = gpa+2.0;
		break;
	case "C-":
		gpa = gpa+1.7;
		break;
	case "D+":
		gpa = gpa+1.3;
		break;
	case "D":
		gpa = gpa+1.0;
		break;
	case "D-":
		gpa = gpa+0.7;
		break;
	case "F":
		gpa = gpa+0.0;
		break;
}
	switch (gradeThree) {
	case "A+":
		gpa = gpa+4.0;
		break;
	case "A":
		gpa = gpa+4.0;
		break;
	case "A-":
		gpa = gpa+3.7;
		break;
	case "B+":
		gpa = gpa+3.3;
		break;
	case "B":
		gpa = gpa+3.0;
		break;
	case "B-":
		gpa = gpa+2.7;
		break;
	case "C+":
		gpa = gpa+2.3;
		break;
	case "C":
		gpa = gpa+2.0;
		break;
	case "C-":
		gpa = gpa+1.7;
		break;
	case "D+":
		gpa = gpa+1.3;
		break;
	case "D":
		gpa = gpa+1.0;
		break;
	case "D-":
		gpa = gpa+0.7;
		break;
	case "F":
		gpa = gpa+0.0;
		break;
}
gpa = gpa/3;
		Roster.roster.add(new Student(firstName, lastName, gpa, periodOne, gradeOne, periodTwo, gradeTwo, periodThree, gradeThree));
		System.out.println("The GPA has been automatically calculated, and the student has been added.");
	}
	
	public static void studentDeleter() {
		System.out.println("What student would you like to delete?");
		for(int i=0; i<Roster.roster.size(); i++) {
			System.out.println((i+1)+". " + Roster.roster.get(i).getName() +" "+ Roster.roster.get(i).getLast() +" "+ d.format(Roster.roster.get(i).getGPA()) +" "+ Roster.roster.get(i).getPeriodOne() +" "+ Roster.roster.get(i).getGradeOne() +" "+ Roster.roster.get(i).getPeriodTwo() +" "+ Roster.roster.get(i).getGradeTwo() +" "+ Roster.roster.get(i).getPeriodThree() +" "+ Roster.roster.get(i).getGradeThree());
		}			
		studentChoice = userIntInput.nextInt()-1;
		Roster.roster.remove(studentChoice);
		System.out.println("The student has been deleted from the database.");
	}

}
