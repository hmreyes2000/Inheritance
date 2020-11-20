package inheritance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class testHarness {

	public static void main(String[] args) {

		List<Animal> animal = new ArrayList<Animal>();
		Cat cat = new Cat("Rory");
		Dog dog = new Dog("Kraken");
		beardedDragon bd = new beardedDragon("Garfield");
		animal.add(cat);
		animal.add(dog);
		animal.add(bd);
		Iterator<Animal> A = animal.iterator();
		while (A.hasNext()) {
			Animal An = A.next();
			System.out.println(An.getName() + " says: ");
			An.makesSound();
			System.out.println("-----");
		}
	}
}
