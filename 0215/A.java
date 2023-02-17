class A {
	A() { System.out.println("A object"); }
	
	// instance class
	public class B {
		B() { System.out.println("B object"); }
		int field1;
		//static int field2;  //(x)
		void method1() { }
		//static void method2() { }  //(x)
	}
	
	// static class
	static class C {
		C() { System.out.println("C object"); }
		int field1;
		static int field2;
		void method1() { }
		static void method2() { }
	}

	void method() {
		// local class
		class D {
			D() { System.out.println("D object"); }
			int field1;
			//static int field2;  //(x)
			void method1() { }
			//static void method2() { }  //(x)
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
