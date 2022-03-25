package Package1;

class SuperClass1 {

	SuperClass1() {
		System.out.println("Super Class1 Constructor");
	}

	void show() {
		System.out.println("Show in Sub Class1");
	}

	static void staticMethod() {
		System.out.println("Static Method");
	}

	final void finalMethod() {
		System.out.println("Final Method");
	}
}

public class SubClass1 extends SuperClass1 {

	SubClass1() {

		System.out.println("ConstrutInhe1 Construcor");

	}

//   void finalMethod() {
//		System.out.println("Final Method");
//	}

	void show() {
		System.out.println("Show in Sub Class1");
	}

	void display() {
		System.out.println("Show in ConstrutInher");
	}

	public static void main(String[] args) {

		SubClass1 ci = new SubClass1();

		ci.show();
		ci.display();

	}

}
