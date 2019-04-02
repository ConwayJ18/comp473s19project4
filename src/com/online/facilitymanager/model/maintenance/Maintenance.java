package com.online.facilitymanager.model.maintenance;

import java.util.ArrayList;

import com.online.facilitymanager.model.slot.Slot;

public interface Maintenance
{
	public MaintenanceSchedule getMaintSchedule();
	public void setMaintenanceSchedule(MaintenanceSchedule maintSchedule);
	public MaintenanceLog getMaintenanceLog();
	public void setMaintenanceLog(MaintenanceLog maintLog);
	public ArrayList<MaintenanceOrder> getMaintenanceOrders();
	public ArrayList<MaintenanceRequest> getMaintenanceReqs();
	public void addMaintenanceRequest(MaintenanceRequest maintReq);
	public void addOrderToSchedule(MaintenanceOrder maintOrder, Slot timeSlot);
	public void addMaintenanceOrder(MaintenanceOrder maintOrder);
	public void addOrderToLog(MaintenanceOrder maintOrder);
}
