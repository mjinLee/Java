public class Example {
	public static void main(String[] args){
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();

		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();

		InterfaceC ic = impl;
		ia.methodA();
		ib.methodB();
		ic.methodC();
	}
}
