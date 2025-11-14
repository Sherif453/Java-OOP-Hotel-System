Overview:
This project is a Simple Hotel Management System built in Java using Object-Oriented Programming (OOP) principles. It allows managing hotel operations such as rooms, guests, and bookings, with persistent storage using serialized files.
The system demonstrates encapsulation, inheritance, and polymorphism for clean, maintainable code.

Features:
Room Management: Manage different room types: StandardRoom, DeluxeRoom, and Suite.
Guest Management: Add and manage guest details.
Booking and Check-in/Check-out: Track guest stays.
File-Based Persistence: Data (rooms, guests, guest count) is saved to a file (save.data) and loaded on program startup.
Room Availability Tracking: Check which rooms are available or occupied.

Class Structure:
HotelSystem – Main class managing hotel operations.
Room – Base class for all room types.
StandardRoom – Represents a standard room (inherits Room).
DeluxeRoom – Represents a deluxe room (inherits Room).
Suite – Represents a suite (inherits Room).
Guest – Represents a hotel guest.

How Data is Stored
The system uses Java Serialization to persist data:
Saving data:
Stores Guests, Rooms, and guestCount into save.data using ObjectOutputStream.
Loading data.
Reads the saved objects from save.data at program startup using ObjectInputStream.
This ensures that all rooms, guests, and counts persist between program runs.

How to Run:
1.Clone the repository
git clone <https://github.com/Sherif453/Java‑OOP‑Hotel‑System.git>
2.Open the project in your IDE (IntelliJ, Eclipse, NetBeans).
3.Compile and run the HotelSystem.java class.
4.Follow the console prompts to add rooms, register guests, and manage bookings.
5.Data will be saved automatically to save.data when using the save functionality.
