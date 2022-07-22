
public class Exception3 {

	public static void main(String[] args) {
		try {
		String s=null;
		System.out.println(s.length());	//NullPointerException is
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
	}
}
