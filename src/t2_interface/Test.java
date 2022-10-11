package t2_interface;

public interface Test {
 public void square(int a);  //does not have an body
}

class Arithmetic implements Test{
	public void square(int a) {
		System.out.println("Implemented interface class in arithmetic class: "+a*a);
	}
}

class TestInt{
	public static void main(String[] args) {
		Arithmetic obj=new Arithmetic();
		obj.square(4);
		System.out.println("Arithmetic object class called in new class TestInt");
	}
}