import java.time.*;

public class WorldClock extends Clock {
    private int offset;
    
    public WorldClock(int offset) {
	this.offset = offset;
    }
    
    public int getHours() {
	if (super.getHours() + offset > 23) {
	    return super.getHours() + offset - 24;
	}
	return super.getHours() + offset;
    }
}