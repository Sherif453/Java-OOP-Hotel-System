public class StandardRoom extends Room{

    public StandardRoom(int roomNumber) {
        super(roomNumber);
    }

    @Override
    public String getRoomType() {
       return "Standard Room"; 
    }
}