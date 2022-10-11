package encapsulation;

public class Circle extends Shape{
	
	public Circle(int height,int width) {
		super(height, width);
		float area=3.14f*height*height;
		System.out.println("Area of Circle: "+area);
	}

		
	}
