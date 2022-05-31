public class Main {

    public static void main(String[] args) {
	RaceVehicle r1 = new RaceVehicle("Toyota", 1000, 2293, "World Endurance Championship", "Toyota Gazoo Racing", 7,
		"M. Conway");
	RaceVehicle r2 = new RaceVehicle("Ferrari", 950, 1638, "Formula 1", "Scuderia Ferrari", 16, "Charles Leclerc");

	Car r3 = new Car("Audi", 562, 3594, "0000", "LIC PLA", 148700, false, "Sports car", "R8");

	System.out.println(r1.getDescription());
	System.out.println(r2.getDescription());
	System.out.println(r3.getDescription());
    }
}