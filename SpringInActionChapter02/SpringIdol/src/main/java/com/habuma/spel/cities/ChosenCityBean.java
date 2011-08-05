package com.habuma.spel.cities;

import java.util.Collection;

public class ChosenCityBean {

private City choosenCity;
private Collection<City> lowpopulationcities;
private Collection<String> citynames;

public Collection<String> getCitynames() {
	return citynames;
}

public void setCitynames(Collection<String> citynames) {
	this.citynames = citynames;
}

public Collection<City> getLowpopulationcities() {
	return lowpopulationcities;
}

public void setLowpopulationcities(Collection<City> lowpopulationcities) {
	this.lowpopulationcities = lowpopulationcities;
}

public City getChoosenCity() {
	return choosenCity;
}

public void setChoosenCity(City choosenCity) {
	this.choosenCity = choosenCity;
}


}
