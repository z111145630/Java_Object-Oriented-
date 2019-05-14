package hw6;
public class Essay extends GradedActivity {
	private int grammar;
	private int spelling;
	private int correct;
	private int content;
	public Essay(int g , int s , int c1 ,int c2) {
		grammar=g;
		spelling=s;
		correct=c1;
		content=c2;
		
	}
	public void setScore(int g , int s , int c1 ,int c2) {		
		int score = grammar + spelling + correct + content;
		super.setScore(score);
	}
	public String toString() {
		return "學生的總分:"+super.getScore()+"分數為:"+super.getGrade();
	}
	
}
