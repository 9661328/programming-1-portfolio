public class RaceVehicle extends Vehicle {
    private String motorsport, teamName, driver;
    private int carNumber;

    public RaceVehicle(String manufacturer, int horsepower, int weight, String motorsport, String teamName,
	    int carNumber, String driver) {
	super(manufacturer, horsepower, weight);

	this.motorsport = motorsport;
	this.teamName = teamName;
	this.carNumber = carNumber;
	this.driver = driver;
    }

    @Override
    public String getDescription() {
	StringBuilder s = new StringBuilder();
	s.append("TYPE: RACECAR");
	s.append("\n" + super.getDescription());

	s.append("\nMotorsport: " + motorsport);
	s.append("\nTeam name: " + teamName);
	s.append("\nCar number: " + carNumber);
	s.append("\nDriver: " + driver);
	s.append("\n");

	return s.toString();
    }
}