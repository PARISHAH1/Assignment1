package SmartOffice.core;

import java.util.*;

// Singleton - manages office & rooms
public class OfficeConfig {
    private static OfficeConfig instance;
    private final Map<Integer, Room> rooms = new HashMap<>();

    private OfficeConfig() {}

    public static OfficeConfig getInstance() {
        if (instance == null) instance = new OfficeConfig();
        return instance;
    }

    public void configureRooms(int count) {
        rooms.clear();
        for (int i = 1; i <= count; i++) {
            rooms.put(i, new Room(i));
        }
        System.out.println("Office configured with " + count + " meeting rooms: " + rooms.keySet());
    }

    public Room getRoom(int id) {
        return rooms.get(id);
    }
}
