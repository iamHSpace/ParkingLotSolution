package com.code.parking.Service;

import java.util.Collections;

public class LeaveService extends ParkingLotConfig{
    @Override
    public void process(String[] instructionArray) throws Exception {
        if(parking_lot != null && !parking_lot.isEmpty()){  //check if parking_lot exists and if parkinglot id empty or not
            Integer slotNumber = Integer.parseInt(instructionArray[1]);  //get slot number from input instructionArray
            if(slotNumber>=total_slots_alloted){   // if slotNumber is more than total parking slots, then tell user that slot number does not exist.
                System.out.println("Slot number : " + slotNumber + " does not exist.");
            }else {
                parking_lot.remove(slotNumber); // remove slotNumber from parking lot, hence marking it empty.
                System.out.println("Slot number : " + slotNumber + " is free.");
                slots_available.add(slotNumber);  // add slotNumber to available slots, hence marking it available.
                Collections.sort(slots_available); // sort, so that user gets first available slot while filling filling.
            }
        }else {
            System.out.println("Parking lot is already empty");
        }
    }
}
