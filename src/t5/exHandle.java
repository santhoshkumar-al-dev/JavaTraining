package t5;

public class exHandle {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		int a=10,b=0;
	
		
		//test for errors
		try {
			//array

			int arr[]=null;
			System.out.println(arr[1]);
			
			//integer
			 @SuppressWarnings("unused")
			int c=a/b;
		}
		
		//find any error occur in try block
		catch(NullPointerException e) {
			System.out.println("NullpointerEx Error occured");
		}
		
		catch(ArithmeticException e) {
			System.out.println("ArithmeticEx Error occured");
		}
		
		//run by default after execution of try and catch block
		finally {
		System.out.println("Try and Catch Block Executed");
		}
	

}}
