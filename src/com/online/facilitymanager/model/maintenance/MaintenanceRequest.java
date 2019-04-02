package com.online.facilitymanager.model.maintenance;

import com.online.facilitymanager.model.slot.Date;

public interface MaintenanceRequest
{
	public int getUrgency();
	public void setUrgency(int urgency);
	public String getDetail();
	public void setDetail(String detail);
	public Date getRequestDate();
	public void setRequestDate(Date requestDate);
}
