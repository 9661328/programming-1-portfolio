public class ClockTester {

    public static void main(String[] args) {
	Clock c = new Clock();
	WorldClock w = new WorldClock(3);
	
	System.out.println(c.getTime());
	System.out.println(w.getTime());
    }
}