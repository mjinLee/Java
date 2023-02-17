public class Child3Exam{
	public static void main(String[] args){
		Parent3 p = new Child3();
		p.field1 = "data1";
		p.method1();
		p.method2();
	
		Child3 c = (Child3) p;
		c.filed2 = "yyy";
		c.method3();
	}
}