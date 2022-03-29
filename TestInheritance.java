package Package1;

class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("barking...");
	}
}

class Cow extends Animal {
	void cowVoice() {
		System.out.println(" Ambaa ");
	}
}

public class TestInheritance {
	public static void main(String args[]) {

		Dog d = new Dog();
		d.bark();
		d.eat();

		Cow c = new Cow();
		c.cowVoice();
		c.eat();
	}
}