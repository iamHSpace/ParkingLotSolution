package com.code.parking.Input;

import com.code.parking.Service.ParkingLotConfig;
import com.code.parking.Service.ParkingLotConfigImpl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileParser {


    private BufferedReader bufferedReader;

    public FileParser(String string) throws Exception {  // this class reads from input.txt file and converts all instructions in list of instructions.
        try {
            bufferedReader = new BufferedReader(new FileReader(string)); // read file from location.
            String instruction;
            while ((instruction = bufferedReader.readLine()) != null) {
                ParkingLotConfig parkingLotConfig = ParkingLotConfigImpl.getParkingLotConfig(instruction); // get ParkingLotConfig on basis of query
                String[] instructionArray = instruction.split(" ");
                parkingLotConfig.process(instructionArray); // process list of instructions.
            }
        }catch (Exception e){
            throw  new Exception(e.getMessage());
        }
    }
}
