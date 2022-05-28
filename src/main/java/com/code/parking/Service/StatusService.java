package com.code.parking.Service;

import com.code.parking.Models.Car;

public class StatusService extends ParkingLotConfig{
    @Override
    public void process(String[] instructionArray) throws Exception {
        if (!parking_lot.isEmpty() && parking_lot!=null){
            System.out.println("Slot no. \t Registration Number \t Age");
            for(int i=0;i<parking_lot.size();i++){
                if(parking_lot.containsKey(i)){
                    Car car = parking_lot.get(i);
                    System.out.println(i + " \t " +car.getRegNumber() +" \t " + car.getUserAge());
                }
            }
        }else {
            System.out.println("Parking lot is empty");
        }
    }
}
