package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.ApplianceCreator;
import by.tc.task01.entity.SpecificApplianceCriator;
import by.tc.task01.entity.criteria.Criteria;


public class FileApplianceDAO implements ApplianceDAO {

	@Override
	public List<Appliance> find(Criteria criteria) throws IOException {

		List<Appliance> result = new ArrayList<>();
		List<String> applianceString;
		Map<String, Object> params = criteria.getCriteria();
		String searchGroupName = criteria.getGroupSearchName();
		Finder finder = new Finder();
		SpecificApplianceCriator appCreator = new SpecificApplianceCriator();

		if (criteria.getGroupSearchName() == null) {
			applianceString = finder.findByParams(params);

			for (int i = 0; i < applianceString.size(); i++) {
				String[] split = applianceString.get(i).split("\s");
				result.add(appCreator.create(split[0], applianceString.get(i)));
			}
		} else if (params.size() == 0 && searchGroupName != null) {
			applianceString = finder.findByName(searchGroupName);
			for (int i = 0; i < applianceString.size(); i++) {
				result.add(appCreator.create(searchGroupName, applianceString.get(i)));
			}
		} else if (params.size() > 0 && searchGroupName != null) {
			applianceString = finder.findByNameAndParams(searchGroupName, params);
			for (int i = 0; i < applianceString.size(); i++) {
				result.add(appCreator.create(searchGroupName, applianceString.get(i)));
			}
		}
		return result;

	}

	@Override
	public void add(Appliance appliance) throws IOException {
		List<String> applianceList = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new FileReader("src/resources/appliances_db.txt"));
		while (reader.ready()) {
			applianceList.add(reader.readLine());
		}
		reader.close();
		applianceList.add(appliance.ApplianceToString());
		Collections.sort(applianceList);

		BufferedWriter writer = new BufferedWriter(new FileWriter("src/resources/appliances_db.txt"));
		for (int i = 0; i < applianceList.size(); i++) {
			if (applianceList.get(i).length() > 0) {
				writer.write(applianceList.get(i) + "\n");
			}


		}

		writer.close();

	}

	@Override
	public void remove(Appliance appliance) {
		// TODO Auto-generated method stub

	}

	// you may add your own code here

}

//you may add your own new classes