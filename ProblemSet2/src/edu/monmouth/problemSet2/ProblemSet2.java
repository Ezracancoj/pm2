package edu.monmouth.problemSet2;
import edu.monmouth.grade.Grade;

public class ProblemSet2 {
	//“A”,“A-“, “B”, “B+”, “B-“, “C”, “C+” and “INC”

	public static void main(String[] args) {
		Grade grade = new Grade();
		System.out.println(grade.getGradeLetter());
		
		Grade grade2 = new Grade("B-");
		System.out.println(grade2.getGradeLetter());
		
		grade.setGradeLetter("C+");
		System.out.println(grade.getGradeLetter());
		
		Grade grade3 = new Grade("F");
		System.out.println(grade3.getGradeLetter());

	}
	
}