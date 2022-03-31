package Lang;

public class StringEx {

	public static void main(String[] args) {

		String s1 = "aaaaaa";

		String s2 = "bbbbbb";

		String s3 = "aaaaaa";

		String s4 = new String();
		String s5 = new String("vvvvvvv");
		String s6 = new String("xxxxxxx");
		String s7 = new String("vvvvvvv");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);

		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));

		System.out.println(s1 == s2);
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		System.out.println(s4.equals(s5));
		System.out.println(s5.equals(s6));
		System.out.println(s6.equals(s6));

		System.out.println(s4 == s5);
		System.out.println(s5 == s6);
		System.out.println(s4 == s6);
		
		
	}



}
