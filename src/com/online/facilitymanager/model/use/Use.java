package com.online.facilitymanager.model.use;

import java.util.ArrayList;

public interface Use
{
	public ArrayList<UseRequest> getRequests();
	public void addRequest(UseRequest request);
	public UseSchedule getSchedule();
	public void setSchedule(UseSchedule schedule);
}
