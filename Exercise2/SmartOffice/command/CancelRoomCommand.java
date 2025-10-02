package SmartOffice.command;

import SmartOffice.core.Room;

// Concrete Command
public class CancelRoomCommand implements Command {
    private final Room room;

    public CancelRoomCommand(Room room) {
        this.room = room;
    }

    @Override
    public void execute() {
        if (room != null) room.cancelBooking();
        else System.out.println("Invalid room number.");
    }
}
