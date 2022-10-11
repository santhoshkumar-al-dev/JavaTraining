package abstraction;

public class Circle extends Shape {
	void area() {
		float area=3.14f*height*height;
		System.out.println("Area of Circle:\t"+area);
	}

}