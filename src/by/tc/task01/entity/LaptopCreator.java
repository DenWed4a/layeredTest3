package by.tc.task01.entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LaptopCreator implements ApplianceCreator{
	@Override
	public Laptop create(String string) {

		Laptop.Builder laptopBuilder = BuildersFactory.getBuildersFactory().getLaptopBuilder();

			String s = string;

			Pattern pattern = Pattern.compile("BATTERY_CAPACITY=[0-9]*[.]?[0-9]*");
			Matcher matcher = pattern.matcher(s);
			matcher.find();
			String characteristic = matcher.group();
			String[] split = characteristic.split("=");
			laptopBuilder.batteryCapacity(Double.parseDouble(split[1]));

			pattern = Pattern.compile("OS=\\w*");
			matcher.reset();
			matcher = pattern.matcher(s);
			matcher.find();
			characteristic = matcher.group();
			split = characteristic.split("=");
			laptopBuilder.oS(split[1]);

			pattern = Pattern.compile("MEMORY_ROM=\\d*");
			matcher.reset();
			matcher = pattern.matcher(s);
			matcher.find();
			characteristic = matcher.group();
			split = characteristic.split("=");
			laptopBuilder.memoryRom(Integer.parseInt(split[1]));

			pattern = Pattern.compile("SYSTEM_MEMORY=\\d*");
			matcher.reset();
			matcher = pattern.matcher(s);
			matcher.find();
			characteristic = matcher.group();
			split = characteristic.split("=");
			laptopBuilder.systemMemory(Integer.parseInt(split[1]));

			pattern = Pattern.compile("CPU=[0-9]*[.][0-9]*");
			matcher.reset();
			matcher = pattern.matcher(s);
			matcher.find();
			characteristic = matcher.group();
			split = characteristic.split("=");
			laptopBuilder.cPU(Double.parseDouble(split[1]));

			pattern = Pattern.compile("DISPLAY_INCHS=\\d*");
			matcher.reset();
			matcher = pattern.matcher(s);
			matcher.find();
			characteristic = matcher.group();
			split = characteristic.split("=");
			laptopBuilder.displayInchs(Integer.parseInt(split[1]));
		

		return laptopBuilder.build();

	}

}
