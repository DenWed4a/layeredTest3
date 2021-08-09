package by.tc.task01.entity.parser;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

public class LaptopParser {

	
	public String parseLaptop(Laptop laptop) {
		return String.format(laptop.getClass().getName()+"\s:\sBATTERY_CAPACITY=%f,\sOS=%s,\sMEMORY_ROM=%d,"
				+ "\sSYSTEM_MEMORY=%d,\sCPU=%f,\sDISPLAY_INCHS=%f", laptop.getBatteryCapacity(), laptop.getoS(), laptop.getMemoryRom(), 
				laptop.getSystemMemory(), laptop.getcPU(), laptop.getDisplayInchs() );
	}



}
