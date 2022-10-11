package t5;

public class throww {
	void voter(int age) {
		if(age < 18) {
			//throw a exception within block of code or method
			throw new ArithmeticException("You are not eligible");
		}
		else
		{
			System.out.println("You are eligible");
		}
	}
	
	public static void main(String []args) {
		throww obj=new throww();
		obj.voter(15);
	}

}
