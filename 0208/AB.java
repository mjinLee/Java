public class AB {
	public static void main(String[] args){
		A a = new B();
		a.show();
		System.out.println(a.name);
		
		B b = (B)a;
		System.out.println(b.age);
		b.show2();
	}
}