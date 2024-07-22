package designpatterns.factorypattern;

public class DemoFactoryPattern {
	public static void main(String[] args) {
		// Create a Road Logistics object
        Logistics roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();

        // Create a Sea Logistics object
        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();
	}
}
