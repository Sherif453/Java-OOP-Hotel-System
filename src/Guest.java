import java.io.Serializable;

public class Guest implements Serializable{
    private int guestId;
    private String guestName;
    private int guestPhone;
    
    public Guest(int guestId, String guestName, int guestPhone){
        this.guestId = guestId;
        this.guestName = guestName;
        this.guestPhone = guestPhone;
    }
    
    @Override
    public String toString(){       //automatically called when an object is printed
        return "Guest Id: " + guestId + ", Guest Name: " + guestName + ", Guest Phone No.: " + guestPhone; 
    }

    public int getId(){
        return guestId;
    }
}