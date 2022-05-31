public class Vehicle {
    private int horsepower, weight;
    private String manufacturer;

    public Vehicle(String manufacturer, int horsepower, int weight) {
	this.manufacturer = manufacturer;
	this.horsepower = horsepower;
	this.weight = weight;
    }

    public String getDescription() {
	StringBuilder s = new StringBuilder("");

	s.append("Manufacturer: " + manufacturer);
	s.append("\nHorsepower: " + horsepower);
	s.append("\nWeight: " + weight);

	return s.toString();
    }
}