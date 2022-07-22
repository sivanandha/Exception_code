
public class TryCatchExample6 {

	public static void main(String[] args) throws ArithmeticException {
		try {
			int data1 = 50 / 0; // may throw exception

		}
		// handling the exception
		catch (ArithmeticException e) {
			System.out.println(e);
			// generating the exception in catch block
			int data2 = 50 / 0;
			
			

		System.out.println("rest of the code");
	     }

}
}
