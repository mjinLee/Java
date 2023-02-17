public class AnimalExam {
	public static void main(String[] args){
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
	
		Animal animal = null;
		animal = new Dog();	// auto type change(Promotion)
		animal.sound();		// overriding method call
		animal = new Cat();	// auto type change(Promotion)
		animal.sound();		// overriding method call
		System.out.println("-----");
		
		animalSound(new Dog());	// Promotion
		animalSound(new Cat());	// promotion
	}
	public static void animalSound(Animal animal){		// promotion
		animal.sound();	// overriding method call
	}
}