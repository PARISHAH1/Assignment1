package SmartOffice.command;

import SmartOffice.core.*;

// Concrete Command
public class BookRoomCommand implements Command {
    private final Room room;
    private final String time;
    private final int duration;

    public BookRoomCommand(Room room, String time, int duration) {
        this.room = room;
        this.time = time;
        this.duration = duration;
    }

    @Override
    public void execute() {
        if (room != null) {
            room.addBooking(new Booking(time, duration));
        } else {
            System.out.println("Invalid room number.");
        }
    }
}
