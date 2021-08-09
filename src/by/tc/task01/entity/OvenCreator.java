package by.tc.task01.entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OvenCreator implements ApplianceCreator{

	public Appliance create(String string) {
		
		Oven.Builder ovenBuilder = BuildersFactory.getBuildersFactory().getOvenBuilder();

			String s = string;

			Pattern pattern = Pattern.compile("POWER_CONSUMPTION=\\d*");
			Matcher matcher = pattern.matcher(s);
			matcher.find();
			String characteristic = matcher.group();
			String[] split = characteristic.split("=");
			ovenBuilder.powerConsumption(Integer.parseInt(split[1]));

			pattern = Pattern.compile("WEIGHT=\\d*");
			matcher.reset();
			matcher = pattern.matcher(s);
			matcher.find();
			characteristic = matcher.group();
			split = characteristic.split("=");
			ovenBuilder.weight(Integer.parseInt(split[1]));

			pattern = Pattern.compile("CAPACITY=\\d*");
			matcher.reset();
			matcher = pattern.matcher(s);
			matcher.find();
			characteristic = matcher.group();
			split = characteristic.split("=");
			ovenBuilder.capacity(Integer.parseInt(split[1]));

			pattern = Pattern.compile("DEPTH=\\d*");
			matcher.reset();
			matcher = pattern.matcher(s);
			matcher.find();
			characteristic = matcher.group();
			split = characteristic.split("=");
			ovenBuilder.depth(Integer.parseInt(split[1]));

			pattern = Pattern.compile("HEIGHT=[0-9]*[.]?[0-9]*");
			matcher.reset();
			matcher = pattern.matcher(s);
			matcher.find();
			characteristic = matcher.group();
			split = characteristic.split("=");
			ovenBuilder.height(Double.parseDouble(split[1]));

			pattern = Pattern.compile("WIDTH=[0-9]*[.]?[0-9]*");
			matcher.reset();
			matcher = pattern.matcher(s);
			matcher.find();
			characteristic = matcher.group();
			split = characteristic.split("=");
			ovenBuilder.width(Double.parseDouble(split[1]));

	

		return ovenBuilder.build();

	}

}
