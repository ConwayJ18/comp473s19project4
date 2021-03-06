package com.online.facilitymanager.model.inspection;

import com.online.facilitymanager.model.slot.Slot;

public class SafetyInspection extends Inspection
{
	SafetyInspection() {
        super();
        this.inspectionType = "Safety";
      }

      /**
    	 * @param inspectionType
    	 * @param slot
    	 */
    	public SafetyInspection(String inspectionType, Slot slot)
    	{
    		super(inspectionType, slot);
    	}

      /**
       * @return the inspectionType
       */
      public String getInspectionType()
      {
        return "Safety";
      }

      /**
       * @param inspectionType the inspectionType to set
       */
      public void inspectionType(String inspectionType)
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

	@Override
	public void acceptVisitor(Visitor v) {
		v.visit(this);
	}
 }
