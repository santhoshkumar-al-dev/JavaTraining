package polymorphism;

public class Square extends Shape{
	void area(){
		int area=height*height;
		System.out.println("Area of Square:\t"+area);
	}
}
