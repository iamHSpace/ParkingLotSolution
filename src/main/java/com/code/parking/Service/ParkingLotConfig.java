package com.code.parking.Service;

import com.code.parking.Models.Car;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class ParkingLotConfig {

    public static ArrayList<Integer> slots_available;   // it indicates number of slots available at any given moment.
    public static int total_slots_alloted;  // it indicates number of slots allocated at any given moment
    public static HashMap<Integer, Car> parking_lot = new HashMap<>();  // keeps record of <slot, car> in our parking lot.

    public abstract void process(String[] instructionArray) throws Exception;


}
