package com.online.facilitymanager.model.facility;

public class FacilityDetailImpl implements FacilityDetail
{
	private int id;
	private String name;
	private int capacity;
	private int squareFeet;
	
	FacilityDetailImpl(){}

	/**
	 * @param id
	 * @param name
	 * @param capacity
	 * @param squareFeet
	 */
	public FacilityDetailImpl(FacilityDetailBuilder builder)
	{
		this.id = builder.id;
		this.name = builder.name;
		this.capacity = builder.capacity;
		this.squareFeet = builder.squareFeet;
	}

	/**
	 * @return the id
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id)
	{
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity()
	{
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}

	/**
	 * @return the squareFeet
	 */
	public int getSquareFeet()
	{
		return squareFeet;
	}

	/**
	 * @param squareFeet the squareFeet to set
	 */
	public void setSquareFeet(int squareFeet)
	{
		this.squareFeet = squareFeet;
	}
	
	public static class FacilityDetailBuilder 
	{
		private int id;
		private String name;
		private int capacity;
		private int squareFeet;
		
		private FacilityDetailBuilder() {}
		
		public static FacilityDetailBuilder newInstance()
		{
			return new FacilityDetailBuilder();
		}

		/**
		 * @param id the id to set
		 */
		public FacilityDetailBuilder setId(int id)
		{
			this.id = id;
			return this;
		}

		/**
		 * @param name the name to set
		 */
		public FacilityDetailBuilder setName(String name)
		{
			this.name = name;
			return this;
		}

		/**
		 * @param capacity the capacity to set
		 */
		public FacilityDetailBuilder setCapacity(int capacity)
		{
			this.capacity = capacity;
			return this;
		}

		/**
		 * @param squareFeet the squareFeet to set
		 */
		public FacilityDetailBuilder setSquareFeet(int squareFeet)
		{
			this.squareFeet = squareFeet;
			return this;
		}
		
		public FacilityDetail build()
		{
			return new FacilityDetailImpl(this);
		}
	}
}