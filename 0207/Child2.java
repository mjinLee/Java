public class Child2 extends Parent2 {
	private String name;
	public Child2(){
		this("hong");
		System.out.println("Child() call");
	}
	public Child2(String name){
		this.name = name;
		System.out.println("Child(String name) call");
	}
}