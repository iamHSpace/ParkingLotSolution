package com.code.parking.Service;

import java.util.Collection;
import java.util.Collections;

public class LeaveService extends ParkingLotConfig{
    @Override
    public void process(String[] instructionArray) throws Exception {
        if(!parking_lot.isEmpty() && parking_lot != null){
            Integer slotNumber = Integer.parseInt(instructionArray[1]);
            if(slotNumber>=total_slots_alloted){
                System.out.println("Slot number : " + slotNumber + " does not exist.");
            }else {
                parking_lot.remove(slotNumber);
                System.out.println("Slot number : " + slotNumber + " is free.");
                slots_available.add(slotNumber);
                Collections.sort(slots_available);
            }
        }else {
            System.out.println("Parking lot is already empty");
        }
    }
}
