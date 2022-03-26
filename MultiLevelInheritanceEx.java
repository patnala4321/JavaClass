package Package1;

class Shape_2 {
	void draw() {
		System.out.println("drawing...");
	}

}

class Rectangle_2 extends Shape_2 {
	void draw() {
		System.out.println("drawing rectangle...");
		int a = 20;
		int b = 20;
		System.out.println(" Area  =" + (a * b));
	}

	private void showRectangle_2() {
		System.out.println("Show Rectangle");
	}
}

class Circle_2 extends Rectangle_2 {
	void draw() {
		System.out.println("drawing circle...");
	}

	void showCircle_2() {
		System.out.println("Show Circle");
	}
}

class Triangle_2 extends Circle_2 {
	void draw() {
		System.out.println("drawing triangle...");
	}

	void showTriangle_2() {
		System.out.println("Show Traingle");
	}
}

public class MultiLevelInheritanceEx {
	public static void main(String args[]) {
		Shape_2 s;

		s = new Shape_2();
		s.draw();

		s = new Rectangle_2();
		s.draw();

		s = new Circle_2();
		s.draw();

		s = new Shape_2();
		s.draw();

		s = new Triangle_2();
		s.draw();

		Circle_2 c2 = new Triangle_2();

		c2.draw();

	}
}
