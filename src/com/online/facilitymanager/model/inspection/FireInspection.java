package com.online.facilitymanager.model.inspection;

import com.online.facilitymanager.model.slot.Slot;

public class FireInspection extends Inspection
{
      public FireInspection() {
        super();
        this.inspectionType = "Fire";
      }

      /**
    	 * @param inspectionType
    	 * @param slot
    	 */
    	public FireInspection(String inspectionType, Slot slot)
    	{
    		super(inspectionType, slot);
    	}

      /**
       * @return the inspectionType
       */
      public String getInspectionType()
      {
        return "Fire";
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
      @Override
      public void setSlot(Slot slot)
      {
        this.slot = slot;
      }

	@Override
	public void acceptVisitor(Visitor v) {
		v.visit(this);
	}
}