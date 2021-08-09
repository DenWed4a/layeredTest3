package by.tc.task01.entity;

public class BuildersFactory {

	private static final BuildersFactory buildersFactory = new BuildersFactory();
	private final Laptop.Builder laptopBuilder = new Laptop.Builder();
	private final Oven.Builder ovenBuilder = new Oven.Builder();
	private final Refrigerator.Builder refrigeratorBuilder = new Refrigerator.Builder();
	private final Speakers.Builder speakersBuilder = new Speakers.Builder();
	private final TabletPC.Builder tabletPCBuilder = new TabletPC.Builder();
	private final VacuumCleaner.Builder vacuumCleanerBuilder = new VacuumCleaner.Builder();

	private BuildersFactory() {
	}

	public static BuildersFactory getBuildersFactory() {
		return buildersFactory;
	}

	public Laptop.Builder getLaptopBuilder() {
		return laptopBuilder;
	}

	public Oven.Builder getOvenBuilder() {
		return ovenBuilder;
	}

	public Refrigerator.Builder getRefrigeratorBuilder() {
		return refrigeratorBuilder;
	}

	public Speakers.Builder getSpeakersBuilder() {
		return speakersBuilder;
	}

	public TabletPC.Builder getTabletPCBuilder() {
		return tabletPCBuilder;
	}

	public VacuumCleaner.Builder getVacuumCleanerBuilder() {
		return vacuumCleanerBuilder;
	}

}
