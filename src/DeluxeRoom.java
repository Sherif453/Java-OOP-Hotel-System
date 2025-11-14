public class DeluxeRoom extends Room{

    public DeluxeRoom(int roomNumber) {
        super(roomNumber);
    }

    @Override
    public String getRoomType() {
        return "Deluxe Room";
    }
}
