public class Car extends RoadVehicle {
    private boolean isModified;
    private String type, model;

    public Car(String manufacturer, int horsepower, int weight, String serialNumber, String licensePlate, int cost,
	    boolean isModified, String type, String model) {
	super(manufacturer, horsepower, weight, serialNumber, licensePlate, cost);

	this.isModified = isModified;
	this.type = type;
	this.model = model;
    }

    @Override
    public String getDescription() {
	StringBuilder s = new StringBuilder();
	s.append("\n" + super.getDescription());

	s.append("\nModified: " + isModified);
	s.append("\nType: " + type);
	s.append("\nModel: " + model);
	s.append("\n");

	return s.toString();
    }
}