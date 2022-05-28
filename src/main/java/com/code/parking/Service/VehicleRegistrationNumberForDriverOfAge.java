package com.code.parking.Service;

import com.code.parking.Models.Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class VehicleRegistrationNumberForDriverOfAge extends ParkingLotConfig{
    @Override
    public void process(String[] instructionArray) throws Exception {
        if(!parking_lot.isEmpty() && parking_lot != null){
            String userAge = instructionArray[1];

            boolean carFound = false;
            Collection<Car> cars = parking_lot.values();
            List<String> vehRegNumbers = new ArrayList<>();

            for (Car car : cars) {
                if (car.getUserAge().equalsIgnoreCase(userAge)) {
                    carFound = true;
                    vehRegNumbers.add(car.getRegNumber());
                }
            }

            if (carFound == false) {
                System.out.println("No cars found.");
            } else {
                System.out.println(String.join(",", vehRegNumbers ));
            }
        }else {
            System.out.println("Parking lot not found.");
        }
    }
}
