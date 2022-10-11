package encapsulation;

public class Square extends Shape{
	
	public Square(int height,int width) {
		super(height, width);
		int area=height*height;
		System.out.println("Area of Square: "+area);
	}

		
	}