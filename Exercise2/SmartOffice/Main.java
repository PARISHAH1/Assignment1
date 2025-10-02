package SmartOffice;

import java.util.Scanner;
import SmartOffice.core.*;
import SmartOffice.command.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("SmartOffice app booting...");
        Scanner sc = new Scanner(System.in);
        OfficeConfig office = OfficeConfig.getInstance();
        CommandInvoker invoker = new CommandInvoker();

        while (true) {
            String input = sc.nextLine().trim();
            if (input.isEmpty()) continue;
            String[] parts = input.split("\\s+");
            try {
                switch (parts[0].toLowerCase()) {
                    case "config":
                        if (parts.length >= 4 && parts[1].equalsIgnoreCase("room")) {
                            if ("count".equalsIgnoreCase(parts[2]) && parts.length >= 4) {
                                office.configureRooms(Integer.parseInt(parts[3]));
                            } else if (parts.length >= 6 && "max".equalsIgnoreCase(parts[2]) && "capacity".equalsIgnoreCase(parts[3])) {
                                Room room = office.getRoom(Integer.parseInt(parts[4]));
                                if (room != null) room.setCapacity(Integer.parseInt(parts[5]));
                                else System.out.println("Room does not exist.");
                            }
                        }
                        break;

                    case "block":
                        if (parts.length >= 5) {
                            Room r1 = office.getRoom(Integer.parseInt(parts[2]));
                            invoker.submit(new BookRoomCommand(r1, parts[3], Integer.parseInt(parts[4])));
                        } else {
                            System.out.println("Usage: block room <id> <time> <duration>");
                        }
                        break;

                    case "cancel":
                        if (parts.length >= 3) {
                            Room r2 = office.getRoom(Integer.parseInt(parts[2]));
                            invoker.submit(new CancelRoomCommand(r2));
                        } else {
                            System.out.println("Usage: cancel room <id>");
                        }
                        break;

                    case "add":
                        if (parts.length >= 4) {
                            Room r3 = office.getRoom(Integer.parseInt(parts[2]));
                            invoker.submit(new AddOccupantCommand(r3, Integer.parseInt(parts[3])));
                        } else {
                            System.out.println("Usage: add room <id> <count>");
                        }
                        break;

                    case "exit":
                        System.out.println("Exiting system...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid command.");
                }
            } catch (Exception e) {
                System.out.println("Error processing command. Please check input.");
            }
        }
    }
}
