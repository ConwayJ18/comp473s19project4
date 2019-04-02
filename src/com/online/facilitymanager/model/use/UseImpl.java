package com.online.facilitymanager.model.use;

import java.util.ArrayList;

public class UseImpl implements Use
{
	private ArrayList<UseRequest> requests;
	private UseSchedule schedule;
	
	public UseImpl() {}
	
	/**
	 * @param user
	 * @param schedule
	 */
	public UseImpl(UseSchedule schedule)
	{
		this.requests = new ArrayList<UseRequest>();
		this.schedule = schedule;
	}

	/**
	 * @return the user
	 */
	public ArrayList<UseRequest> getRequests()
	{
		return requests;
	}
	
	/**
	 * @param user the user to set
	 */
	public void setRequests(ArrayList<UseRequest> requests)
	{
		this.requests = requests;
	}

	/**
	 * @param user the user to set
	 */
	public void addRequest(UseRequest request)
	{
		requests.add(request);
	}

	/**
	 * @return the schedule
	 */
	public UseSchedule getSchedule()
	{
		return schedule;
	}

	/**
	 * @param schedule the schedule to set
	 */
	public void setSchedule(UseSchedule schedule)
	{
		this.schedule = schedule;
	}
}
