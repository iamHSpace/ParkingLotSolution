package com.code.parking.Service;

public class ParkingLotConfigImpl {

    public static ParkingLotConfig getParkingLotConfig(String instruction) throws Exception {
        // this methods sorts instructions on basis of their instruction type

        if (instruction.contains("Create_parking_lot")) {    // if user needs to create a new parking lot.
            return new ParkingLotCreateService();
        } else if (instruction.contains("Park")) {  // to park a new car
            return new ParkingService();
        } else if (instruction.contains("Leave")) { // to vacate a slot
            return new LeaveService();
        } else if (instruction.contains("Slot_number_for_car_with_number")) {  // get slot number according to registration number
            return new SlotNumberForcarWithNumber();
        } else if (instruction.contains("Slot_numbers_for_driver_of_age")) {  // get slot numbers according to age of drivers.
            return new SlotNumbersForDriverOfAge();
        } else if (instruction.contains("Vehicle_registration_number_for_driver_of_age")) { // get registration numbers according to driver's age
            return new VehicleRegistrationNumberForDriverOfAge();
        } else {
            throw new Exception("No instruction found.");  // in case instruction is not readable or not proper.
        }

    }
}
