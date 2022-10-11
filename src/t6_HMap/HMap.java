package t6_HMap;
import java.util.*;
	public class HMap {	

	
		public static void main(String []args) {
			
			//hash map is used to map the interface
			HashMap<Integer,String> hMap=new HashMap<Integer,String>();
			
			hMap.put(1,"Sandy");
			hMap.put(2,"Vijay");
			hMap.put(3,"Karan");
			hMap.put(4,"Jana");
			hMap.put(1,"Kiran"); //remove duplicate
			
			System.out.println(hMap +"\n");
			
			//check hash values are empty
			boolean check=hMap.isEmpty();
			System.out.println("Is hash map value is empty: " + check +"\n");
			 
			//remove method to remove hash data
			hMap.remove(3);
			System.out.println("After removing :"+hMap +"\n");
			
			//check key available
			System.out.println("value 2 exists: "+hMap.containsKey(2)+"\n");
			
			//check value available
			System.out.println("value jana exists: "+hMap.containsValue("Jana")+"\n");
			
			//clear method to clear all hash data
			hMap.clear();
			System.out.println("Clear hash data: "+hMap);	
			
			
			}
			
			}
	
			
