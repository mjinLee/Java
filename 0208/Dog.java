public class Dog extends Animal{
	public Dog(){
		this.kind = "Mammalia";
	}
	@Override	// abstract method overriding
	public void sound(){
		System.out.println("bow-wow");
	}
}