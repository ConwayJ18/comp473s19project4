package com.online.facilitymanager.model.maintenance;

import com.online.facilitymanager.model.slot.Date;

public interface MaintenanceOrder
{
	public int getUrgency();
	public void setUrgency(int urgency);
	public String getDetail();
	public void setDetail(String detail);
	public Date getRequestDate();
	public void setRequestDate(Date requestDate);
	public Date getOrderDate();
	public void setOrderDate(Date orderDate);
	public int getCost();
	public void setCost(int cost);
}
