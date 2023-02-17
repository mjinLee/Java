class Test {
	String input;
	Test(){
		//System.out.println("Init const.");
	}
	Test(String name){
		System.out.println(name);
	}	
	void print(String input){
		System.out.println("Method Input Value "+input);	
		System.out.println();
		System.out.println("Class Field Value "+this.input);
	}
	/*int addFunc(int x, int y){
		int plus = x + y;
		return plus;	
	}
	int subFunc(int x,int y){
		return x - y;
	}*/
}

public class TestDemo{
	public static void main(String[] args){
		Test myTest1 = new Test();
		//myTest1.print("Function Test");
		//Test myTest2 = new Test("Programming");
		
		//int result = myTest1.addFunc(1,2);
		//System.out.println("SUM : "+result);
		//int result2 = myTest1.subFunc(4,2);
		//System.out.println("minus : "+result2);

		myTest1.print("this. ~~ test!");		
	}	
}