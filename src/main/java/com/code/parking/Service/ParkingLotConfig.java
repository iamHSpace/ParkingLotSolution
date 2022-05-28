package com.code.parking.Service;

import com.code.parking.Models.Car;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class ParkingLotConfig {

    public static ArrayList<Integer> slots_available;
    public static int total_slots_alloted;
    public static HashMap<Integer, Car> parking_lot = new HashMap<>();

    public abstract void process(String[] instructionArray) throws Exception;


}
