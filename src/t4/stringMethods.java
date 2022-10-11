package t4;

public class stringMethods {

	public static void main(String[] args) {
		String str1="  Welcome to learn string in java  ";
		String str2="Welcome to learn string in java";
		//length of string
		System.out.println("String Length: "+str1.length());
		
		System.out.println("String Uppercase: "+str1.toUpperCase());
		
		System.out.println("String Lowercase: "+str1.toLowerCase());
		
		System.out.println("String Substring: "+str2.substring(6));
		System.out.println("String Substring: "+str2.substring(0,7));
		System.out.println("String Substring: "+str2.substring(12,28));
		
		System.out.println("String indexOf: "+str2.indexOf("learn"));
		
		//equals methods and == operator
		System.out.println("String == operator: "+(str1==str2));  //check same memory location
		
		System.out.println("String Equals method: "+str1.equals(str2)); //compare the values of object
		System.out.println("String EqualsIgnoreCase method: "+str1.equalsIgnoreCase(str2));
		
		//string concatenation	and + operator	
		System.out.println("String Concat using + operator: "+(str1+" "+str2));
		System.out.println("String Concat method: "+str1.concat(str2));
		
		//string spilt
		String arr[]=str1.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Splitted String: "+arr[i]);
		}
		
		System.out.println("Replace String: "+str1.replace("e", "a")); //used to replace single character
		
		System.out.println("Replace String: "+str1.replaceAll("learn", "solve")); //used to replace string
		
		System.out.println("Replace String: "+str1==str2.intern());
		
		//toCharArray		
		char ch[]=str1.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			System.out.println("toCharArray:"+ch[i]);
		}
		
		//trim used to remove white spaces
		System.out.println("Trim Method:"+str1.trim());
		
		//valueOf is used to convert all data type into string
		String s1=String.valueOf(str1);
		
		System.out.println("valueOf Method:"+s1+10);
		
		
	}

}
