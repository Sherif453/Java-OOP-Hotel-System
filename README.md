# Simple Hotel Management System

## Overview
This project is a Simple Hotel Management System built in Java using Object-Oriented Programming (OOP) principles.  
It manages rooms, guests, and bookings with persistent storage via serialized files.  
The system demonstrates **encapsulation**, **inheritance**, and **polymorphism** for clean and maintainable code.

## Features
- **Room Management:** StandardRoom, DeluxeRoom, and Suite  
- **Guest Management:** Add and manage guest information  
- **Booking System:** Check-in, check-out, and booking tracking  
- **File-Based Persistence:** Saves all data into `save.data`  
- **Availability Tracking:** Shows available vs. occupied rooms  

## Class Structure
- `HotelSystem` – Core system controller  
- `Room` – Base class  
- `StandardRoom` – Inherits from Room  
- `DeluxeRoom` – Inherits from Room  
- `Suite` – Inherits from Room  
- `Guest` – Represents a hotel guest  

## Data Storage
The system uses **Java Serialization** for persistence:

- **Saving Data:**  
  Saves Rooms, Guests, and guestCount into `save.data` using `ObjectOutputStream`  
- **Loading Data:**  
  Reads saved objects on startup using `ObjectInputStream`  

This ensures all data persists between program runs.

## How to Run
1. Clone the repository: https://github.com/Sherif453/Java-OOP-Hotel-System.git
2. Open the project in IntelliJ, Eclipse, or NetBeans
3. Compile and run HotelSystem.java
4. Use console options to add rooms, register guests, and manage bookings
5. Data is automatically saved to save.data
