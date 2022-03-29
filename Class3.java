package Package1;

interface Class1 {

	static final int a = 20;
	int b = 50;

	void msg();
}

interface Class2 {

	int a = 30;
	int c = 40;

	void msg();

}

public class Class3 implements Class1, Class2 {

	public void msg() {
		System.out.println("msg in class3");
	}

	public static void main(String[] args) {

		Class3 cl3 = new Class3();
		cl3.msg();

		System.out.println(Class1.a);
		System.out.println(Class1.b);
		System.out.println(Class1.a);
		System.out.println(Class2.c);

	}
}