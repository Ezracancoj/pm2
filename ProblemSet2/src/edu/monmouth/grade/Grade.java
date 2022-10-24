package edu.monmouth.grade;



public class Grade {
	private final String UNKNOWN = "UNKNOWN";
	private String gradeLetter;
	
	public Grade() {
		setGradeLetter(UNKNOWN);
	}
	
	
	public Grade(char gradeLetter) {
		setGradeLetter(Character.toString(gradeLetter));
		
	}
	public Grade(String gradeLetter) {
		setGradeLetter(gradeLetter);
	}
	
	public String getGradeLetter() {
		return gradeLetter;
	}
	public void setGradeLetter(String gradeLetter) {
	
		if (gradeLetter.equals("A")){
			this.gradeLetter = gradeLetter;
		}
		else if (gradeLetter.equals("A-")){
			this.gradeLetter = gradeLetter;
		}
		else if (gradeLetter.equals("B+")){
			this.gradeLetter = gradeLetter;
		}
		else if (gradeLetter.equals("B")){
			this.gradeLetter = gradeLetter;
		}
		else if (gradeLetter.equals("B-")){
			this.gradeLetter = gradeLetter;
		}
		else if (gradeLetter.equals("C+")){
			this.gradeLetter = gradeLetter;
		}
		else if (gradeLetter.equals("C")){
			this.gradeLetter = gradeLetter;
		}
		else if (gradeLetter.equals("INC")) {	
			this.gradeLetter = gradeLetter;
		}
		else {
			this.gradeLetter = UNKNOWN;
		}
		
	}

}
