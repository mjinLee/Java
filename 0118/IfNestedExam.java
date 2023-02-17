public class IfNestedExam{
	public static void main(String[] args){
		int score = 90;
		String grade;

		if(score >= 90){
			if(score>=95){
				grade = "A+";
			}else{
				grade = "A";
			}
		}else{
			if(score>=85){
				grade = "B+";
			}else{
				grade = "B";
			}
		}
		System.out.println("grade : "+grade);
	}
}