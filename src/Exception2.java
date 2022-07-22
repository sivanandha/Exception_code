
public class Exception2 {

	public static void main(String[] args) {
		System.out.println("1");
		try {
			System.out.println("2");
			int a = 100;
			int b = 0;
			int c = a / b;
			System.out.println(c);
			//System.out.println("3"); dont write the statements afterwhre the exception occurce
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println(4);

		}
		System.out.println("Hello");

	}

}
