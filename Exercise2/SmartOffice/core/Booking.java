package SmartOffice.core;

public class Booking {
    private final String time;
    private final int duration;

    public Booking(String time, int duration) {
        this.time = time;
        this.duration = duration;
    }

    public String getTime() { return time; }
    public int getDuration() { return duration; }
}
