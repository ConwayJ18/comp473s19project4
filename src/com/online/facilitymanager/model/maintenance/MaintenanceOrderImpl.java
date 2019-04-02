package com.online.facilitymanager.model.maintenance;

import com.online.facilitymanager.model.slot.Date;

public class MaintenanceOrderImpl implements MaintenanceOrder
{
	private int urgency;
	private String detail;
	private Date requestDate;
	private Date orderDate;
	private int cost;
	
	public MaintenanceOrderImpl() {}

	/**
	 * @param mr
	 * @param orderDate
	 * @param cost
	 */
	public MaintenanceOrderImpl(MaintenanceRequest mr, Date orderDate, int cost) {
		this.urgency = mr.getUrgency();
		this.detail = mr.getDetail();
		this.requestDate = mr.getRequestDate();
		this.orderDate = orderDate;
		this.cost = cost;
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
	public String getDetail() {
		return detail;
	}

	/**
	 * @param detail the detail to set
	 */
	public void setDetail(String detail) {
		this.detail = detail;
	}

	/**
	 * @return the requestDate
	 */
	public Date getRequestDate() {
		return requestDate;
	}

	/**
	 * @param requestDate the requestDate to set
	 */
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	/**
	 * @return the orderDate
	 */
	public Date getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}
}
