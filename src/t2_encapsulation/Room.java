package t2_encapsulation;

public class Room {
	private int RoomNo;
	private String RoomType;
	private float RoomArea;
	private String ACmachine;
	
	//getData
	
	public int getRoomNo() {
		return RoomNo;
	}
	
	public String getRoomType() {
		return RoomType;
	}

    public float getRoomArea() {
    	return RoomArea;
    }
    
    public String getACmachine(){
    	return ACmachine;
    }
    
    //DisplayData
    
    public void setRoomNo(int RoomNo) {
    	this.RoomNo=RoomNo;
    }
    
    public void setRoomType(String RoomType) {
    	this.RoomType=RoomType;
    }
    
    public void setRoomArea(float RoomArea) {
    	this.RoomArea=RoomArea;
    }
    
    public void setACmachine(String ACmachine) {
    	this.ACmachine=ACmachine;
    }
  public class Main{ 
    public static void main(String[] args) {
    	Room r=new Room();
    	r.setRoomNo(123);
    	r.setRoomType("2BHK");
    	r.setRoomArea(300.012564f);
    	r.setACmachine("YES");
    	System.out.println("Room No: "+r.getRoomNo());
    	System.out.println("Type of Room: "+r.getRoomType());
    	System.out.println("Room Area: "+r.getRoomArea());
    	System.out.println("ACmachine Available: "+r.getACmachine());
    }
   }

}
