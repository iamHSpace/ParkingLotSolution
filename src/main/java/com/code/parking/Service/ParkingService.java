package com.code.parking.Service;

import com.code.parking.Models.Car;

import java.util.List;

public class ParkingService extends ParkingLotConfig {
    @Override
    public void process(String[] instructionArray) throws Exception {
        if (!parking_lot.isEmpty() || parking_lot != null) {
            Car car = new Car(instructionArray[1], instructionArray[3]);
            List<Integer> totalSlotsLeft = slots_available;

            if (totalSlotsLeft.isEmpty()) {
                System.out.println("No spaces left in Parking Space");
            } else {
                Integer parkingSlotNumber = totalSlotsLeft.get(0);
                if(total_slots_alloted>=totalSlotsLeft.size()){
                    parking_lot.put(parkingSlotNumber,car);
                }
                System.out.println("Allocated slot number : "+parkingSlotNumber+ " to Car : "+ car.getRegNumber());
                totalSlotsLeft.remove(0);
            }

        } else {
//            throw exc that it is empty
            throw new Exception("Not Parking lot found.");
        }
    }
}
