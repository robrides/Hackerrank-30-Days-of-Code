package exceptionspractice;

public class ExceptionsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] c = new int[6];
			System.out.println("Element 6 at index 5 = " +c[5]);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown" + e);
		}
		finally {
		System.out.println("Finally clause");

		}
	}
}
