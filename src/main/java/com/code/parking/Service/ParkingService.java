package com.code.parking.Service;

import com.code.parking.Models.Car;

import java.util.List;

public class ParkingService extends ParkingLotConfig {
    // this class is to mark slots as parked.
    @Override
    public void process(String[] instructionArray) throws Exception {
        if (!parking_lot.isEmpty() || parking_lot != null) { // check if parking slot exists and is not empty
            Car car = new Car(instructionArray[1], instructionArray[3]); // create a new car object on basis of registration number and age of driver/user
            List<Integer> totalSlotsLeft = slots_available;

            if (totalSlotsLeft.isEmpty()) {
                System.out.println("No spaces left in Parking Space");
            } else {
                Integer parkingSlotNumber = totalSlotsLeft.get(0);
                if (total_slots_alloted >= totalSlotsLeft.size()) {
                    parking_lot.put(parkingSlotNumber, car); // add a new car in parking-lot-map.
                }
                System.out.println("Allocated slot number : " + parkingSlotNumber + " to Car : " + car.getRegNumber());
                totalSlotsLeft.remove(0); // remove slot from vacant-slot-list
            }
        } else {
//            throw exception if there no parking lot to be found.
            throw new Exception("No Parking lot found.");
        }
    }
}
