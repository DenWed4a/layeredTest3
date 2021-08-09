package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Criteria {

	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<String, Object>();
	
	public Criteria() {	   	
	}	

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	public String getGroupSearchName() {
		return groupSearchName;
	}
	
	
	public void setGroupSearchName(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}

	public void setCriteria(Map<String, Object> criteria) {
		this.criteria = criteria;
	}
	
	public void clearCriteria() {
		this.criteria.clear();
		this.groupSearchName = null;
	}

	public Map<String, Object> getCriteria() {
		return criteria;
	}

	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}
	
	// you may add your own code here

}
