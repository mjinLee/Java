public class MainStringArrayExam{
	public static void main(String[] args){
		if(args.length != 2){
			System.out.println("program's usage");
			System.out.println("java MainStringArrayExam num1 num2");
			System.exit(0);
		}
		String str1 = args[0];
		String str2 = args[1];
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int res = num1 + num2;
		System.out.println(num1 +" + "+num2 + " = " +res);
	}
}