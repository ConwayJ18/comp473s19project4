package com.online.facilitymanager.model.facility;

public class LocationImpl implements Location
{
	private int addressNumber;
	private String directional;
	private String streetName;
	private String city;
	private String state;
	private int zip;
	private String country;
	
	LocationImpl(){}
	
	/**
	 * @param addressNumber
	 * @param directional
	 * @param streetName
	 * @param city
	 * @param state
	 * @param zip
	 * @param country
	 */
	public LocationImpl(int addressNumber, String directional, String streetName, String city, String state, int zip, String country)
	{
		this.addressNumber = addressNumber;
		this.directional = directional;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}

	/**
	 * @return the addressNumber
	 */
	public int getAddressNumber()
	{
		return addressNumber;
	}

	/**
	 * @param addressNumber the addressNumber to set
	 */
	public void setAddressNumber(int addressNumber)
	{
		this.addressNumber = addressNumber;
	}

	/**
	 * @return the directional
	 */
	public String getDirectional()
	{
		return directional;
	}

	/**
	 * @param directional the directional to set
	 */
	public void setDirectional(String directional)
	{
		this.directional = directional;
	}

	/**
	 * @return the streetName
	 */
	public String getStreetName()
	{
		return streetName;
	}

	/**
	 * @param streetName the streetName to set
	 */
	public void setStreetName(String streetName)
	{
		this.streetName = streetName;
	}

	/**
	 * @return the city
	 */
	public String getCity()
	{
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city)
	{
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState()
	{
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state)
	{
		this.state = state;
	}

	/**
	 * @return the zip
	 */
	public int getZip()
	{
		return zip;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(int zip)
	{
		this.zip = zip;
	}

	/**
	 * @return the country
	 */
	public String getCountry()
	{
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country)
	{
		this.country = country;
	}

	/**
	 * @return a formatted address containing every detail
	 */
	public String getFullAdress()
	{
		return addressNumber + " " + streetName + ", " + city + ", " + state + " " + zip + ", " + country;
	}
}
