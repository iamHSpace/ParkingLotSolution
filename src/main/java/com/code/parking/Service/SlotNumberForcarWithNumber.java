package com.code.parking.Service;

import com.code.parking.Models.Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class SlotNumberForcarWithNumber extends ParkingLotConfig {
    @Override
    public void process(String[] instructionArray) throws Exception {
        if (!parking_lot.isEmpty() && parking_lot != null) {
            String carNumber = instructionArray[1]; //get desired registration number

            boolean carFound = false;  // flag to check if a desired car exists or not
            Collection<Car> cars = parking_lot.values();
            List<String> slotNumbers = new ArrayList<>();  // this would be our result list and we would store all slot numbers.

            for (Car car : cars) {
                if (car.getRegNumber().equalsIgnoreCase(carNumber)) {  //  check if registration number matches or not
                    for (Map.Entry<Integer, Car> entry : parking_lot.entrySet()) {
                        if (entry.getValue().equals(car)) {
                            carFound = true;
                            slotNumbers.add(entry.getKey().toString()); // add all cars in result-list
                        }
                    }
                }
            }

            if (carFound == false) {  // if no car found
                System.out.println("No cars found.");
            } else { //if car/cars found.
                System.out.println(String.join(",", slotNumbers));
            }

        } else {
            System.out.println("Parking lot not found.");
        }
    }
}
