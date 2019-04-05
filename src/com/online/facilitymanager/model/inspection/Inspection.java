package com.online.facilitymanager.model.inspection;

import com.online.facilitymanager.model.slot.Slot;

public abstract class Inspection
{
  protected InspectionType inspectionType;
  protected Slot slot;

	public Inspection() {}

  /**
	 * @param inspectionType
	 * @param slot
	 */
	public Inspection(InspectionType inspectionType, Slot slot)
	{
		this.inspectionType = inspectionType;
		this.slot = slot;
	}

  /**
   * @return the inspectionType
   */
  abstract public String getInspectionType();

  /**
   * @param inspectionType the inspectionType to set
   */
  abstract public void inspectionType(InspectionType inspectionType);

  /**
   * @return the slot
   */
  abstract public Slot getSlot();

  /**
   * @param slot the slot to set
   */
  abstract public void setSlot(Slot slot);
}
