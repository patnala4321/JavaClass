package Package1;

class Shape_1 {
	void draw() {
		System.out.println("drawing...");
	}
}

class Rectangle_1 extends Shape_1 {
	void draw() {
		System.out.println("drawing rectangle...");
		int a=20;
		int b=20;
		System.out.println(" Area  ="+(a*b));
	}
}

class Circle_1 extends Shape_1 {
	void draw() {
		System.out.println("drawing circle...");
	}
}

class Triangle_1 extends Shape_1 {
//	void draw() {
//		System.out.println("drawing triangle...");
//	}
}

public class OverRidingEx {
	public static void main(String args[]) {
		Shape_1 s;
		
		s=new Shape_1();
		s.draw();
		s = new Rectangle_1();
		s.draw();
		s = new Circle_1();
		s.draw();
		s = new Triangle_1();
		s.draw();
	}
}