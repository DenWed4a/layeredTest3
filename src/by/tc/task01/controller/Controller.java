package by.tc.task01.controller;

import by.tc.task01.entity.criteria.Criteria;

public class Controller {
	
	private static final int COMMAND_NAME = 0;
	private static final int APPLIANCE_TYPE = 1;
	private static final String FIND_IN_ALL_PARAM = "all";
	
	public void doAction(String request) {
		String[] params = request.split("\\s+");
		String command = params[COMMAND_NAME];
		String applianceType = params[APPLIANCE_TYPE].split("=")[1];
		
		Criteria criteria = new Criteria();
		
		if(!FIND_IN_ALL_PARAM.equals(applianceType)) {
			criteria.setGroupSearchName(applianceType);
		}
				
				
				//String request = "find type=Oven POWER_CONSUMPTION=1000 WEIGHT=10 CAPACITY=32";
	}

}
