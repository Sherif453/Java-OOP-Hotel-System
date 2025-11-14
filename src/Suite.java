public class Suite extends Room{

    public Suite(int roomNumber) {
        super(roomNumber);
    }

    @Override
    public String getRoomType() {
        return "Suite";
    }
}
