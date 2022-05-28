package com.code.parking.Service;

import com.code.parking.Models.Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class SlotNumbersForDriverOfAge extends ParkingLotConfig{
    @Override
    public void process(String[] instructionArray) throws Exception {
        if(!parking_lot.isEmpty() && parking_lot != null){
            String userAge = instructionArray[1]; // desired user age

            boolean carFound = false;
            Collection<Car> cars = parking_lot.values();  // get all cars in parking lot
            List<String> slotNumbers = new ArrayList<>(); //store all desired slotnumbers in this list

            for (Car car : cars) {
                if (car.getUserAge().equalsIgnoreCase(userAge)) {
                    for (Map.Entry<Integer, Car> entry : parking_lot.entrySet()) {
                        if (entry.getValue().equals(car)) {
                            carFound = true;
                            slotNumbers.add(entry.getKey().toString());
                        }
                    }
                }
            }

            if (carFound == false) { // if no desired car is found
                System.out.println("No cars found.");
            } else {  // if car/cars found
                System.out.println(String.join(",", slotNumbers ));
            }
        }else {
            System.out.println("Parking lot not found.");
        }
    }
}
