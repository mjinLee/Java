public class Cat extends Animal{
	public Cat(){
		this.kind = "Mammalia";
	}
	@Override	// abstract method overriding
	public void sound(){
		System.out.println("meow");
	}
}