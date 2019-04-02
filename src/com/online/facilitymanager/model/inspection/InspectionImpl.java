package com.online.facilitymanager.model.inspection;

import com.online.facilitymanager.model.slot.Slot;

public class InspectionImpl implements Inspection
{
	private String inspectionType;
	private Slot slot;
	
	public InspectionImpl() {}

	/**
	 * @param inspectionType
	 * @param slot
	 */
	public InspectionImpl(String inspectionType, Slot slot)
	{
		this.inspectionType = inspectionType;
		this.slot = slot;
	}

	/**
	 * @return the inspectionType
	 */
	public String getInspectionType()
	{
		return inspectionType;
	}

	/**
	 * @param inspectionType the inspectionType to set
	 */
	public void setInspectionType(String inspectionType)
	{
		this.inspectionType = inspectionType;
	}

	/**
	 * @return the slot
	 */
	public Slot getSlot()
	{
		return slot;
	}

	/**
	 * @param slot the slot to set
	 */
	public void setSlot(Slot slot)
	{
		this.slot = slot;
	}	
}
