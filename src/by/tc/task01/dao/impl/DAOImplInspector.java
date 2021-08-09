package by.tc.task01.dao.impl;

import java.io.IOException;
import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.ApplianceCreator;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.LaptopCreator;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.RefrigeratorCreator;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria.Oven;
import by.tc.task01.entity.criteria.SearchCriteria.TabletPC;
import by.tc.task01.entity.parser.LaptopParser;

public class DAOImplInspector {

	public static void main(String[] args) throws IOException {
		
		

		FileApplianceDAO fileDAO = new FileApplianceDAO();
		Criteria criteria = new Criteria();	
		criteria.setGroupSearchName("TabletPC");
		
		criteria.add(TabletPC.COLOR.toString(), "blue");
		criteria.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteria.add(TabletPC.MEMORY_ROM.toString(), 8000);
		criteria.add("POWER_CONSUMPTION", 100);
		LaptopParser lp = new LaptopParser();
		LaptopCreator apCr = new LaptopCreator();

		
		Appliance laptop = apCr.create("Laptop : BATTERY_CAPACITY=3, OS=Windows,"
				+ " MEMORY_ROM=8000, SYSTEM_MEMORY=1500, CPU=3.2, DISPLAY_INCHS=22");
		String s = laptop.ApplianceToString();
		fileDAO.add(laptop);
		
		System.out.println(s);
		//lap = lp.parseLaptop(laptop);
		System.out.println(s);
		
		
		
		List<Appliance> list = fileDAO.find(criteria);
		
		
		
		for(Appliance app : list) {
			System.out.println(app);
		}
		
		criteria.clearCriteria();
		criteria.setGroupSearchName("Laptop");
		
		list = fileDAO.find(criteria);
		
		
		
		for(Appliance app : list) {
			System.out.println(app);
		}
		
		criteria.clearCriteria();
		//criteria.setGroupSearchName("Oven");
		criteria.add(Oven.POWER_CONSUMPTION.toString(), 100);
		
		list = fileDAO.find(criteria);
		
		
		
		for(Appliance app : list) {
			System.out.println(app);
		}
		

	}
}
