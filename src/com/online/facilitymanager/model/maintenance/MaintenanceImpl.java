package com.online.facilitymanager.model.maintenance;

import java.util.ArrayList;

import com.online.facilitymanager.model.slot.Slot;

public class MaintenanceImpl implements Maintenance
{
	private MaintenanceSchedule maintenanceSchedule;
	private ArrayList<MaintenanceOrder> maintenanceOrders;
	private MaintenanceLog maintenanceLog;
	private ArrayList<MaintenanceRequest> maintenanceRequests;

	public MaintenanceImpl() {}

	/**
	 * @param maintSchedule
	 * @param maintOrder
	 * @param maintLog
	 * @param maintReq
	 */
	public MaintenanceImpl(MaintenanceSchedule schedule, MaintenanceLog log)
	{
		this.maintenanceSchedule = schedule;
		this.maintenanceOrders = new ArrayList<MaintenanceOrder>();
		this.maintenanceLog = log;
		this.maintenanceRequests = new ArrayList<MaintenanceRequest>();
	}

	/**
	 * @return the maintSchedule
	 */
	public MaintenanceSchedule getMaintSchedule()
	{
		return maintenanceSchedule;
	}
	
	/**
	 * @param maintSchedule the maintSchedule to set
	 */
	public void setMaintenanceSchedule(MaintenanceSchedule maintSchedule)
	{
		this.maintenanceSchedule = maintSchedule;
	}
	
	/**
	 * @return the maintLog
	 */
	public MaintenanceLog getMaintenanceLog()
	{
		return maintenanceLog;
	}
	
	/**
	 * @param maintLog the maintLog to set
	 */
	public void setMaintenanceLog(MaintenanceLog maintLog)
	{
		this.maintenanceLog = maintLog;
	}
	
	/**
	 * @return the maintOrder
	 */
	public ArrayList<MaintenanceOrder> getMaintenanceOrders()
	{
		return maintenanceOrders;
	}
	
	/**
	 * @param maintOrders the maintOrders to set
	 */
	public void setMaintenanceOrders(ArrayList<MaintenanceOrder> maintOrders)
	{
		this.maintenanceOrders = maintOrders;
	}

	/**
	 * @return the maintReq
	 */
	public ArrayList<MaintenanceRequest> getMaintenanceReqs() {
		return maintenanceRequests;
	}
	
	/**
	 * @param maintReq the maintReq to set
	 */
	public void setMaintenanceRequests(ArrayList<MaintenanceRequest> maintReq) {
		this.maintenanceRequests = maintReq;
	}
	
	/**
	 * @param maintReq the maintReq to set
	 */
	public void addMaintenanceRequest(MaintenanceRequest maintReq) {
		maintenanceRequests.add(maintReq);
	}
	
	/**
	 * @param maintOrder the maintOrder to add
	 */
	public void addOrderToSchedule(MaintenanceOrder maintOrder, Slot timeSlot) {
		maintenanceSchedule.getSchedule().put(maintOrder, timeSlot);
		maintenanceOrders.remove(maintOrder);
	}

	/**
	 * @param maintOrder the maintOrder to set
	 */
	public void addMaintenanceOrder(MaintenanceOrder maintOrder) {
		maintenanceOrders.add(maintOrder);
	}

	/**
	 * @param maintOrder the maintOrder to add
	 */
	public void addOrderToLog(MaintenanceOrder maintOrder) {
		maintenanceLog.getLog().put(maintOrder, maintenanceSchedule.getSchedule().get(maintOrder));
		maintenanceSchedule.getSchedule().remove(maintOrder);
	}
}
