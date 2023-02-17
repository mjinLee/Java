public class SwitchNoBreakExam{
	public static void main(String[] args){
		int num = (int)(Math.random()*6)+1;
		
		switch(num){
		  case 1:
			System.out.println("number 1");
		  case 2:
			System.out.println("number 2");
		  case 3:
			System.out.println("number 3");
		  case 4:
			System.out.println("number 4");
		  case 5:
			System.out.println("number 5");
		  default:
			System.out.println("number 6");
		}
	}
}