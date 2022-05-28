package com.code.parking.Input;

import com.code.parking.Service.ParkingLotConfig;
import com.code.parking.Service.ParkingLotConfigImpl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileParser {


    private BufferedReader bufferedReader;

    public FileParser(String string) throws Exception {
        bufferedReader = new BufferedReader(new FileReader(string));
        String instruction;
        while ((instruction = bufferedReader.readLine()) != null) {
            ParkingLotConfig parkingLotConfig = ParkingLotConfigImpl.getParkingLotConfig(instruction);
            String[] instructionArray = instruction.split(" ");
            parkingLotConfig.process(instructionArray);
        }
    }
}
