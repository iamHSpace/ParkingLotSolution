package com.code.parking.Input;

import com.code.parking.Service.ParkingLotConfig;
import com.code.parking.Service.ParkingLotConfigImpl;

import java.util.Scanner;

public class InputParser {

    public InputParser() throws Exception {

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Enter Input : ");
            String instruction = scanner.nextLine();

            String[] instructionArray = instruction.split(" ");
            ParkingLotConfig parkingLotConfig =  ParkingLotConfigImpl.getParkingLotConfig(instruction);

            System.out.println("Output : ");
            parkingLotConfig.process(instructionArray);
        }

    }
}
