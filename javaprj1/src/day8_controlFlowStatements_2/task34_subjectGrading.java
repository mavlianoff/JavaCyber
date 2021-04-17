package day8_controlFlowStatements_2;

public class task34_subjectGrading {
	
	public static void main(String[] args) {
		
		/*
		The marks obtained by a student in 3 different subjects are input by the user. Your
		program should calculate the average of subjects. The student gets a grade as per the
		following rules: (table attached)
		 */
		
		int math=150;
		int physics=80;
		int chemistry=90;
		double score;
		score=(math+physics+chemistry)/3;
		System.out.println("Average score: " + score);
		
		if (score>=90 && score<=100) {
			System.out.println("A");
		}else if(score>=80 && score<90) {
			System.out.println("B");
		}else if (score>=70 && score<80) {
			System.out.println("C");
		}else if (score>=60 && score<70) {
			System.out.println("D");
		}else if (score >=0 && score <60) {
			System.out.println("F");
		}else {
			System.out.println("Absent/Cheat/Invalid");
		}
		
	}

}
