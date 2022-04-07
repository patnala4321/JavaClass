package Lang;

public class StringIntern {

	public static void main(String[] args) {
		String s1 = new String("Sachin");
		String s2 = s1.intern();
		System.out.println(s2);

		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);

		String s3 = "Anjali";
		String s4 = s3.intern();

		System.out.println(s3.equals(s4));
		System.out.println(s3 == s4);

	}

}
