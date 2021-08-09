package by.tc.task01.entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpeakersCreator implements ApplianceCreator {

	public Appliance create(String string) {

		Speakers.Builder speakersBuilder = BuildersFactory.getBuildersFactory().getSpeakersBuilder();

		String s = string;

		Pattern pattern = Pattern.compile("POWER_CONSUMPTION=[0-9]*[.]?[0-9]*");
		Matcher matcher = pattern.matcher(s);
		matcher.find();
		String characteristic = matcher.group();
		String[] split = characteristic.split("=");
		speakersBuilder.powerConsumption(Integer.parseInt(split[1]));

		pattern = Pattern.compile("NUMBER_OF_SPEAKERS=[0-9]*[.]?[0-9]*");
		matcher.reset();
		matcher = pattern.matcher(s);
		matcher.find();
		characteristic = matcher.group();
		split = characteristic.split("=");
		speakersBuilder.numberOfSpeakers(Integer.parseInt(split[1]));

		pattern = Pattern.compile("FREQUENCY_RANGE=[0-9]*[.]?[0-9]?[-]?[0-9]*[.]?[0-9]?");
		matcher.reset();
		matcher = pattern.matcher(s);
		matcher.find();
		characteristic = matcher.group();
		split = characteristic.split("=");
		speakersBuilder.frequencyRange(split[1]);

		pattern = Pattern.compile("CORD_LENGTH=[0-9]*[.]?[0-9]*");
		matcher.reset();
		matcher = pattern.matcher(s);
		matcher.find();
		characteristic = matcher.group();
		split = characteristic.split("=");
		speakersBuilder.cordLength(Integer.parseInt(split[1]));

		return speakersBuilder.build();

	}

}
