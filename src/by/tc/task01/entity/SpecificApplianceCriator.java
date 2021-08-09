package by.tc.task01.entity;

public class SpecificApplianceCriator {
	public Appliance create(String applianceName, String stringFromFile) {

		ApplianceCreator creator;
		Appliance appliance = null;
		
		switch (applianceName) {
		case ("Laptop"):
			creator = new LaptopCreator();
			appliance = creator.create(stringFromFile);
			break;
		case ("Oven"):
			creator = new OvenCreator();
			appliance = creator.create(stringFromFile);
			break;
		case ("Refrigerator"):
			creator = new RefrigeratorCreator();
			appliance = creator.create(stringFromFile);
			break;
		case ("Speakers"):
			creator = new SpeakersCreator();
			appliance = creator.create(stringFromFile);
			break;
		case ("TabletPC"):
			creator = new TabletPCCreator();
			appliance = creator.create(stringFromFile);
			break;
		case ("VacuumCleaner"):
			creator = new VacuumCleanerCreator();
			appliance = creator.create(stringFromFile);
			break;

		}
		return appliance;
	}

}
