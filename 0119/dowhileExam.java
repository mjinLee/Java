import java.util.Scanner;
public class dowhileExam{
	public static void main(String[] args) {
		System.out.println("intput message, quit(q)");
		Scanner scan = new Scanner(System.in);
		String input;
		do{
			System.out.println("> ");
			input = scan.nextLine();
			System.out.println(input);
		} while(!input.equals("q"));
		System.out.println();
		System.out.println("Program Terminated"); 
	}
}