package cap2;

import java.util.Collection;
import java.util.Map;

public class City {
	private String name;
	private String state;
	private int population;
	private Map<String,String> systemEnvironmentMap;
	private Map<String,String> systemPropertiesMap;
	private Collection<City> bigCities;
	private City firstBigCity;
	private City lastBigCity;
	
	
	public Collection<City> getBigCities() {
		return bigCities;
	}
	public void setBigCities(Collection<City> bigCities) {
		this.bigCities = bigCities;
	}
	public City getFirstBigCity() {
		return firstBigCity;
	}
	public void setFirstBigCity(City firstBigCity) {
		this.firstBigCity = firstBigCity;
	}
	public City getLastBigCity() {
		return lastBigCity;
	}
	public void setLastBigCity(City lastBigCity) {
		this.lastBigCity = lastBigCity;
	}

	
	
	public Map<String, String> getSystemPropertiesMap() {
		return systemPropertiesMap;
	}
	public void setSystemPropertiesMap(Map<String, String> systemPropertiesMap) {
		this.systemPropertiesMap = systemPropertiesMap;
	}
	public Map<String, String> getSystemEnvironmentMap() {
		return systemEnvironmentMap;
	}
	public void setSystemEnvironmentMap(Map<String, String> systemEnvironmentMap) {
		this.systemEnvironmentMap = systemEnvironmentMap;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
	
}
