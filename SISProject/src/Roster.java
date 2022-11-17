import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.text.DecimalFormat;
//Colin's file stuff, i swear to god if you break this...
public class Roster
	{
	static DecimalFormat d = new DecimalFormat("0.00");
	public static ArrayList <Student> roster = new ArrayList <Student>();
	public static void fillRoster() throws IOException
		{
		Scanner file = new Scanner(new File( "studentData.txt" ));
		while(file.hasNext())
			{
			String firstName = file.next();
			String lastName = file.next();
			double gpa = 0.0;
			String periodOne = file.next();
			String gradeOne = file.next();
			String periodTwo = file.next();
			String gradeTwo = file.next();
			String periodThree = file.next();
			String gradeThree = file.next();
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
			
			roster.add(new Student(firstName, lastName, gpa, periodOne, gradeOne, periodTwo, gradeTwo, periodThree, gradeThree));
			}
		}
	}
