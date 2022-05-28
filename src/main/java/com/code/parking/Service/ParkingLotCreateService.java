package com.code.parking.Service;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotCreateService extends ParkingLotConfig{

    //this class creates a new Parking slot.

    @Override
    public void process(String[] instructionArray) {
        Integer totalParkingSpace = Integer.valueOf(instructionArray[1]);  // get total number of slots to be created in out parking lot.
        ArrayList<Integer> spaceInParkingLot = new ArrayList<>();  // a list to mark new vacant slot

        for(int i=0;i<totalParkingSpace;i++){  // add vacant slots in a list.
            spaceInParkingLot.add(i);
        }
        //assign these values to static variables to that they can be used from anywhere in out project
        slots_available = spaceInParkingLot;
        total_slots_alloted = totalParkingSpace;

        // give output that parking lot has been created.
        System.out.println("Created parking slot of space : "+ totalParkingSpace +" ");
    }
}
