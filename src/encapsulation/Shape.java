package encapsulation;

public class Shape {
	 int height;
	 int width;
 
	 public Shape(int height,int width) {
	 this.height=height;
	 this.width=width;
 }


class Main{
	public static void main(String[] args) {	
		new Rectangle(10,13);	
		new Square(23,32);
		new Circle(14,28);

		
	}
}
}

