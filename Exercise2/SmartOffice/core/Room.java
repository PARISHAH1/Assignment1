package SmartOffice.core;

import java.util.*;

public class Room {
    private final int id;
    private int capacity = 2; // default
    private final List<Booking> bookings = new ArrayList<>();
    private int occupants = 0;

    public Room(int id) {
        this.id = id;
    }

    public int getId() { return id; }

    public void setCapacity(int cap) {
        if (cap > 0) {
            capacity = cap;
            System.out.println("Room " + id + " maximum capacity set to " + capacity + ".");
        } else {
            System.out.println("Invalid capacity. Please enter a valid positive number.");
        }
    }

    public boolean addOccupant(int count) {
        if (count >= 2) {
            occupants = count;
            System.out.println("Room " + id + " is now occupied by " + occupants + " persons. AC and lights turned on.");
            return true;
        } else {
            System.out.println("Room " + id + " occupancy insufficient to mark as occupied.");
            return false;
        }
    }

    public void removeOccupants() {
        occupants = 0;
        System.out.println("Room " + id + " is now unoccupied. AC and lights turned off.");
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
        System.out.println("Room " + id + " booked from " + booking.getTime() + " for " + booking.getDuration() + " minutes.");
    }

    public void cancelBooking() {
        if (!bookings.isEmpty()) {
            bookings.clear();
            System.out.println("Booking for Room " + id + " cancelled successfully.");
        } else {
            System.out.println("Room " + id + " is not booked. Cannot cancel booking.");
        }
    }
}
