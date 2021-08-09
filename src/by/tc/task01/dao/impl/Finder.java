package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Finder {

	public List<String> findByName(String applianceName) throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader("src/resources/appliances_db.txt"));
		List<String> appliances = new ArrayList<String>();
		String s;
		try {
			while (reader.ready()) {
				s = reader.readLine();
				if (s.contains(applianceName)) {
					appliances.add(s);
				}

			}
		} finally {
			reader.close();
		}

		return appliances;

	}

	public List<String> findByParams(Map<String, Object> params) throws IOException {
		List<String> appliances = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new FileReader("src/resources/appliances_db.txt"));
		String s;
		boolean itsMyString = true;
		try {
			while (reader.ready()) {
				s = reader.readLine();
				for (Map.Entry<String, Object> pair : params.entrySet()) {
					Pattern pattern = Pattern.compile(pair.getKey()+"="+pair.getValue() + "\\b");
					Matcher matcher = pattern.matcher(s);
					if (!matcher.find()) {
						itsMyString = false;
					}
				}
				if (itsMyString) {
					appliances.add(s);
				}
				itsMyString = true;
			}
		} finally {
			reader.close();
		}

		return appliances;

	}

	public List<String> findByNameAndParams(String applianceName, Map<String, Object> params) throws IOException {

		List<String> result = new ArrayList<String>();
		List<String> appliance = findByName(applianceName);

		boolean itsMyString = true;
		for (int i = 0; i < appliance.size(); i++) {
			for (Map.Entry<String, Object> pair : params.entrySet()) {

				Pattern pattern = Pattern.compile(pair.getKey() + "=" + pair.getValue() + "\\b");
				Matcher matcher = pattern.matcher(appliance.get(i));
				if (!matcher.find()) {
					itsMyString = false;
					break;
				}
			}
			if (itsMyString) {
				result.add(appliance.get(i));
			}
			itsMyString = true;

		}

		return result;

	}

}
