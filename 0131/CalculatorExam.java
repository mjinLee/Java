class Calculator{
	static double pi = 3.14159;
	static int plus(int x, int y){
		return x+y;
	}
	static int minus(int x, int y){
		return x-y;
	}
}

public class CalculatorExam{
	public static void main(String[] args){
		double res = 10*10*Calculator.pi;
		int res2 = Calculator.plus(10,5);
		int res3 = Calculator.minus(10,5);
		System.out.println("res : "+res);	
		System.out.println("res2 : "+res2);	
		System.out.println("res3 : "+res3);		
	}	
}