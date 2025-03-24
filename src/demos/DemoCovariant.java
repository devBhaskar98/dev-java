package demos;

class Animal {
	Animal getAnimal() {
		System.out.println("Returning Animal");
		return new Animal();
	}
}

class Dog extends Animal {
	@Override
	Dog getAnimal() { // Covariant return type (Dog is a subtype of Animal)
		System.out.println("Returning Dog");
		return new Dog();
	}
}

public class DemoCovariant {
	public static void main(String[] args) {
		Animal obj = new Dog();
		obj.getAnimal(); // Will call Dog's getAnimal()

		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1.equals(str2));
	}
}
