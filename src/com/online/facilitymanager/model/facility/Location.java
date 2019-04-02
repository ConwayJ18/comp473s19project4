package com.online.facilitymanager.model.facility;

public interface Location
{
	public int getAddressNumber();
	public void setAddressNumber(int addressNumber);
	public String getDirectional();
	public void setDirectional(String directional);
	public String getStreetName();
	public void setStreetName(String streetName);
	public String getCity();
	public void setCity(String city);
	public String getState();
	public void setState(String state);
	public int getZip();
	public void setZip(int zip);
	public String getCountry();
	public void setCountry(String country);
	public String getFullAdress();
}
