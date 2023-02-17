abstract class ABC {  // 추상 클래스
	public abstract int b();  // 추상 메소드

	public void d(){System.out.println("abstract class A");}
}

class B extends ABC{
	public int b(){ return 1; }
}

public class AbstractDemo {
	public static void main(String[] args) {
		//ABC a = new ABC();  // 추상클래스는 상속을 받아야만 사용이 가능하므로 컴파일 에러가 발생

              	B b = new B();
	}
}