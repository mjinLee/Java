public class whileExam{
	public static void main(String[] args) throws Exception{
		boolean run = true;
		int speed = 0;
		int keyCode = 0;	
		
		while(run){
			if(keyCode !=13 && keyCode!=10){
				System.out.println("---------------------------");
				System.out.println("1. up | 2. down | 3. exit");
				System.out.println("---------------------------");
				System.out.print("select : ");
			}
			keyCode = System.in.read();
			if(keyCode == 49){ // 1
				speed++;
				System.out.println("speed = "+speed);
			} else if(keyCode == 50){ // 2
				speed--;
				System.out.println("speed = "+speed);
			} else if(keyCode == 51){ // 3
				run = false;
			}
		}
		System.out.println("program end");
	}
}