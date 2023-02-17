public class ChildExam {
	public static void main(String[] args){
		Child c = new Child();
		Parent parent = c;
		parent.method1();
		parent.method2();
	}
}