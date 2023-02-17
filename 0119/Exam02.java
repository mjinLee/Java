import java.util.Scanner;
public class Exam02{
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scan = new Scanner(System.in);
		String input;
		while(run){
			System.out.println("----------------------------------------");
			System.out.println("1. input | 2. output | 3. total | 4. quit");
			System.out.println("----------------------------------------");
			System.out.print("select> ");
			input = scan.nextLine();
			// int input = scan.nextInt();
			if(input.equals("1")){
				System.out.print("input> ");
				balance += Integer.parseInt(scan.nextLine());
				// balance += scan.nextInt();
			} else if(input.equals("2")){
				System.out.print("output> ");
				balance -= Integer.parseInt(scan.nextLine());
			} else if(input.equals("3")){
				System.out.println("total> "+balance);
			} else if(input.equals("4")){
				run = false;
			}
		}
		System.out.println();
		System.out.println("Program terminated");
	}
}