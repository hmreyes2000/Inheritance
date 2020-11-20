package inheritance;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}
	
	public void makesSound() {
		System.out.println("rufff");
	}

}
