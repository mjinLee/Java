public class SwitchExam{
	public static void main(String[] args){
		int num = (int)(Math.random()*6)+1;
		
		switch(num){
		  case 1:
			System.out.println("number 1");
			break;
		  case 2:
			System.out.println("number 2");
			break;
		  case 3:
			System.out.println("number 3");
			break;
		  case 4:
			System.out.println("number 4");
			break;
		  case 5:
			System.out.println("number 5");
			break;
		  default:
			System.out.println("number 6");
			break;
		}
	}
}