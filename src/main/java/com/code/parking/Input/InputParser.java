package com.code.parking.Input;

import com.code.parking.Service.ParkingLotConfig;
import com.code.parking.Service.ParkingLotConfigImpl;

import java.util.Scanner;

public class InputParser {

    public InputParser() throws Exception {

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter Input : ");   // ask user for input instructions.
            String instruction = scanner.nextLine();

            String[] instructionArray = instruction.split(" ");  // convert instruction line into an array
            ParkingLotConfig parkingLotConfig =  ParkingLotConfigImpl.getParkingLotConfig(instruction);  // get respective ParkingLotConfig according to instruction provided.

            System.out.println("Output : ");
            parkingLotConfig.process(instructionArray);  // process instruction array
        }

    }
}
