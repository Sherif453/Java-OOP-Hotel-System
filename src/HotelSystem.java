import java.util.Scanner;
import java.io.*;


public class HotelSystem{
     static Guest[] Guests = new Guest[100];
     static Room[] Rooms = new Room[50];
     static int guestCount = 0;
     
    public static void main(String[]args){
        load();
        
        if (Rooms[0] == null){
          initializeRooms();
        }
        
        Scanner input = new Scanner(System.in);
       
        while (true) {
            System.out.println("1. Add Guest");
            System.out.println("2. Reserve Room");
            System.out.println("3. View Bookings");
            System.out.println("4. Exit");
            System.out.println("5. Reset Rooms");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();
            
            switch (choice) {
                case 1:
                    addGuest(input);
                    break;

                case 2:
                    reserveRoom(input);
                    break;

                case 3:
                    viewBookings();
                    break;

                case 4:
                    save();
                    System.out.println("Thank you for using the Hotel Reservation System. Goodbye!");
                    input.close();
                    return;
                    
                case 5:
                    initializeRooms();
                    System.out.println("Rooms reinitialized successfully");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }    
        }
    }
    
        static void addGuest(Scanner input){
            System.out.print("Enter Guest Id: ");
            int id = input.nextInt();
            input.nextLine();
            System.out.print("Enter Guest Name: ");
            String name = input.nextLine();
            System.out.print("Enter Guest Phone No.: ");
            int phoneNo = input.nextInt();
            
            Guests[guestCount++] = new Guest(id,name,phoneNo);
            System.out.println("Guest added successfully");
        }
        
        static void initializeRooms(){
            for(int i=0; i< Rooms.length; i++){
                if(i<20)
                    Rooms[i] = new StandardRoom(i+1);
                else if(i<40)
                    Rooms[i] = new DeluxeRoom(i+1);
                else
                    Rooms[i] = new Suite(i+1);
            }
        }
        
        static void reserveRoom(Scanner input){
            System.out.print("Enter guest id for reservation: ");
            int guestid = input.nextInt();
            
            Guest guest = findGuestById(guestid);
           
            if (guest == null){ 
            System.out.println("Guest not found. Please add the guest first.");
            return;
            }
            
             System.out.println("Available Rooms:");
             for(int i=0; i<Rooms.length; i++){
                 if(!Rooms[i].isReserved())
                     System.out.println(Rooms[i]);
             }
             
             System.out.print("Enter Room Number to Reserve: ");
             int roomNumber = input.nextInt();
             input.nextLine();
             
             Room room = findRoomByNumber(roomNumber);
             
              if (room != null && !room.isReserved()) {
                 room.reserve();
                 System.out.println("Room reserved for >> " + guest + " , " + room);
              } else 
                 System.out.println("Invalid room number or room already reserved.");
        }
        
        static void viewBookings() {
        System.out.println("\nCurrent Room Bookings:");
        for(int i=0; i<Rooms.length; i++)
            System.out.println(Rooms[i]);
        }
        
        static Guest findGuestById(int id){
        for(int i = 0; i < guestCount; i++){
            if (Guests[i] != null && Guests[i].getId() == id){
                return Guests[i];
            }
        }
        return null;
        }
        
        static Room findRoomByNumber(int roomNumber){
        for(int i=0; i<Rooms.length; i++){
            if (Rooms[i].getRoomNumber() == roomNumber){
                return Rooms[i];
            }
        }
        return null;
    }
        
        static void save(){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("save.data"))) {
            out.writeObject(Guests);
            out.writeObject(Rooms);
            out.writeInt(guestCount);
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    static void load(){
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("save.data"))) {
            Guests = (Guest[]) in.readObject();
            Rooms = (Room[]) in.readObject();
            guestCount = in.readInt();
            System.out.println("Data loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No previous data found or error loading data. Starting fresh.");
        }
    }
}
    