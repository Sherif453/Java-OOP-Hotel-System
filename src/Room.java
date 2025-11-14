import java.io.Serializable;

abstract class Room implements Serializable {
    private int roomNumber;
    private boolean isReserved;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isReserved = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isReserved() {
        return isReserved;
    }
    
    public void reserve() {
        isReserved = true;
    }

    public void cancelReservation() {
        isReserved = false;
    }

    public abstract String getRoomType();

    @Override
    public String toString() {
        return "Room " + roomNumber + " (" + getRoomType() + ")" + (isReserved ? " - Reserved" : " - Available");
    }
}    
    