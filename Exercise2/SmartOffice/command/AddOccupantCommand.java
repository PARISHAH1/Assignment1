package SmartOffice.command;

import SmartOffice.core.Room;

// Concrete Command
public class AddOccupantCommand implements Command {
    private final Room room;
    private final int count;

    public AddOccupantCommand(Room room, int count) {
        this.room = room;
        this.count = count;
    }

    @Override
    public void execute() {
        if (room != null) {
            if (count == 0) room.removeOccupants();
            else room.addOccupant(count);
        } else {
            System.out.println("Invalid room number.");
        }
    }
}
