package polymorphism;

public class Rectangle extends Shape {

	void area() {
		int area=height*width;
		System.out.println("Area of Rectangle: "+area);
	}
}
