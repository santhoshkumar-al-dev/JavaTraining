package polymorphism;

public class Shape {
	int height;
	int width;

	public Shape() {     //constructor
		height=43;
		width=15;
		
	}
	class Main{
		public static void main(String[] args) {
		
			Rectangle obj1=new Rectangle();		
			Square obj2=new Square();
			Circle obj3=new Circle();

			obj1.area(); 
			obj2.area();
			obj3.area();
			
		}
	}
}

   

	

