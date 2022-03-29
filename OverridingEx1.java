package Package1;


class Shape_11 {
	protected void draw() {
		System.out.println("drawing...");
	}
}

class Rectangle_11 extends Shape_11 {
	public void draw() {
		System.out.println("drawing rectangle...");
		int a=20;
		int b=20;
		System.out.println(" Area  ="+(a*b));
	}
}

class Circle_11 extends Shape_11 {
	protected void draw() {
		System.out.println("drawing circle...");
	}
}

class Triangle_11 extends Shape_1 {
//	void draw() {
//		System.out.println("drawing triangle...");
//	}
}

public class OverridingEx1 {
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
