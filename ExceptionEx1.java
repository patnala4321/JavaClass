package ExceptionHandling;

public class ExceptionEx1 {

	public static void main(String[] args) {

		try {

			int x = 20 / 0;

			System.out.println(x);
		} catch (Exception e) {
			
			System.out.println(e+"   xxxxxx");

		}

	}

}
