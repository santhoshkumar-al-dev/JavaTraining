package t3;

class OuterClass{
	String s="Ravi";
	
class InnerClass {
	String s1="Kumar";
}
}
class Main{
public static void main(String []args) {
	OuterClass outer=new OuterClass();
	
	OuterClass.InnerClass inner=outer.new InnerClass();	
	
	System.out.println(outer.s+" "+inner.s1);
}
}