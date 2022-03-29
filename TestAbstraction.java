package Package1;

abstract class Shape {
	abstract void draw();

	void show() {
		System.out.println("Show Shape");
	}
}

//In real scenario, implementation is provided by others i.e. unknown by end user  
class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle1 extends Shape {
	void draw() {
		System.out.println("drawing circle");
	}
}

class Square extends Shape {

	void draw() {
		System.out.println("drawing Sqaure");
	}

}

//In real scenario, method is called by programmer or user  
public class TestAbstraction {
	public static void main(String args[]) {
		Shape s1 = new Circle1();// In a real scenario, object is provided through method, e.g., getShape()
									// method
		s1.draw();
		s1.show();

		Shape s2 = new Rectangle();
		s2.draw();
		s2.show();

		Shape s3 = new Square();
		s3.draw();
		s3.show();

	}
}
