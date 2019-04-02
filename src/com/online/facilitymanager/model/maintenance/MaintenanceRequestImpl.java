package com.online.facilitymanager.model.maintenance;

import com.online.facilitymanager.model.slot.Date;

public class MaintenanceRequestImpl implements MaintenanceRequest
{
	private int urgency;
	private String detail;
	private Date requestDate;
	
	public MaintenanceRequestImpl() {}
	
	/**
	 * @param urgency
	 * @param detail
	 * @param requestDate
	 */
	public MaintenanceRequestImpl(int urgency, String detail, Date requestDate)
	{
		this.urgency = urgency;
		this.detail = detail;
		this.requestDate = requestDate;
	}

	/**
	 * @return the urgency
	 */
	public int getUrgency()
	{
		return urgency;
	}

	/**
	 * @param urgency the urgency to set
	 */
	public void setUrgency(int urgency)
	{
		this.urgency = urgency;
	}

	/**
	 * @return the detail
	 */
	public String getDetail()
	{
		return detail;
	}

	/**
	 * @param detail the detail to set
	 */
	public void setDetail(String detail)
	{
		this.detail = detail;
	}

	/**
	 * @return the requestDate
	 */
	public Date getRequestDate()
	{
		return requestDate;
	}

	/**
	 * @param requestDate the requestDate to set
	 */
	public void setRequestDate(Date requestDate)
	{
		this.requestDate = requestDate;
	}	
}
