package t5;

import java.io.IOException;

public class throwss {
	
	//throws keyword used in signature of method only
	void numCheck(int num) throws IOException,ClassNotFoundException {
		if(num==1) {
			throw new IOException("IOException Occured");
		}
		else
		{
			throw new ClassNotFoundException("ClassNotFound");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throwss obj=new throwss();
		try {
			obj.numCheck(1);
		}
		catch(Exception e){
			System.out.println(e);                                             
		}

	}

}
