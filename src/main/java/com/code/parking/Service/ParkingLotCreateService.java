package com.code.parking.Service;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotCreateService extends ParkingLotConfig{

    //this class creates a new Parking slot.

    @Override
    public void process(String[] instructionArray) {
        Integer totalParkingSpace = Integer.valueOf(instructionArray[1]);
        ArrayList<Integer> spaceInParkingLot = new ArrayList<>();

        for(int i=0;i<totalParkingSpace;i++){
            spaceInParkingLot.add(i);
        }
        slots_available = spaceInParkingLot;
        total_slots_alloted = totalParkingSpace;

        System.out.println("Created parking slot of space : "+ totalParkingSpace +" ");
    }
}
