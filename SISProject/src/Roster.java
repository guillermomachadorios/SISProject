import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
//Colin's file stuff, i swear to god if you break this...
public class Roster
	{
	public void fillRoster() throws IOException
		{
		ArrayList <Student> roster = new ArrayList <Student>();
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
			
			roster.add(new Student(firstName, lastName, gpa, periodOne, gradeOne, periodTwo, gradeTwo, periodThree, gradeThree));
			}
		}
	}
