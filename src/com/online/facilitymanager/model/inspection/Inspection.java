package com.online.facilitymanager.model.inspection;

import com.online.facilitymanager.model.slot.Slot;

public interface Inspection
{
	public String getInspectionType();
	public void setInspectionType(String inspectionType);
	public Slot getSlot();
	public void setSlot(Slot slot);
}
