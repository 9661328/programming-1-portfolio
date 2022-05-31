public class RoadVehicle extends Vehicle {
    private String serialNumber, licensePlate;
    private int cost;

    public RoadVehicle(String manufacturer, int horsepower, int weight, String serialNumber, String licensePlate,
	    int cost) {
	super(manufacturer, horsepower, weight);

	this.serialNumber = serialNumber;
	this.licensePlate = licensePlate;
	this.cost = cost;
    }

    @Override
    public String getDescription() {
	StringBuilder s = new StringBuilder();
	s.append("TYPE: ROADVEHICLE");
	s.append("\n" + super.getDescription());

	s.append("\nSerial number: " + serialNumber);
	s.append("\nLicense plate: " + licensePlate);
	s.append("\nCost: $" + cost);

	return s.toString();
    }
}