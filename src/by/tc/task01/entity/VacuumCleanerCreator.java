package by.tc.task01.entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VacuumCleanerCreator implements ApplianceCreator {

	
	public Appliance create(String string) {

		VacuumCleaner.Builder vacuumCleanerBuilder = BuildersFactory.getBuildersFactory().getVacuumCleanerBuilder();

		String s = string;

		Pattern pattern = Pattern.compile("POWER_CONSUMPTION=[0-9]*[.]?[0-9]*");
		Matcher matcher = pattern.matcher(s);
		matcher.find();
		String characteristic = matcher.group();
		String[] split = characteristic.split("=");
		vacuumCleanerBuilder.powerConsumption(Integer.parseInt(split[1]));

		pattern = Pattern.compile("FILTER_TYPE=\\w*");
		matcher.reset();
		matcher = pattern.matcher(s);
		matcher.find();
		characteristic = matcher.group();
		split = characteristic.split("=");
		vacuumCleanerBuilder.filterType(split[1]);

		pattern = Pattern.compile("BAG_TYPE=[a-zA-z]*[-]?[0-9]*");
		matcher.reset();
		matcher = pattern.matcher(s);
		matcher.find();
		characteristic = matcher.group();
		split = characteristic.split("=");
		vacuumCleanerBuilder.bagType(split[1]);

		pattern = Pattern.compile("WAND_TYPE=\\w*[-]?\\w*[-]?\\w*[-]?\\w*");
		matcher.reset();
		matcher = pattern.matcher(s);
		matcher.find();
		characteristic = matcher.group();
		split = characteristic.split("=");
		vacuumCleanerBuilder.wandType(split[1]);
		
		pattern = Pattern.compile("MOTOR_SPEED_REGULATION=[0-9]*[.]?[0-9]*");
		matcher.reset();
		matcher = pattern.matcher(s);
		matcher.find();
		characteristic = matcher.group();
		split = characteristic.split("=");
		vacuumCleanerBuilder.motorSpeedRegulation(Integer.parseInt(split[1]));
		
		pattern = Pattern.compile("CLEANING_WIDTH=[0-9]*[.]?[0-9]*");
		matcher.reset();
		matcher = pattern.matcher(s);
		matcher.find();
		characteristic = matcher.group();
		split = characteristic.split("=");
		vacuumCleanerBuilder.cleaningWidth(Integer.parseInt(split[1]));

		return vacuumCleanerBuilder.build();

	}

}
