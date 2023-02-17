package sec08.exam01_method_declaration;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1 = {1, 2, 3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1: " + result1);
		
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("result2: " + result2);		
		
		// 매개변수의 수를 모를 경우 "..." 사용해 메소드 선언하고
		int result3 = myCom.sum2(1, 2, 3); // 배열을 따로 정의하지 않고 리스트 형식으로 메소드 호출
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4: " + result4);
	}
}
