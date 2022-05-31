import java.time.*;

public class Clock {
    public LocalTime time = LocalTime.now();

    public int getHours() {
	return time.getHour();
    }

    public int getMinutes() {
	return time.getMinute();
    }

    public String getTime() {
	String hour = String.valueOf(getHours());
	String minute = getMinutes() > 9 ? String.valueOf(getMinutes()) : "0" + String.valueOf(getMinutes());
	
	return hour + ":" + minute;
    }
}