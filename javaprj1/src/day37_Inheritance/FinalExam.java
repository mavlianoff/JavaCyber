package day37_Inheritance;

public class FinalExam extends GradeActivity {
	
	private int numOfQuestions;
	private double pointsEach;
	private int numMissed;
	
	public FinalExam(int numOfQuestions, int numMissed) {
		
		double numericScore;
		
		this.numOfQuestions = numOfQuestions;
		this.numMissed = numMissed;
		
		pointsEach = 100.0 / numOfQuestions;
		numericScore = 100.0 - (numMissed * pointsEach);
		
		setScore(numericScore);
		
	
	}
	
	
	
}
